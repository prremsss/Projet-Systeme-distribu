package org.billingservice.billingservice.web;


import org.billingservice.billingservice.entities.Bill;
import org.billingservice.billingservice.feign.CustomerRestClient;
import org.billingservice.billingservice.feign.ProductItemRestClient;
import org.billingservice.billingservice.model.Customer;
import org.billingservice.billingservice.model.Product;
import org.billingservice.billingservice.repository.BillRepository;
import org.billingservice.billingservice.repository.ProductItemRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BillingRestController {
    private BillRepository billRepository;
    private ProductItemRepository productItemRepository;
    private CustomerRestClient customerRestClient;
    private ProductItemRestClient productItemRestClient;

    public BillingRestController(BillRepository billRepository, ProductItemRepository productItemRepository,
                                 CustomerRestClient customerRestClient, ProductItemRestClient productItemRestClient) {
        this.billRepository = billRepository;
        this.productItemRepository = productItemRepository;
        this.customerRestClient = customerRestClient;
        this.productItemRestClient = productItemRestClient;
    }

    @GetMapping(path = "/fullBill/{id}")
    public Bill getBill(@PathVariable(name = "id") Long id){
        Bill bill = billRepository.findById(id).get();
        Customer customer = customerRestClient.getCustomerById(bill.getCustomerID());
        bill.setCustomer(customer);
        bill.getProductItems().forEach(pi->{
            Product product = productItemRestClient.getProductById(pi.getProductID());
            pi.setProductName(product.getName());
        });
        return bill;
    }
}
