package services;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.api.User;

import static io.restassured.RestAssured.given;

public class ApiRequestsUsers implements BasicService {
    private final String ENDPOINT = "users/";

    public User createUser(User user){
        String url =  URI + ENDPOINT + "2";

        Response response = given()
                .contentType(ContentType.JSON)
                .body(user)
                .post(url);
        if(response.statusCode() == 200)
            return response.as(User.class);

        return null;


    }
}
