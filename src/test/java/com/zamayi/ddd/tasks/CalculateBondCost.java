package com.zamayi.ddd.tasks;

import com.zamayi.ddd.model.BondCalculator;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

/**
 * Created by cleophas on 2018/03/05.
 */
public class CalculateBondCost implements Task {

    private String loanAmount;
    private String interestRate;

    public CalculateBondCost(String loanAmount, String interestRate) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    @Override
    @Step("{0} calculates bond costs")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(loanAmount)
        .into(BondCalculator.LOAN_AMOUNT),
                Enter.theValue(interestRate)
                .into(BondCalculator.INTEREST_RATE)
                ,Click.on(BondCalculator.COOKIE_SUBMIT_BUTTON)
                , Click.on(BondCalculator.SUBMIT_BUTTON));
    }

    public static Performable called(String loanAmount, String interestRate) {
        return Instrumented.instanceOf(CalculateBondCost.class)
                .withProperties(loanAmount, interestRate);
    }
}
