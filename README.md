# Student Management API

A REST API built with Spring Boot, Hibernate JPA, MySQL and Docker.

## Tech Stack

- Java 17
- Spring Boot 4.0.6
- Spring Data JPA + Hibernate
- MySQL 8.0
- Docker + Docker Compose
- Maven

## Project Structure

```
src/main/java/com/example/studentapp/
├── controller/
│   └── StudentController.java
├── service/
│   └── StudentService.java
├── repository/
│   └── StudentRepository.java
├── model/
│   └── Student.java
└── exception/
    └── StudentNotFoundException.java
```
## Run with Docker

Make sure Docker Desktop is running, then:

```bash
docker-compose up --build
```

That's it! No need to install Java or MySQL locally.

## Run Locally

Requirements: Java 17, Maven, MySQL

```bash
# Create the database
mysql -u root -p
CREATE DATABASE studentdb;

# Run the app
mvn spring-boot:run
```

## API Endpoints

| Method | URL | Description |
|--------|-----|-------------|
| GET | /api/students | Get all students |
| GET | /api/students/{id} | Get student by ID |
| POST | /api/students | Create a student |
| PUT | /api/students/{id} | Update a student |
| DELETE | /api/students/{id} | Delete a student |
| GET | /api/students/department/{dept} | Filter by department |
| GET | /api/students/search?name= | Search by first name |
| GET | /api/students/age-range?min=&max= | Filter by age range |

## Example Request

```json
POST /api/students

{
    "firstName": "John",
    "lastName": "Doe",
    "email": "john@test.com",
    "department": "Computer Science",
    "age": 21
}
```

## Example Response

```json
{
    "id": 1,
    "firstName": "John",
    "lastName": "Doe",
    "email": "john@test.com",
    "department": "Computer Science",
    "age": 21
}
```