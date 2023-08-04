package Pet;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Add_Pet {

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

        // Sending the request and getting the response
        baseURI= "https://petstore.swagger.io/v2/";
        given().
                header("Content-Type", "application/json").
                body(requestBody).
                // Asserting the status code to be 200 for successful creation
                        post("pet").then().statusCode(200);
    }

}
