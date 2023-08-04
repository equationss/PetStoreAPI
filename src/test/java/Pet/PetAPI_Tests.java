package Pet;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.testng.Assert.assertEquals;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PetAPI_Tests {


    @Test
    public void AddNewPet() {
        // Request body
        String requestBody = "{\n" +
                "  \"id\": 0,\n" +
                "  \"category\": {\n" +
                "    \"id\": 0,\n" +
                "    \"name\": \"string\"\n" +
                "  },\n" +
                "  \"name\": \"doggie\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ]}";

        // Sending the POST request and getting the response
        baseURI= "https://petstore.swagger.io/v2/";
        given().
                header("Content-Type", "application/json").
                body(requestBody).
                // Asserting the status code to be 200 for successful creation
                        post("pet").then().statusCode(200);
    }
}
