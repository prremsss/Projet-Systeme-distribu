package com.example.demo.services;

import com.example.demo.entities.Facturation;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.Grouped;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Materialized;
import org.apache.kafka.streams.kstream.TimeWindows;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.Date;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Service
public class FacturationService {

    int i=0;

    @Bean
    public Supplier<Facturation> facturationSupplier(){


        return ()->new Facturation(i++,Math.random()>0.5?"Oualid":"Miloudi",Math.random()*1000);


    }

    @Bean
    public Function<KStream<String,Facturation>,KStream<String,Long>> TotalFactures(){

        return (input)->{
            return input
                    .map((k,v)->new KeyValue<>("fact",0L))
                    .groupBy((k,v)->k, Grouped.with(Serdes.String(),Serdes.Long()))
                    .windowedBy(TimeWindows.of(Duration.ofMillis(5000)))
                    .count()
                    .toStream()
                    .map((k,v)->new KeyValue<>("Total des Factures en 5 second :", v));
        };

    }



    @Bean
    public Function<KStream<String,Facturation>,KStream<String,Double>> ClientFacture(){

        return (input)->input

                    .map((k,v)->new KeyValue<>(v.getName_clt(),v.getMontant()))
                    .groupBy((k,v)->k, Grouped.with(Serdes.String(),Serdes.Double()))
                    .reduce((c1,c2)->c1+c2)
                    .toStream()
                    .map((k,v)->new KeyValue<>("total des pour " + k + "  est  = ",v));


    }


}
