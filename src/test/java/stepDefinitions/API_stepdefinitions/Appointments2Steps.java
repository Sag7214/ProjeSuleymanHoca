package stepDefinitions.API_stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Appointments;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static utilities.Authentication2.generateToken;
import static utilities.WriteToTXT2.saveAppointmentsData;

public class Appointments2Steps {

    Appointments[] appointments;
    Response response;

    @Given("kullanici appointments icin get request yapar")
    public void kullanici_appointments_icin_get_request_yapar() {

        response = (Response) given().headers(
                        "Authorization",
                        "Bearer " + generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Apcent",
                        ContentType.JSON)
                .when().get(ConfigReader.getProperty("appointmentsa_endpoint"));


    }

    @Given("kullanici appointments bilgilerini deserialize eder")
    public void kullanici_appointments_bilgilerini_deserialize_eder() throws Exception {

        ObjectMapper obj = new ObjectMapper();
        appointments = obj.readValue(response.asString(), Appointments[].class);

    }

    @Then("kullanici appointments bilgilerini validate eder")
    public void kullanici_appointments_bilgilerini_validate_eder() {

        System.out.println(appointments.length);

        for (int i = 0; i < appointments.length; i++) {
            System.out.println( appointments[i].toString());   // eksik kaldi  yazamadim


                }
        saveAppointmentsData(appointments);


            }
        }













