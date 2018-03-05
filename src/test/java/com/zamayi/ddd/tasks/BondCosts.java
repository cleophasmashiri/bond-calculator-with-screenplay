package com.zamayi.ddd.tasks;

import com.zamayi.ddd.model.BondCalculator;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

/**
 * Created by cleophas on 2018/03/05.
 */
public class BondCosts implements Question<List<String>> {

    public static Question<List<String>> displayed() {
        return new BondCosts();
    }

    @Override
    public List<String> answeredBy(Actor actor) {
        return Text.of(BondCalculator.BOND_CALCULATIONS)
                .viewedBy(actor)
                .asList();
    }

}
