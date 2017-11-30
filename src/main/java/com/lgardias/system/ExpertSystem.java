package com.lgardias.system;

import com.lgardias.assertion.Assertion;

import java.util.ArrayList;
import java.util.List;

public class ExpertSystem {
    private List<Assertion> listOfAssertions;

    public ExpertSystem() {
        listOfAssertions = new ArrayList<Assertion>();
    }

    public void addAssertion(Assertion assertion) {
        listOfAssertions.add(assertion);
    }

    public List<Assertion> getListOfAssertions() {
        return listOfAssertions;
    }

    public List<String> getListOfAssertionsAsListOfString() {
        List<String> list = new ArrayList<>();
        listOfAssertions.stream().forEach(assertion -> {
            list.add("Krok "+ assertion.getStepNumber() +" : "+ assertion.getAssertion());

        });
        return list;
    }
}
