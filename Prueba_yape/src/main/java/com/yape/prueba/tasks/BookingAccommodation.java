package com.yape.prueba.tasks;

import com.yape.prueba.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class BookingAccommodation implements Task {
    Integer room;
    Integer adults;
    Integer child;

    public BookingAccommodation(Integer room, Integer adults, Integer child) {
        this.room = room;
        this.adults = adults;
        this.child = child;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(HomePage.BUTTON_OCCUPANCY),
                Click.on(HomePage.BUTTON_PLUS_ADULTS),
                Click.on(HomePage.BUTTON_PLUS_CHILD),
                Click.on(HomePage.BUTTON_DONE)
        );
    }


    public static BookingAccommodation on(Integer room, Integer adults, Integer child) {
        return instrumented(BookingAccommodation.class, room, adults, child);
    }

}
