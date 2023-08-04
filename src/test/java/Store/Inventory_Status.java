package Store;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Inventory_Status {

    @Test
    public void Status()
    {

        // Sending the POST request and getting the response
        baseURI= "https://petstore.swagger.io/v2/";
        given().
                // Asserting the status code to be 200 for successful creation
                        get("store/inventory").then().statusCode(200).log().all();



    }
}
