package com.lgardias.system;

import java.util.HashSet;
import java.util.Set;

public class ExpertSystem {
    private Set<String> setOfAssertions;

    public ExpertSystem() {
        setOfAssertions = new HashSet<>();
    }

    public void addAssertion(String assertion) {
        setOfAssertions.add(assertion);
    }

    public void showAssertion() {
//        System.out.println(setOfAssertions.size());
        setOfAssertions.stream().forEach(System.out::println);
    }
}
