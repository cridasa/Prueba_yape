package com.yape.prueba.stepdefinitions;

import com.yape.prueba.questions.TextOf;
import com.yape.prueba.tasks.BookingAccommodation;
import com.yape.prueba.tasks.BookingData;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.yape.prueba.userinterface.HomePage.SPAN_PRICE;
import static com.yape.prueba.utils.Constants.getData;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class BookTripStepDefinitions {
    @Before
    public void setup() {
        setTheStage(new OnlineCast());
    }
    @Given("{string} Make a reservation in {string}")
    public void makeAReservationIn(String strActorName, String strUrl) {
        theActorCalled(strActorName).wasAbleTo(Open.url(getData(strUrl)));
    }
    @When("Enter a {string} the {string} date and the {string} date")
    public void enterADestinationTheDateAndTheDate(String destination, String initialDate,String finalDate) {
        theActorInTheSpotlight().wasAbleTo(BookingData.on(destination, initialDate, finalDate));
    }
    @When("Select {int}  for number {int} and number {int}")
    public void selectForNumberAndNumber(Integer room, Integer numberAdults, Integer numberChild) {
        theActorInTheSpotlight().wasAbleTo(BookingAccommodation.on(room, numberAdults, numberChild));
    }
    @Then("can display the {string} of the room")
    public void canDisplayTheOfTheRoom(String value) {
        theActorInTheSpotlight().should(seeThat(TextOf.field(SPAN_PRICE), equalTo(value)));
    }
}
