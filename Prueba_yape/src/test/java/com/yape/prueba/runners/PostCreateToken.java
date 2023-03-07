package com.yape.prueba.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue = { "com.yape.prueba.stepdefinitions", "com.yape.prueba.hooks" },
		features = { "src/test/resources/com.yape.prueba/features/create_token.feature" },

        snippets = SnippetType.CAMELCASE,
        dryRun = false
)
public class PostCreateToken {

}
