# Spring-boot-demo

Learning Spring boot by creating a demo project

### 1. Database
  - Added in-memory database like H2
  - Changed configuration to connect to Mysql DB

### 2. Spring boot body
  - Entity
  - Controller
  - Service
  - Repository

### 3. CRUD Operations
  - Creating entity to DB (Post)
  - Reading data from DB (Get)
  - Reading data by property name (Get)
  - Updating data in DB (Put)
  - Deleting data from DB (Delete)

### 4. Hibernate Validation
  - @NotBlank annotation with message
  - @Valid for validating the request body

### 5. Logger
  - Used SLF4J for logging

### 6. Lombok
  - Added @Data (for default getter-setter methods)
  - Added @NoArgsConstructor (for no argument constructor)
  - Added @AllArgsConstructor (for all arguments constructor)

### 7. Exception Handling
  - Custom error message (if data doesn't exist)

### 8. Testing
  - Service layer
  - Repository layer
  - Controller layer

### 9. Profiles
  - Added multiple profiles (dev, prod)

### 10. Actuator
  - Started with default endpoints (2)
  - Configured to see all endpoints (12)
  - Created a custom endpoint
