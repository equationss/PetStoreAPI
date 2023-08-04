package Pet;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Find_Pet_ByStatus {

    String Status = "available";
    //String FindByStatus = "sold";
    //String FindByStatus = "pending";

    @Test
    public void FindByID() {
        // Sending the request and getting the response
        baseURI= "https://petstore.swagger.io/v2/";
        given().
                get("pet/findByStatus?status=" + Status )
                // Asserting the status code to be 200 for successful creation
                .then().statusCode(200);
    }
}
