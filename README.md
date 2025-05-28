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

# Spring Boot Task API with TestNG Automation

This project is a lightweight Task Management REST API built with Spring Boot and tested using TestNG + RestAssured.

## Features

- ✅ CRUD operations on tasks (`/api/tasks`)
- 🔐 RESTful status codes (`200`, `201`, `204`, `404`)
- 🧪 TestNG + RestAssured-based API test suite
- 💡 Ideal for demonstrating test automation in Java ecosystems

## Run the App

```bash
./mvnw spring-boot:run
Run Tests
bash
Copy
Edit
mvn test
Folder Structure
src/main/java/... - Spring Boot REST API

src/test/java/... - TestNG API automation suite

This was built as part of interview preparation targeting QA and SDET roles at enterprise scale (ServiceNow, Palo Alto Networks).

yaml
Copy
Edit

---

### 3. 🔁 Push to GitHub
If remote is already set:

```bash
git add .
git commit -m "Add full TestNG API test suite"
git push origin main
