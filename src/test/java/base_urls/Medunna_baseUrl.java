package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class Medunna_baseUrl {

    protected static RequestSpecification spec;

    @Before
    public void setUp(){

        spec=new RequestSpecBuilder().setBaseUri("https://medunna.com").build();

    }



}
