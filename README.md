# MysqlConnection_Springboot


## 📖 Description

This is a simple Spring Boot project that demonstrates how to connect to a MySQL database and perform basic CRUD (Create, Read, Update, Delete) operations.

This project is tested using Postman to verify all API endpoints.

## ⚙️ Technologies Used

* Java
* Spring Boot
* MySQL
* Spring Data JPA
* Postman (for API testing)

## 🚀 Features

* MySQL database connection
* Perform CRUD operations
* REST API implementation
* API testing with Postman

## 🛠️ Setup Instructions

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/MysqlConnection_Springboot.git
   ```

2. Open the project in your IDE (IntelliJ / Eclipse)

3. Configure MySQL in `application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

4. Run the Spring Boot application

## 📡 API Endpoints

* **GET** `/get` → Retrieve all records
* **POST** `/add` → Add new record
* **PUT** `/update/{id}` → Update record by ID
* **DELETE** `/delete/{id}` → Delete record by ID

## 🧪 Testing

All endpoints are tested using Postman.

## 🎯 Purpose

This project is created to practice MySQL integration with Spring Boot and understand CRUD operations.

## 🙌 Author

**Jayalakshmi S**
🔗 GitHub: https://github.com/jayalakshmi-codes
