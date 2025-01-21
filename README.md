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
     ![Screenshot 2025-01-21 143334](https://github.com/user-attachments/assets/5da8a8ba-ad4f-43d7-bab0-aaaf40e0c096)


2. **Retrieve all actors**
   - Method: GET
   - URL: `http://localhost:8080/actors`
  
   - ![Screenshot 2025-01-21 143410](https://github.com/user-attachments/assets/8a045506-5bc2-4bb0-bbe2-5d635e3f56a0)


3. **Retrieve an actor by ID**
   - Method: GET
   - URL: `http://localhost:8080/actors/{id}`
  
   - ![Screenshot 2025-01-21 164932](https://github.com/user-attachments/assets/edb1f136-907f-47f8-ba1d-8b55739a2d21)


4. **Update an actor by ID**
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
     ![Screenshot 2025-01-21 164944](https://github.com/user-attachments/assets/b00524f2-afc5-416a-a423-ffd8b02a384d)


5. **Delete an actor by ID**
   - Method: DELETE
   - URL: `http://localhost:8080/actors/{id}`
  
   - ![Screenshot 2025-01-21 164932](https://github.com/user-attachments/assets/24d50e81-4121-42ce-ad6c-23b9c8c9e47c)


## Conclusion
This project demonstrates a basic Spring Boot application with a layered architecture, including controllers, services, repositories, and entities. It provides a foundation for building more complex applications with Spring Boot.
