# 🧠 Smart ERP System

Smart ERP is a modular, scalable ERP system built using **Spring Boot**, **PostgreSQL**, **Spring Security**, and **Swagger**. It’s designed to manage enterprise resources effectively, with a clean architecture, RESTful APIs, and extensible modules such as HR and Finance.

---

## 📦 Features

- ✅ Modular structure with clean package separation
- ✅ RESTful APIs with Spring Boot
- ✅ PostgreSQL as the primary relational database
- ✅ Integrated Swagger for API documentation
- ✅ Basic authentication with Spring Security
- ✅ Easy configuration using `application.yml`

---

## 🚀 Tech Stack

| Layer       | Technology               |
|-------------|--------------------------|
| Backend     | Spring Boot (v3.x)       |
| Database    | PostgreSQL               |
| Security    | Spring Security (Basic)  |
| API Docs    | Springdoc OpenAPI (Swagger UI) |
| Build Tool  | Maven                    |
| Dev Tools   | Spring Boot DevTools     |

---

## 🛠️ Getting Started

### ✅ Prerequisites

- Java 17+
- Maven 3.6+
- PostgreSQL running locally

### 🔧 Configuration (`application.yml`)

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/erpdb
    username: postgres
    password: root
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate.format_sql: true

spring.security.user.name: admin
spring.security.user.password: admin123
💡 Replace credentials as needed.

▶️ Running the Application
bash
Copy
Edit
./mvnw spring-boot:run
Or via your IDE's Run button.

🔐 Authentication
All endpoints are protected by Basic Auth, except for Swagger documentation.

Username: admin

Password: admin123

📘 API Documentation (Swagger)
Once the application is running, open:

bash
Copy
Edit
http://localhost:8080/swagger-ui.html
You may be prompted to enter your basic auth credentials.

📁 Project Structure
bash
Copy
Edit
com.frhd.smarterp
├── config             # Security and Swagger configuration
├── controller         # REST Controllers
├── dto               # Data Transfer Objects
├── entity             # JPA Entities
├── repository         # Spring Data Repositories
├── service            # Business logic
└── SmartErpApplication.java
📌 TODO (Optional Enhancements)
 Add JWT-based authentication

 Implement HR module (employees, departments)

 Add role-based access control (RBAC)

 Integrate test coverage reports

 Add Docker support

