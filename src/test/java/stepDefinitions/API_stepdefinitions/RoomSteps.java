package stepDefinitions.API_stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Room1;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;

public class RoomSteps {

    Response response;
    String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJtZWR1bm5hdGVhbTYyIiwiYXV0aCI6" +
            "IlJPTEVfQURNSU4iLCJleHAiOjE2NTk5NzMzMTB9.I9dvz3w5F-" +
            "lIKqEhefabS2laSZHfIkE-sQj_zykalOvQMGvyW_P6M6eKPggM1HiKGojXqbPoPQ49aCNSyt8pJQ ";

    Room1[] rooms;

    @Given("kullanici roomlar icin get request yapar")
    public void kullanici_roomlar_icin_get_request_yapar() {


        response = given().headers(
                "Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get(ConfigReader.getProperty("room_endpoint"));
        response.then().assertThat().statusCode(200);
             //   response.prettyPrint();


    }
    @Given("kullanici gelen room detayi deserialize eder")
    public void kullanici_gelen_room_detayi_deserialize_eder() throws Exception{

        ObjectMapper obj = new ObjectMapper();
        rooms = obj.readValue(response.asString(),Room1[].class);

        System.out.println("kac tane room objesi var =" + rooms.length);
        for(int i = 0; i< rooms.length; i++){

            System.out.println(rooms[i].getDescription());
            System.out.println(rooms[i].getRoomNumber());

        }



    }
    @Then("kullanici room datasini validate eder")
    public void kullanici_room_datasini_validate_eder() {

    }
}
