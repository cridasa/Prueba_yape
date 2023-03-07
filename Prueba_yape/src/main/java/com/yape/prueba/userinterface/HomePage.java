package com.yape.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static Target INPUT_DESTINATION = Target.the("input destino a donde vas?").locatedBy("//input[@id=':Ra9:']");

    public static Target INPUT_CHECK_IN = Target.the("input check in").locatedBy("//button[contains(text(),'Check-in date')]");

    public static Target INPUT_CHECK_OUT = Target.the("input check out").locatedBy("//button[contains(text(),'Check-out date')]");

    public static Target BUTTON_OCCUPANCY = Target.the("Boton ocupacion").locatedBy("//button[@data-testid='occupancy-config']");

    public static Target BUTTON_PLUS_ADULTS = Target.the("Boton mas adultos").locatedBy("//body/div[@id='indexsearch']/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]");

    public static Target BUTTON_PLUS_CHILD = Target.the("Boton mas niños").locatedBy("//body/div[@id='indexsearch']/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[2]");

    public static Target BUTTON_DONE = Target.the("Boton listo").locatedBy("//span[contains(text(),'Listo')]");

    public static Target BUTTON_SEARCH = Target.the("Boton buscar").locatedBy("//span[contains(text(),'Buscar')]");

    public static Target BUTTON_SEE_AVAILABILITY = Target.the("Boton ver disponibilidad").locatedBy("(//span[contains(text(),'Ver disponibilidad')])[2]");

    public static Target SELECT_AMOUNT = Target.the("Selector Cantidad personas").locatedBy("//select[@data-room-id='518739008']");

    public static Target SELECT_ONE_AMOUNT = Target.the("Selector una persona").locatedBy("//option[contains(text(),'1')]");

    public static Target BUTTON_RESERVE = Target.the("Boton Reservar").locatedBy("//span[contains(text(),'Reservaré')]");

    public static Target INPUT_NAME = Target.the("Input nombre").locatedBy("//input[@id='firstname']");

    public static Target INPUT_LASTNAME = Target.the("Input apellido").locatedBy("//input[@id='lastname']");

    public static Target INPUT_EMAIL = Target.the("Input email").locatedBy("//input[@id='email']");

    public static Target CHECKBOX_BOOKING= Target.the("Checkbox La reserva es para mí").locatedBy("//span[contains(text(),'La reserva es para mí')]");

    public static Target INPUT_NAME_GUEST= Target.the("input nombre invitado").locatedBy("//input[@id='guest_name_518739008_368973775_0_1_0']");

    public static Target BUTTON_NEXT_STEP= Target.the("Boton siguiente paso").locatedBy("//span[contains(text(),'Siguiente: últimos datos')]");

    public static Target INPUT_TELEPHONE= Target.the("input telefono").locatedBy("//input[@id='phone']");

    public static Target INPUT_HOLDER_TC= Target.the("input titular tarjeta de credito").locatedBy("//input[@id='cc_name']");

    public static Target SELECT_TYPE_TC = Target.the("selector tipo de tarjeta de credito").locatedBy("//select[@id='cc_type']");

    public static Target OPTION_MASTERCARD = Target.the("tipo de Mastercard").locatedBy("//option[contains(text(),'MasterCard')]");

    public static Target INPUT_NUMBER_TC= Target.the("input numero tarjeta de credito").locatedBy("//input[@id='cc_number']");

    public static Target INPUT_CODE_CVC_TC= Target.the("input codigo seguridad tarjeta de credito").locatedBy("//input[@id='cc_cvc']");

    public static Target SPAN_PRICE= Target.the("Span valor alojamiento").locatedBy("//div[@data-currency-code='COP']");





}
