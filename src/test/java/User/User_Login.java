package User;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class User_Login {

    @Test
    public void Login()

    {
        String Username = "Junaid";
        String Password = "1122";

        // Sending the request and getting the response
        baseURI= "https://petstore.swagger.io/v2/";
        given().
                auth().basic(Username,Password).
                // Asserting the status code to be 200 for successful creation
                        get("user/login").then().statusCode(200).log().all();



    }
}
