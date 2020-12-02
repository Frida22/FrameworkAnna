package services;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

//TODO: all parameters setup in property files
public class Identity {

    public Identity() {
        RestAssured.baseURI = "https://elated-shirley-303f13.netlify.app/.netlify/";
    }

    public static Identity identity() {
        return new Identity();
    }

    public String getAccessToken() {
        return given()
                .queryParams("grant_type", "password")
                .queryParams("username", "carl.ganz@getgoodtree.com")
                .queryParams("password", "test")
                .when().post("identity/token")
                .then()
                .statusCode(200)
                .extract()
                .body().path("access_token");
    }
}
