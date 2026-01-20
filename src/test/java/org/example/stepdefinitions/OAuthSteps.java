package org.example.stepdefinitions;

import io.cucumber.java.en.*;
import org.example.ConfigReader;

import java.util.Properties;

public class OAuthSteps {

    Properties config = ConfigReader.loadConfig("qa");
    String baseUrl = config.getProperty("base.url");


    @Given("OAuth server is available")
    public void oauth_server_is_available() {
        System.out.println("OAuth server is up");
    }

    @When("I request an access token")
    public void i_request_an_access_token() {
        System.out.println("Requesting token");
    }

    @Then("I should receive a valid token")
    public void i_should_receive_a_valid_token() {
        System.out.println("Token received");
    }
}
