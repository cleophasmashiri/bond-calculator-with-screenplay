package com.zamayi.ddd.features;

import com.zamayi.ddd.tasks.BondCosts;
import com.zamayi.ddd.tasks.StartWith;
import com.zamayi.ddd.tasks.CalculateBondCost;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.hasItem;

/**
 * Created by cleophas on 2018/03/04.
 */

@RunWith(SerenityRunner.class)
public class CalculateBondCostsStory {

    Actor ben = Actor.named("Ben");

    @Managed
    WebDriver hisBrowser;

    @Before
    public void benCanBrowseTheWeb() {
        ben.can(BrowseTheWeb.with(hisBrowser));
    }

    @Test
    public void should_be_able_to_calculate_bond_costs() {

        // given
        givenThat(ben).wasAbleTo(StartWith.withIncompleteForm());

        // when
        when(ben).attemptsTo(CalculateBondCost.called("1600000", "11"));

        // then
        then(ben).should(seeThat(BondCosts.displayed(), hasItem("R 26,646.00")));
    }

}
