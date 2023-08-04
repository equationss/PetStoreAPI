package User;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Get_User {

    @Test
    public void Get_User()
    {
        String username = "eq";

        // Sending the request and getting the response
        baseURI= "https://petstore.swagger.io/v2/";
        given().
                // Asserting the status code to be 200 for successful creation
                        get("user/" + username).then().statusCode(200).log().all();
    }
}
