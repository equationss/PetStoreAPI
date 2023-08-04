package User;

import org.testng.annotations.Test;

import java.lang.annotation.Target;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Delete_User {

    @Test
    public void Delete()
    {
        String username = "eq";
        // Sending the request and getting the response
        baseURI= "https://petstore.swagger.io/v2/";
        given().
                // Asserting the status code to be 200 for successful creation
                        delete("user/" + username).then().statusCode(200).log().all();


    }
}
