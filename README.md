# Student Tasks API

Simple REST API built with Spring Boot for task management.

## Features
- Create tasks
- Read tasks
- Update tasks
- Delete tasks

## Tech
- Java
- Spring Boot
- Maven

## Endpoints

GET /tasks  
Returns all tasks.

GET /tasks/{id}  
Returns a task by id.

POST /tasks  
Creates a new task.

PUT /tasks/{id}  
Updates a task.

DELETE /tasks/{id}  
Deletes a task.

## Example request

POST /tasks

```json
{
  "id": 4,
  "title": "Write README",
  "completed": false
}
