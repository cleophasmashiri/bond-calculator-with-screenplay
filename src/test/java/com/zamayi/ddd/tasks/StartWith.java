package com.zamayi.ddd.tasks;

import com.zamayi.ddd.ui.BondCalculatorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Created by cleophas on 2018/03/04.
 */
public class StartWith implements Task {

    private BondCalculatorPage bondCalculatorPage;

    @Override
    @Step("{0} start bond page with 0 loan amount")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(bondCalculatorPage));
    }

    public static StartWith withIncompleteForm() {
        return instrumented(StartWith.class);
    }
}
