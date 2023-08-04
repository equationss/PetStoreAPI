package Pet;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Delete_Pet {

    @Test
    public void DeletePet(){

        String petId = "1";
            // Sending the request and getting the response
            baseURI= "https://petstore.swagger.io/v2/";
            given().delete("pet/" + petId )
                    // Asserting the status code to be 200 for successful creation
                    .then().statusCode(200).log().all();



    }
}
