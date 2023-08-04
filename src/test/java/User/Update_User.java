package User;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Update_User {

    @Test
    public void Update()
    {
        String username = "eq";
        String Body = "{ \"id\": 5,\n" +
                "            \"username\": \"eq\",\n" +
                "            \"firstName\": \"Junaid\",\n" +
                "            \"lastName\": \"Raja\",\n" +
                "            \"email\": \"jaudfef@fdgr.egfr\",\n" +
                "            \"password\": \"Junaid\",\n" +
                "            \"phone\": \"+8486454\",\n" +
                "            \"userStatus\": 5 }";

        // Sending the request and getting the response
        baseURI= "https://petstore.swagger.io/v2/";
        given().header("Content-Type", "application/json").
                body(Body).
                // Asserting the status code to be 200 for successful creation
                        put("user/" + username).then().statusCode(200).log().all();


    }
}
