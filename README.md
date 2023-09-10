# Marketplace
This is a microservices-based e-commerce platform developed using Spring Boot, Kafka, Spring Cloud, MongoDB, PostgreSQL, and other technologies.  
The project consists of various microservices designed to enable users to buy products and will eventually include notification, delivery, and shop services.  
  
# Architecture  
The project follows a microservices architecture pattern with the following components:  
  
API Gateway: Acts as the entry point for all client requests.  
Discovery Server (Eureka): Provides service discovery and registration.  
Inventory Service: Manages product inventory to ensure products are in stock.  
Order Service: Handles order processing.  
Product Service: Manages product data.  
(Future Services)  
Notification Service: Manages notifications to users.  
Delivery Service: Handles product deliveries.  
Shop Service: Allows users to open their own shops.  
  
# Microservices  
API Gateway: Responsible for routing requests to the appropriate microservices and providing a single entry point for clients.  
Discovery Server (Eureka): Handles service discovery and registration for all microservices.  
Inventory Service: Checks product availability and ensures items are in stock.  
Order Service: Manages the entire order processing workflow.  
Product Service: Provides information about available products.  
(Future Services)  
Notification Service: Sends notifications to users regarding orders and updates.  
Delivery Service: Manages the delivery process.  
Shop Service: Allows users to set up and manage their own shops.  
  
# Prerequisites  
Before you begin, ensure you have the following prerequisites:  
  
Docker and Docker Compose (for local deployment)  
Kubernetes (for Kubernetes deployment)  
Java Development Kit (JDK)  
Maven  
Kafka  
MongoDB  
PostgreSQL  

# Getting Started  
Clone the repository: git clone https://github.com/your-username/online-shop-microservices.git  
Build the microservices using Maven:  
cd online-shop-microservices  
mvn clean install  
Start the microservices and other required services (Kafka, MongoDB, PostgreSQL, etc.).  
docker-compose up -d  
  
# Configuration  
Configure the microservices by modifying their respective application.yml or application.properties files.  
These files are located in the src/main/resources directory of each microservice.  
  
Ensure you set the correct database and Kafka configurations, as well as any other service-specific configurations.  
