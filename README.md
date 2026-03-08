# Student Tasks API

Simple REST API for task management built with Spring Boot.

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

## Features
- Create tasks
- Get all tasks
- Persist data with JPA
- In-memory database for development

## Example Endpoint

GET /tasks

Response:

[
  {
    "id": 1,
    "title": "Learn Spring Boot",
    "completed": false
  }
]

## Run the project

Clone the repo:

git clone https://github.com/giannishon27-max/student-tasks-api

Run:

mvn spring-boot:run

Open:

http://localhost:8080/tasks
