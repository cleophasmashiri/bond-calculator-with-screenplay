package com.zamayi.ddd.model;

import net.serenitybdd.screenplay.targets.Target;

/**
 * Created by cleophas on 2018/03/05.
 */
public class BondCalculator {
    public static final Target LOAN_AMOUNT = Target.the("'Loan amount,' field")
            .locatedBy("#loanAmount");
    public static final Target SUBMIT_BUTTON = Target.the("'Calculate Bond Costs,' field")
            .locatedBy("#submitBtn");
    public static final Target COOKIE_SUBMIT_BUTTON = Target.the("Cookie banner")
            .locatedBy("//a[contains(., 'Close this message')]");

    public static final Target INTEREST_RATE = Target.the("'Interest rate', field")
            .locatedBy("#interestRate");
    public static final Target BOND_CALCULATIONS = Target.the("'Bond cost calculations' field")
            .locatedBy(".readOutRight");
}
