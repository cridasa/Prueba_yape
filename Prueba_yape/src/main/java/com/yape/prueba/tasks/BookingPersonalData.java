package com.yape.prueba.tasks;

import com.yape.prueba.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class BookingPersonalData implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(HomePage.BUTTON_SEE_AVAILABILITY),
                Click.on(HomePage.SELECT_AMOUNT),
                Click.on(HomePage.SELECT_ONE_AMOUNT),
                Click.on(HomePage.BUTTON_RESERVE),
                Enter.theValue("Felipe").into(HomePage.INPUT_NAME),
                Enter.theValue("Contreras").into(HomePage.INPUT_LASTNAME),
                Enter.theValue("Felipecontreras@gmail.com").into(HomePage.INPUT_EMAIL),
                Click.on(HomePage.CHECKBOX_BOOKING),
                Enter.theValue("Felipe Contreras").into(HomePage.INPUT_NAME_GUEST),
                Click.on(HomePage.BUTTON_NEXT_STEP),
                Enter.theValue("3134535221").into(HomePage.INPUT_TELEPHONE),
                Enter.theValue("Felipe Contreras C").into(HomePage.INPUT_HOLDER_TC),
                Click.on(HomePage.SELECT_TYPE_TC),
                Click.on(HomePage.OPTION_MASTERCARD),
                Enter.theValue("5632 3232 1356 7422").into(HomePage.INPUT_NUMBER_TC),
                Enter.theValue("832").into(HomePage.INPUT_CODE_CVC_TC)
        );
    }


    public static BookingPersonalData on() {
        return instrumented(BookingPersonalData.class);
    }

}
