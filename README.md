# SpringBoot ActorDB Project

## Overview
The ActorDB project is a Spring Boot application designed to manage actor information. It includes functionalities to add, update, delete, and retrieve actor details. The project is structured into several packages, each with its specific responsibilities.

## Packages

### 1. `com.jsp.springboot.actor`
This is the root package of the application. It contains the main class that bootstraps the Spring Boot application.

- **SpringBootActorApplication.java**: The entry point of the Spring Boot application. It contains the `main` method which starts the application.

### 2. `com.jsp.springboot.actor.controller`
This package contains the REST controllers that handle HTTP requests and responses.

- **ActorController.java**: This controller provides endpoints to manage actor entities. It includes methods to add, update, delete, and retrieve actors.

### 3. `com.jsp.springboot.actor.entity`
This package contains the entity classes that represent the database tables.

- **Actor.java**: This is the entity class for the actor table. It includes fields like `actorId`, `actorName`, `age`, `industry`, and `nationality`.

### 4. `com.jsp.springboot.actor.repository`
This package contains the repository interfaces that provide CRUD operations for the entities.

- **ActorRepository.java**: This interface extends `JpaRepository` and provides methods to perform CRUD operations on the actor entity.

### 5. `com.jsp.springboot.actor.service`
This package contains the service classes that implement the business logic.

- **ActorService.java**: This service class contains the business logic for managing actors. It uses the `ActorRepository` to perform CRUD operations.

## Running the Application
To run the application, execute the `main` method in the `SpringBootActorApplication` class. This will start the embedded server and deploy the application.

```java
public static void main(String[] args) {
    SpringApplication.run(SpringBootActorApplication.class, args);
}
```

## Endpoints
The application exposes the following REST endpoints:

- `POST /actors`: Add a new actor
- `GET /actors`: Retrieve all actors
- `GET /actors/{id}`: Retrieve an actor by ID
- `PUT /actors/{id}`: Update an actor by ID
- `DELETE /actors/{id}`: Delete an actor by ID

## RESTful Web Service/API
The application follows RESTful design principles to provide a scalable and maintainable API. Each endpoint corresponds to a specific operation on the actor resource, and the HTTP methods (POST, GET, PUT, DELETE) are used to perform these operations. The API is designed to be stateless, meaning each request from a client contains all the information needed to process the request.

### Key Features of the RESTful API:
- **Resource-Based**: The API is centered around the actor resource.
- **Stateless**: Each request is independent and contains all necessary information.
- **Uniform Interface**: The API uses standard HTTP methods and status codes.
- **Client-Server Architecture**: The client and server are separate, allowing for independent development and scaling.

## Testing with Postman
Postman is a popular tool for testing REST APIs. You can use Postman to test the endpoints provided by this application.

1. **Add a new actor**
   - Method: POST
   - URL: `http://localhost:8080/actors`
   - Body: 
     ```json
     {
       "actorId": 101,
       "actorName": "Sudeep",
       "age": 45,
       "industry": "Sandalwood",
       "nationality": "Indian"
     }
     ```
### Postman Screenshots
![image](https://github.com/user-attachments/assets/e7744c39-f54e-4d29-bce1-a56c5e521521)


2. **Retrieve all actors**
   - Method: GET
   - URL: `http://localhost:8080/actors`
   - 
  ### Postman Screenshots
![image](https://github.com/user-attachments/assets/ce792d79-9e35-4c96-8a67-b0cca1987a9a)


3. **Retrieve an actor by ID**
   - Method: GET
   - URL: `http://localhost:8080/actors/{id}`

### Postman Screenshots
![image](https://github.com/user-attachments/assets/a36d26ef-bb1f-4f86-873c-1a18ecd61c50)



3. **Update an actor by ID**
   - Method: PUT
   - URL: `http://localhost:8080/actors/{id}`
   - Body: 
     ```json
     {
       "actorName": "Updated Name",
       "age": 46,
       "industry": "Updated Industry",
       "nationality": "Updated Nationality"
     }
     ```
### Postman Screenshots
![image](https://github.com/user-attachments/assets/581f8998-c575-46b1-9638-5183da40b5b1)



4. **Delete an actor by ID**
   - Method: DELETE
   - URL: `http://localhost:8080/actors/{id}`
  
### Postman Screenshots
![image](https://github.com/user-attachments/assets/c034bb7f-dc1c-4d2c-90df-45b7c4ffc1cc)


## Database
The application uses MySQL as the database to store actor information. Ensure that you have MySQL installed and configured before running the application.

### MySQL Database Screenshots
![image](https://github.com/user-attachments/assets/e7b0f86c-90e5-4151-b089-e9f4fe81cb04)


## Conclusion
This project demonstrates a basic Spring Boot application with a layered architecture, including controllers, services, repositories, and entities. It provides a foundation for building more complex applications with Spring Boot.
