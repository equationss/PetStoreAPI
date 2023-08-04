package Store;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Place_Order {


    @Test
    public void New_Order()
    {

        String Body = "{\n" +
            "        \"id\": 0,\n" +
            "        \"petId\": 0,\n" +
            "        \"quantity\": 0,\n" +
            "        \"shipDate\": \"2023-08-02T10:12:26.082Z\",\n" +
            "        \"status\": \"placed\",\n" +
            "        \"complete\": true\n" +
            "     }";

    // Sending the request and getting the response
    baseURI= "https://petstore.swagger.io/v2/";
    given().
    header("Content-Type", "application/json").
    body(Body).
    // Asserting the status code to be 200 for successful creation
    post("store/order").then().statusCode(200);


    }

}
