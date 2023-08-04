package User;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Array_User {

    @Test
    public void Array()
    {
        String Body = "[{\n" +
                "\n" +
                "            \"id\": 5,\n" +
                "            \"username\": \"eq\",\n" +
                "            \"firstName\": \"Junaid\",\n" +
                "            \"lastName\": \"Junaid\",\n" +
                "            \"email\": \"jaudfef@fdgr.egfr\",\n" +
                "            \"password\": \"Junaid\",\n" +
                "            \"phone\": \"+8486454\",\n" +
                "            \"userStatus\": 5 }] ," +
                "[{\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"            \\\"id\\\": 3,\\n\" +\n" +
                "                \"            \\\"username\\\": \\\"eq\\\",\\n\" +\n" +
                "                \"            \\\"firstName\\\": \\\"dgdgs\\\",\\n\" +\n" +
                "                \"            \\\"lastName\\\": \\\"Junaid\\\",\\n\" +\n" +
                "                \"            \\\"email\\\": \\\"fdgd@fdgr.egfr\\\",\\n\" +\n" +
                "                \"            \\\"password\\\": \\\"fdfwdf\\\",\\n\" +\n" +
                "                \"            \\\"phone\\\": \\\"+8486454\\\",\\n\" +\n" +
                "                \"            \\\"userStatus\\\": 3 }]";

        // Sending the request and getting the response
        baseURI= "https://petstore.swagger.io/v2/";
        given().header("Content-Type", "application/json").
                body(Body).
                // Asserting the status code to be 200 for successful creation
                        post("user/createWithArray").then().statusCode(200).log().all();


    }
}
