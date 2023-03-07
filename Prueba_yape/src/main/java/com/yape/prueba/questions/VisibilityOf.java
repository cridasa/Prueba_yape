package com.yape.prueba.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class VisibilityOf implements Question<Boolean> {

	private Target field;

	public VisibilityOf(Target field) {
		this.field = field;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		return field.resolveFor(actor).isVisible();
	}

	public static VisibilityOf field(Target field) {
		return new VisibilityOf(field);
	}

}
