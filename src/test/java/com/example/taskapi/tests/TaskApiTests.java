package com.example.taskapi.tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class TaskApiTests extends BaseTest {

    @Test
    public void getAllTasks_shouldReturnSuccess() {
        when()
                .get("/api/tasks")
                .then()
                .statusCode(200)
                .body("size()", greaterThanOrEqualTo(0));
    }

    @Test
    public void createTask_shouldSucceed() {
        given()
                .header("Content-Type", "application/json")
                .body("{ \"title\": \"New Task\", \"description\": \"TestNG task\" }")
                .when()
                .post("/api/tasks")
                .then()
                .statusCode(201)
                .body("title", equalTo("New Task"));
    }

    @Test
    public void updateTask_shouldSucceed() {
        // First, create a task to ensure it exists
        int taskId =
                given()
                        .header("Content-Type", "application/json")
                        .body("{ \"title\": \"Original Task\", \"description\": \"Created for update\" }")
                        .when()
                        .post("/api/tasks")
                        .then()
                        .statusCode(201)
                        .extract()
                        .path("id"); // extract the ID from response

        // Then, update that specific task
        given()
                .header("Content-Type", "application/json")
                .body("{ \"title\": \"Updated Task\", \"description\": \"Updated via test\" }")
                .when()
                .put("/api/tasks/" + taskId)
                .then()
                .statusCode(200)
                .body("title", equalTo("Updated Task"));
    }


    @Test
    public void deleteTask_shouldReturn204() {
        // First, create a task to ensure it exists
        int taskId =
                given()
                        .header("Content-Type", "application/json")
                        .body("{ \"title\": \"Original Task\", \"description\": \"Created for update\" }")
                        .when()
                        .post("/api/tasks")
                        .then()
                        .statusCode(201)
                        .extract()
                        .path("id"); // extract the ID from response
        when()
                .delete("/api/tasks/" + taskId)
                .then()
                .statusCode(204);
    }

}
