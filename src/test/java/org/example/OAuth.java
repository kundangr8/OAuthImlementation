package org.example;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
public class OAuth {



        public static void main(String[] args) {



            String response =
                    given()
                            .contentType("application/x-www-form-urlencoded")
                            .formParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
                            .formParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
                            .formParam("grant_type", "client_credentials")
                            .formParam("scope", "trust")
                            .log().all()
                            .when()
                            .post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token")
                            .prettyPrint();

            System.out.println(response);

            JsonPath jsonPath = new JsonPath(response);
         String   accessToken=  jsonPath.getString("access_token");


    String response2 = given()
                 .queryParam("access_token", accessToken)
            .log().all()
                 .when()
                 .get("https://rahulshettyacademy.com/oauthapi/getCourseDetails")
            .prettyPrint();

            System.out.println(response2);
        }
    }


