package com.yape.prueba.tasks;

import com.yape.prueba.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class BookingData implements Task {
    String destination;
    String initialDate;
    String finalDate;

    public BookingData(String destination, String initialDate, String finalDate) {
        this.destination = destination;
        this.initialDate = initialDate;
        this.finalDate = finalDate;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(destination).into(HomePage.INPUT_DESTINATION),
                Enter.theValue(initialDate).into(HomePage.INPUT_CHECK_IN),
                Enter.theValue(finalDate).into(HomePage.INPUT_CHECK_OUT),
                Click.on(HomePage.BUTTON_SEARCH)
        );
    }


    public static BookingData on(String destination, String initialDate, String finalDate) {
        return instrumented(BookingData.class, destination, initialDate, finalDate);
    }

}
