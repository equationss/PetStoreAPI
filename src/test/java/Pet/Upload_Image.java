package Pet;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Upload_Image {

    @Test
    public void Uplaod_Image() {


        {
            String Path = "C:/Users/junai/Desktop/F.png";
            String petId = "1";

            // Sending the request and getting the response
            baseURI = "https://petstore.swagger.io/v2/";
            given().
                    header("Content-Type", "multipart/form-data")
                .multiPart("additionalMetadata", "0100")

                    .multiPart("file", new java.io.File(Path)).
                    when().
                    // Asserting the status code to be 200 for successful creation
            post("pet/" + petId + "/uploadImage").then().statusCode(200);

        }


    }
}
