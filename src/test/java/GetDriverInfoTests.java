import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static services.Identity.identity;

public class GetDriverInfoTests {

    @Test
    void getDriverInfoPositive(){
        String accessToken = identity().getAccessToken();

        given()
                .auth()
                .oauth2(accessToken)
                .when()
                .get("https://elated-shirley-303f13.netlify.app/.netlify/functions/getDriverInfo")
                .then()
                .statusCode(200);
    }

}
