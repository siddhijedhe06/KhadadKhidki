# KhadadKhidki

# 🍴 Khadad Khidki – Online Food Delivery Platform

**Khadad Khidki** is a simple **Online Food Delivery Platform** developed as a college project. The application allows users to explore food items, register/login, and place food orders through an easy-to-use web interface.

The project is developed using **Java, HTML, CSS, DBMS, and SQL** and demonstrates the basic concepts of web development, Java Servlets, database connectivity, and user management.

---

## 📌 Project Overview

Khadad Khidki provides a platform where users can:

* 🏠 View the home page
* 🍕 Browse available food items
* 👤 Register as a new user
* 🔐 Login using registered credentials
* 🛒 Select/order food items
* ✅ Receive order confirmation
* 💾 Store user information in a database

The project focuses on implementing a basic food delivery workflow using Java and a relational database.

---

## 🎯 Objectives

The main objectives of Khadad Khidki are:

1. To develop a simple online food ordering platform.
2. To provide user registration and login functionality.
3. To display food items in an organized manner.
4. To allow users to place food orders.
5. To store and manage user data using a database.
6. To understand Java-based web application development.
7. To demonstrate the use of SQL and DBMS concepts.

---

## 🛠️ Technologies Used

| Technology        | Purpose                                   |
| ----------------- | ----------------------------------------- |
| **Java**          | Backend development and application logic |
| **HTML**          | Structure of web pages                    |
| **CSS**           | Styling and page design                   |
| **JSP**           | Dynamic web pages                         |
| **Java Servlets** | Handling requests and responses           |
| **MySQL**         | Database management                       |
| **SQL**           | Database operations                       |
| **Apache Tomcat** | Web application server                    |

---

## ✨ Features

### 🏠 Home Page

Provides an introduction to the Khadad Khidki platform along with navigation options.

### 🍔 Food Menu

Users can view different food items available for ordering.

### 📝 User Registration

New users can create an account by providing their required details.

### 🔐 User Login

Registered users can log in using their credentials.

### 🍽️ Food Ordering

Users can select a food item and place an order.

### ✅ Order Confirmation

After placing an order, the application displays an order confirmation message.

### 💾 Database

User registration and login information is stored in a MySQL database.

---

## 📂 Project Structure

```text
KhadadKhidki/
│
├── WebContent/
│   ├── index.html
│   ├── menu.html
│   ├── login.jsp
│   ├── register.jsp
│   ├── css/
│   │   └── style.css
│   └── images/
│
├── WEB-INF/
│   ├── web.xml
│   ├── classes/
│   │   ├── LoginService.java
│   │   ├── RegisterService.java
│   │   └── ...
│   │
│   └── lib/
│       └── mysql-connector-j.jar
│
└── README.md
```

---

## 🗄️ Database

The project uses **MySQL** as the database.

Example database:

```sql
CREATE DATABASE fooddb;
```

Example user table:

```sql
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    password VARCHAR(100)
);
```

The database is used to store and retrieve user information during registration and login.

---

## ⚙️ How to Run the Project

### 1. Install Required Software

Make sure the following are installed:

* JDK
* Apache Tomcat
* MySQL
* MySQL Workbench
* Eclipse IDE or another Java IDE

### 2. Create Database

Open MySQL Workbench and create the database:

```sql
CREATE DATABASE fooddb;
```

Create the required tables using the SQL queries provided in the project.

### 3. Configure MySQL

Update the database connection details in the Java code:

```java
String url = "jdbc:mysql://localhost:3306/fooddb";
String username = "root";
String password = "your_password";
```

### 4. Add MySQL Connector

Add the MySQL Connector/J `.jar` file to:

```text
WEB-INF/lib/
```

### 5. Configure Apache Tomcat

Add the project to Apache Tomcat and start the server.

### 6. Run the Application

Open the browser and visit:

```text
http://localhost:8080/KhadadKhidki/
```

---

## 🔄 Application Workflow

```text
          ┌───────────────┐
          │     Home      │
          └───────┬───────┘
                  │
          ┌───────▼───────┐
          │     Menu      │
          └───────┬───────┘
                  │
          ┌───────▼───────┐
          │ Login/Register │
          └───────┬───────┘
                  │
          ┌───────▼───────┐
          │ Select Food   │
          └───────┬───────┘
                  │
          ┌───────▼───────┐
          │ Place Order   │
          └───────┬───────┘
                  │
          ┌───────▼────────────┐
          │ Order Confirmation │
          └────────────────────┘
```

---

## 📚 Concepts Demonstrated

This project demonstrates the following concepts:

* Java Programming
* Object-Oriented Programming
* Java Servlets
* JSP
* HTML
* CSS
* HTTP Request and Response
* Form Handling
* User Authentication
* MySQL Database
* SQL Queries
* CRUD Operations
* Database Connectivity
* Session Management
* Client-Server Architecture

---

## 🎯 Future Scope

The project can be enhanced in the future by adding:

* 🛒 Shopping cart
* 💳 Online payment
* 📍 Live order tracking
* 🚴 Delivery partner module
* ⭐ Food ratings and reviews
* 🔔 Order notifications
* 🔎 Food search and filtering
* 👨‍💼 Admin dashboard
* 📊 Sales and order analytics
* 📱 Mobile application

---

## 👩‍💻 Developer

**Siddhi Jedhe**

BE – Computer Science & Engineering (Artificial Intelligence & Machine Learning)

---

## 📄 License

This project was developed for **educational and academic purposes**.
