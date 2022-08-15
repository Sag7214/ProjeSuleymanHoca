package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication {



    public static String generateToken(String username, String password){

        RequestSpecification spec;
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("base_url")).build();

        spec.pathParams("first", "api", "second", "authenticate");

        //Set the expected data

        Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("username", username);
        expectedData.put("password", password);
        expectedData.put("rememberMe","true" );

        //Send the Post request and get the data
        Response response = given().spec(spec).contentType(ContentType.JSON).
                body(expectedData).when().post("/{first}/{second}");

        response.prettyPrint();
        JsonPath json = response.jsonPath();



        return json.getString("id_token");

    }

    public static String generateToken(){

        RequestSpecification spec;
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("base_url")).build();

        spec.pathParams("first", "api", "second", "authenticate");

        //Set the expected data

        Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("username", "Team94Admin");
        expectedData.put("password", "Batch44+");
        expectedData.put("rememberMe","true" );

        //Send the Post request and get the data
        Response response = given().spec(spec).contentType(ContentType.JSON).
                body(expectedData).when().post("/{first}/{second}");

        response.prettyPrint();
        JsonPath json = response.jsonPath();



        return json.getString("id_token");

    }



}