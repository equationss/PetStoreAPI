package User;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class User_Logout {

    @Test
    public void Logout()
    {
        // Sending the request and getting the response
        baseURI= "https://petstore.swagger.io/v2/";
        given().
                // Asserting the status code to be 200 for successful creation
                        get("user/logout").then().statusCode(200).log().all();



    }
}
