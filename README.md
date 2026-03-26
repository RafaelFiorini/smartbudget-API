📄 README — SmartBudget API
# 💰 SmartBudget API

REST API for personal financial management built with **Java and Spring Boot**.

This project allows users to track financial transactions, categorize them as income or expenses, and calculate the current balance.

## 🚀 Technologies

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven
- Lombok
- Swagger / OpenAPI
- Postman (API testing)

---

## 📦 Features

- Create financial transactions
- List all transactions
- Calculate current balance
- Categorize transactions as **INCOME** or **EXPENSE**
- RESTful API architecture
- Exception handling with `@RestControllerAdvice`
- DTO layer for API responses

---

## 🏗️ Project Structure


src/main/java/com/rafael/smartbudget

controller
└─ TransactionController

service
└─ TransactionService

repository
└─ TransactionRepository

model
└─ Transaction

dto
└─ TransactionDTO

exception
├─ ResourceNotFoundException
└─ GlobalExceptionHandler


---

## 🗄️ Database

The project uses **MySQL**.

Example database creation:

-sql
CREATE DATABASE smartbudget;

Example application.properties configuration:

spring.datasource.url=jdbc:mysql://localhost:3306/smartbudget
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
🔌 API Endpoints
Get all transactions
GET /transactions
Create transaction
POST /transactions

Example request body:

{
  "description": "Salary",
  "amount": 5000,
  "type": "INCOME",
  "date": "2025-03-20"
}
Get balance
GET /transactions/balance

Example response:

3500.00
🧪 Testing

Endpoints were tested using Postman.

▶️ Running the Project

Clone the repository:

git clone https://github.com/yourusername/smartbudget-api.git

Run the project:

mvn spring-boot:run

The API will be available at:

http://localhost:8080
📚 API Documentation

If Swagger is enabled:

http://localhost:8080/swagger-ui.html
🎯 Purpose

This project was developed as part of my backend portfolio to demonstrate:

REST API development
layered architecture
database integration with JPA
exception handling
clean project structure
👨‍💻 Author

Rafael Henrique Fiorini

Backend Developer | Java | Spring Boot

GitHub:
https://github.com/RafaelFiorini
