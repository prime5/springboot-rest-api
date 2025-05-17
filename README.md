# Spring Boot REST API

A simple RESTful web service built with Spring Boot. This project demonstrates how to create a basic API with endpoints for handling HTTP requests.

## Features

- Spring Boot 3.x
- RESTful endpoints
- Maven build system
- Java 17+
- Easy to extend

## Getting Started

### Prerequisites
- Java 17 or higher
- Maven 3.x

### Run locally

```bash
mvn spring-boot:run
API Endpoints
Method	Endpoint	Description
GET	/api/hello	Returns a greeting
Project Structure
css
Copy
Edit
src/
 └── main/
     └── java/
         └── com/example/demo/
             ├── controller/
             └── Application.java

License
This project is licensed under the MIT License.

yaml
Copy
Edit

---

### ✅ Next Steps

1. Create a file in your project root:
   ```bash
   touch README.md
Paste the content above and save it.

Add, commit, and push:

bash
Copy
Edit
git add README.md
git commit -m "Add project README"
git push

Or run TaskApiApplication.java directly from your IDE.

API Endpoints
Method	Endpoint	Description
GET	/api/tasks	Get all tasks
POST	/api/tasks	Create a new task
GET	/api/tasks/{id}	Get task by ID
PUT	/api/tasks/{id}	Update task
DELETE	/api/tasks/{id}	Delete task

H2 Console
URL: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: (leave blank)

License
This project is open-sourced under the MIT License.

yaml
Copy
Edit

---

### ✅ Step 2: Commit the Updated README

```bash
git add README.md
git commit -m "Add usage and endpoint info to README"
git push
