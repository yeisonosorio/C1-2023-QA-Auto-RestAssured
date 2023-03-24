package com.sofkau.setup;

import io.restassured.RestAssured;
import org.apache.log4j.PropertyConfigurator;

import static com.sofkau.util.log4j.LOG4J_PROPERTIES_FILE_PATH;
import static io.cucumber.messages.internal.com.google.common.base.StandardSystemProperty.USER_DIR;

public class PhotoSetup {


    private static final String BASE_URI = "https://jsonplaceholder.typicode.com";
    private static final String BASE_PATH = "/photos";
    protected static final String GET_RESOURCE1 = "/1";
    protected static final String GET_RESOURCE2 = "/200";


    protected void generalSetup() {
        setUpLog4j2();
        setUpBases();
    }

    private void setUpLog4j2() {
        PropertyConfigurator.configure(USER_DIR.value() + LOG4J_PROPERTIES_FILE_PATH.getValue());
    }


    private void setUpBases() {
        RestAssured.baseURI = BASE_URI;
        RestAssured.basePath = BASE_PATH;

    }


}
