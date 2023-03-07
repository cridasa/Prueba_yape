package com.yape.prueba.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TextOf implements Question<String> {

	private Target field;

	public TextOf(Target field) {
		this.field = field;
	}

	@Override
	public String answeredBy(Actor actor) {
		actor.wasAbleTo(WaitUntil.the(field, isPresent()).forNoMoreThan(10).seconds(),
				WaitUntil.the(field, isVisible()).forNoMoreThan(10).seconds());
		return Text.of(field).answeredBy(actor);
	}

	public static TextOf field(Target field) {
		return new TextOf(field);
	}

}
