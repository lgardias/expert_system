package com.lgardias.system;

import java.util.HashSet;
import java.util.Set;

public class ExpertSystem {

    private HashSet<String> setOfAssertions;
    private KnowledgeBase knowledgeBase;
    public ExpertSystem() {
        setOfAssertions = new HashSet<>();
    }

    public void createKnowledgeBase(){
        knowledgeBase = new KnowledgeBase(setOfAssertions);
    }

    public KnowledgeBase getKnowledgeBase() {
        return knowledgeBase;
    }

    public void addAssertion(String assertion) {
        setOfAssertions.add(assertion);
    }

    public void showAssertion() {
        setOfAssertions.stream().forEach(System.out::println);
    }
}
