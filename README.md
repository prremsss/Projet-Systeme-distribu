# Projet-Systeme-distribu-
Partie 1 : Les Micro-services
a-Customer Service
-Base de donnée 

![Customer db](https://user-images.githubusercontent.com/31516436/173162577-8b0d5cd3-e4f4-4206-b7d4-fe6424c164c8.jpg)

-consultation des customers

![2-consultation des customers](https://user-images.githubusercontent.com/31516436/173162594-8da4de75-2449-455e-b391-6f405b243e65.jpg)

-Ajout d'un consomateur

![3-Ajout d'un consomateur](https://user-images.githubusercontent.com/31516436/173162605-083a638b-61d2-4701-85da-bbf4f0350090.jpg)

-Consultation des customers en utilisant le Gateway et eureka

![utilisation de gateway et eureka](https://user-images.githubusercontent.com/31516436/173162732-6859c2e2-e308-4337-948d-196f7f72f33a.jpg)

b-Inventory Service

-Liste des produits

![products list](https://user-images.githubusercontent.com/31516436/173162628-14c06714-c8a1-49f6-92a5-9ba05c2a94d6.jpg)

-Consultation des produits en utilisant le Gateway et eureka

![utilisation de gateway et eureka 2](https://user-images.githubusercontent.com/31516436/173162741-44693597-0e59-4f0e-8704-0a6268f4ef78.jpg)

c-Billing service

-Base de donnée

![Billing db](https://user-images.githubusercontent.com/31516436/173162663-0f450f65-2549-4236-8b7f-5f825c8544e6.jpg)

-Consultation des factures en utilisant le Gateway et eureka

![Consultation des facture depuis gateway](https://user-images.githubusercontent.com/31516436/173162759-19d66df9-e8eb-4779-bac2-09d0f491d03d.jpg)

e-Eureka

![Eureka](https://user-images.githubusercontent.com/31516436/173162775-3618c9b9-549d-4f5f-a46d-49450fd15e86.jpg)


Partie 2 : Keycloak 

a- Mise en place du serveur Keycloak 

![image](https://user-images.githubusercontent.com/31516436/174909388-41171f7d-df64-4598-af27-fef1ac738c92.png)

b-Creation du REALM 

![s1-creation d'un realm](https://user-images.githubusercontent.com/31516436/174909447-4327601a-21d1-42f9-90e7-9597fe53761c.jpg)

c-Création du client à sécuriser 

![image](https://user-images.githubusercontent.com/31516436/174909772-b466a7ea-bead-4fd8-9d17-5686ebb4400b.png)

d-Création des roles

![s2-creation de roles](https://user-images.githubusercontent.com/31516436/174909501-38073674-93cf-4020-b948-e2622dcfd453.jpg)

e-Création des utilisateurs

![s3-creation des utilisateurs](https://user-images.githubusercontent.com/31516436/174910026-b8034cca-a05d-4d9e-8350-29f70e95c836.jpg)

f-Affectation des roles 

-affectation de user

![s4-affectation de user](https://user-images.githubusercontent.com/31516436/174910068-7baeb069-32d8-420d-84ca-e46fd69d0c8c.jpg)


-billing manager role

![s5-billing manager roles](https://user-images.githubusercontent.com/31516436/174910088-833011e1-f205-4841-9784-5cdc0b81ab36.jpg)

-customer manager role

![s6-customer manager role](https://user-images.githubusercontent.com/31516436/174910105-3024d82c-20c2-4e39-a934-7acf9d2339a6.jpg)

-product manager role

![s7-product manager role](https://user-images.githubusercontent.com/31516436/174910129-43031d21-7ad6-4312-8904-93b4eca47c17.jpg)

-admin role

![s8-admin role](https://user-images.githubusercontent.com/31516436/174910152-3d8008e9-4900-4b30-8275-3862f7f3b6ba.jpg)


g-authentification de user 1 par mdp

![s9-authentification de user 1 par mdp](https://user-images.githubusercontent.com/31516436/174910186-f2998290-3537-4925-b33e-b62698762f9c.jpg)

h-authentification de user 1 par refresh token

![s9-authentification de user 1 par refresh token](https://user-images.githubusercontent.com/31516436/174910206-a810f883-61ca-45de-ba18-3bd31566499d.jpg)

i-personalisation des timeout

![s11-timeout](https://user-images.githubusercontent.com/31516436/174910244-935b3676-e195-411b-ba93-ead7b7b0351e.jpg)

![s10-personalisation des timeout](https://user-images.githubusercontent.com/31516436/174910251-2a11dff3-a4bd-4260-bc85-4d99f8cfc633.jpg)


Partie 3: Kafka

b-un micro-service Spring Boot qui permet de simuler un Producer KAFKA qui 
permet d’envoyer à un tompic « FACTURATION » à chaque seconde un message 
contenant le numéro de la facture, le nom du client et le montant de la facture.

![kafka suplier chaque seconde](https://user-images.githubusercontent.com/31516436/174910332-52e5f05b-7b26-4994-85ff-409593d5e828.jpg)

d-un Micro-service de Real Time Data Analytics en mode Stream Processing 
utilisant KAFKA Streams qui permet de traiter en temps réel les messages du Topic 
« FACTURATION » en produisant des statistiques comme Le Total des factures reçus 
pour les 5 dernières secondes et le total des factures de chaque client.

-Totale des factures chaque 5 secondes 

![kafka totale des factures en 5 seconde](https://user-images.githubusercontent.com/31516436/174910422-d4fdba39-fc6a-47b0-9c01-de75fbc27d1e.jpg)

-Totale des factures pour chaque client 

![kafka totale des factures pour chaque client](https://user-images.githubusercontent.com/31516436/174910462-c9061dfe-181a-4b95-901b-d205ce75858a.jpg)

 Fin!



