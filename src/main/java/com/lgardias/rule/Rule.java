package com.lgardias.rule;

import java.util.function.Function;

public class Rule {

    Function function;

    public Rule(Function function){
        this.function = function;
    }

    public boolean valid(){
        return (Boolean)function.apply(null);
    }
}
