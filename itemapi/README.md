# Mini Flipkart – Item Management Application

## Overview
Mini Flipkart is a Spring Boot application that provides a RESTful API to manage a collection of products.  
It also includes a simple frontend UI built using Thymeleaf to display and manage products.

This project was developed as part of a Freelance Java Developer sample task.

---

## Technologies Used
- Java 17
- Spring Boot
- Spring MVC
- Thymeleaf
- Maven
- HTML & CSS

---

## Features
- Add new items
- View all items
- View item by ID
- Delete items
- In-memory storage using ArrayList
- Simple Flipkart-style UI

---

## REST API Endpoints

- **POST** `/items` – Add a new item  
- **GET** `/items` – Get all items  
- **GET** `/items/{id}` – Get item by ID  
- **DELETE** `/items/{id}` – Delete item  

---

## How to Run

1. Import the project into Eclipse or any Java IDE  
2. Run `ItemapiApplication.java`  
3. Open browser and visit:
http://localhost:8081/products## Notes
- The application uses in-memory storage, so data resets on restart.
- APIs can be tested using Postman.

---

## Author
Hamsa Prakash