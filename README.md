# User Management REST API

A simple Spring Boot REST API application for managing users. This project demonstrates the implementation of RESTful services using Spring Boot, layered architecture, and in-memory data storage.

## Technologies Used

* Java 17
* Spring Boot 3.3.5
* Maven
* REST APIs
* Swagger/OpenAPI
* IntelliJ IDEA
* Git & GitHub

## Project Structure

```text
src/main/java
└── in.Rama.usermanagement
    ├── controller
    │   └── UserController.java
    ├── service
    │   └── UserService.java
    ├── dto
    │   └── UserDto.java
    ├── datastore
    │   └── UserStore.java
    └── UsermanagementApplication.java
```

## Features

* Create User
* Get All Users
* Get User By ID
* RESTful API Design
* Swagger Documentation
* Layered Architecture (Controller → Service → Data Store)

## API Endpoints

### Create User

```http
POST /api/v1/users
```

Request Body:

```json
{
  "name": "John Doe",
  "email": "john@example.com"
}
```

### Get All Users

```http
GET /api/v1/users
```

### Get User By ID

```http
GET /api/v1/users/{id}
```

Example:

```http
GET /api/v1/users/1
```

## Running the Application

Clone the repository:

```bash
git clone https://github.com/RamadeviKesana/UserManagement.git
```

Navigate to the project directory:

```bash
cd UserManagement
```

Run the application:

```bash
mvn spring-boot:run
```

Or run directly from IntelliJ IDEA using:

```text
UsermanagementApplication.java
```

## Application URL

```text
http://localhost:8080
```

## Swagger UI

```text
http://localhost:8080/swagger-ui/index.html
```

## Sample Response

```json
[
  {
    "id": 1,
    "name": "John Doe",
    "email": "john@example.com"
  }
]
```

## Author

Ramadevi Kesana

GitHub: https://github.com/RamadeviKesana
