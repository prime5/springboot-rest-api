package com.example.taskapi.tests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "http://localhost:8080"; // or your actual server port
    }
}

