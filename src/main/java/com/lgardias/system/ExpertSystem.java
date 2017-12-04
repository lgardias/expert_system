package com.lgardias.system;

import com.lgardias.rule.Rule;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ExpertSystem {

    private HashSet<String> setOfAssertions;
    private KnowledgeBase knowledgeBase;

    private List<Rule> hardDriveRules;
    private List<Rule> motherboardRules;
    private List<Rule> powerRules;
    private List<Rule> graficsRules;
    private List<Rule> memoryeRules;
    private List<Rule> heatRules;
    private List<Rule> processorRules;

    public ExpertSystem() {
        setOfAssertions = new HashSet<>();
    }

    public void createKnowledgeBase() {
        knowledgeBase = new KnowledgeBase(setOfAssertions);
        crateRules();
    }

    private void crateRules() {
        createHardDriveRules();
        createMotherboardRules();
        createPowerRules();
        createGraficsRules();
        createMemoryeRules();
        createHeatRules();
        createProcessorRules();
    }

    private void createProcessorRules() {

    }

    private void createHeatRules() {

    }

    private void createMemoryeRules() {
        memoryeRules = new ArrayList<>();
        Rule r1 = new Rule((t) ->{
            if(knowledgeBase.isBLUESRCREEN() && knowledgeBase.isRESTART() && knowledgeBase.isRUN_RESTART()){
                return true;
            }else return false;
        });
        Rule r2 = new Rule((t) ->{
            if(knowledgeBase.isBLUESRCREEN() && knowledgeBase.isRESTART()){
                return true;
            }else return false;
        });
        Rule r3 = new Rule((t) ->{
            if(knowledgeBase.isBLUESRCREEN() && knowledgeBase.isRUN_RESTART()){
                return true;
            }else return false;
        });
        Rule r4 = new Rule((t) ->{
            if(knowledgeBase.isRESTART() && knowledgeBase.isRUN_RESTART()){
                return true;
            }else return false;
        });

        memoryeRules.add(r1);
        memoryeRules.add(r2);
        memoryeRules.add(r3);
        memoryeRules.add(r4);
    }

    private void createGraficsRules() {

    }

    private void createPowerRules() {
        powerRules = new ArrayList<>();

        Rule r1 = new Rule((t) ->{
           if(knowledgeBase.isNOT_RUN() && knowledgeBase.isPOWER_OFF()){
               return true;
           }else return false;
        });
        Rule r2 = new Rule((t) ->{
            if(knowledgeBase.isPOWER_OFF()){
                return true;
            }else return false;
        });
        powerRules.add(r1);
        powerRules.add(r2);
    }

    private void createMotherboardRules() {
        motherboardRules = new ArrayList<>();
        Rule r1 = new Rule((t) ->{
            if(knowledgeBase.isNOT_RUN() && knowledgeBase.isRESTART() && knowledgeBase.isSLOW_MOTION()){
                return true;
            }
            else return false;
        });
        Rule r2 = new Rule((t) ->{
            if(knowledgeBase.isNOT_RUN() && knowledgeBase.isRESTART()){
                return true;
            }
            else return false;
        });
        Rule r3 = new Rule((t) ->{
            if(knowledgeBase.isNOT_RUN() && knowledgeBase.isSLOW_MOTION()){
                return true;
            }
            else return false;
        });
        Rule r4 = new Rule((t) ->{
            if(knowledgeBase.isRESTART() && knowledgeBase.isSLOW_MOTION()){
                return true;
            }
            else return false;
        });

        motherboardRules.add(r1);
        motherboardRules.add(r2);
        motherboardRules.add(r3);
        motherboardRules.add(r4);
    }

    private void createHardDriveRules() {

    }

    public KnowledgeBase getKnowledgeBase() {
        return knowledgeBase;
    }

    public void addAssertion(String assertion) {
        setOfAssertions.add(assertion);
    }

    public List<Rule> getHardDriveRules() {
        return hardDriveRules;
    }

    public List<Rule> getMotherboardRules() {
        return motherboardRules;
    }

    public List<Rule> getPowerRules() {
        return powerRules;
    }

    public List<Rule> getGraficsRules() {
        return graficsRules;
    }

    public List<Rule> getMemoryeRules() {
        return memoryeRules;
    }

    public List<Rule> getHeatRules() {
        return heatRules;
    }

    public List<Rule> getProcessorRules() {
        return processorRules;
    }
}
