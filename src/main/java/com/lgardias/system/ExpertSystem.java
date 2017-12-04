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
        processorRules = new ArrayList<>();

        Rule r1 = new Rule((t) -> {
            if (knowledgeBase.isHEAT() && knowledgeBase.isBLUESRCREEN() && knowledgeBase.isRESTART()) {
                return true;
            } else return false;
        });
        Rule r2 = new Rule((t) -> {
            if (knowledgeBase.isHEAT() && knowledgeBase.isRESTART() && knowledgeBase.isLOUD()) {
                return true;
            } else return false;
        });
        Rule r3 = new Rule((t) -> {
            if (knowledgeBase.isHEAT() && knowledgeBase.isBLUESRCREEN() && knowledgeBase.isLOUD()) {
                return true;
            } else return false;
        });
        Rule r4 = new Rule((t) -> {
            if (knowledgeBase.isBLUESRCREEN() && knowledgeBase.isRESTART() && knowledgeBase.isLOUD()) {
                return true;
            } else return false;
        });

        processorRules.add(r1);
        processorRules.add(r2);
        processorRules.add(r3);
        processorRules.add(r4);
    }

    private void createHeatRules() {
        heatRules = new ArrayList<>();

        Rule r1 = new Rule((t) -> {
            if (knowledgeBase.isHEAT() && knowledgeBase.isLOUD()) {
                return true;
            } else return false;
        });
        Rule r2 = new Rule((t) -> {
            if (knowledgeBase.isHEAT() && knowledgeBase.isRESTART()) {
                return true;
            } else return false;
        });
        Rule r3 = new Rule((t) -> {
            if (knowledgeBase.isLOUD() && knowledgeBase.isRESTART()) {
                return true;
            } else return false;
        });
        Rule r4 = new Rule((t) -> {
            if (knowledgeBase.isHEAT() && knowledgeBase.isRESTART() && knowledgeBase.isLOUD()) {
                return true;
            } else return false;
        });

        heatRules.add(r1);
        heatRules.add(r2);
        heatRules.add(r3);
        heatRules.add(r4);
    }

    private void createMemoryeRules() {
        memoryeRules = new ArrayList<>();
        Rule r1 = new Rule((t) -> {
            if (knowledgeBase.isBLUESRCREEN() && knowledgeBase.isRESTART() && knowledgeBase.isRUN_RESTART()) {
                return true;
            } else return false;
        });
        Rule r2 = new Rule((t) -> {
            if (knowledgeBase.isBLUESRCREEN() && knowledgeBase.isRESTART()) {
                return true;
            } else return false;
        });
        Rule r3 = new Rule((t) -> {
            if (knowledgeBase.isBLUESRCREEN() && knowledgeBase.isRUN_RESTART()) {
                return true;
            } else return false;
        });
        Rule r4 = new Rule((t) -> {
            if (knowledgeBase.isRESTART() && knowledgeBase.isRUN_RESTART()) {
                return true;
            } else return false;
        });

        memoryeRules.add(r1);
        memoryeRules.add(r2);
        memoryeRules.add(r3);
        memoryeRules.add(r4);
    }

    private void createGraficsRules() {
        graficsRules = new ArrayList<>();
        Rule r1 = new Rule((t) -> {
            if (knowledgeBase.isRUN() && knowledgeBase.isARTIFACT() && knowledgeBase.isSOUNDS()) {
                return true;
            } else return false;
        });
        Rule r2 = new Rule((t) -> {
            if (knowledgeBase.isRUN() && knowledgeBase.isARTIFACT() && knowledgeBase.isRESTART()) {
                return true;
            } else return false;
        });
        Rule r3 = new Rule((t) -> {
            if (knowledgeBase.isRUN() && knowledgeBase.isARTIFACT() && knowledgeBase.isBLUESRCREEN()) {
                return true;
            } else return false;
        });
        Rule r4 = new Rule((t) -> {
            if (knowledgeBase.isRUN() && knowledgeBase.isARTIFACT() && knowledgeBase.isSLOW_MOTION()) {
                return true;
            } else return false;
        });
        Rule r5 = new Rule((t) -> {
            if (knowledgeBase.isRUN() && knowledgeBase.isARTIFACT() && knowledgeBase.isMONIOR_OFF()) {
                return true;
            } else return false;
        });
        Rule r6 = new Rule((t) -> {
            if (knowledgeBase.isRUN() && knowledgeBase.isRESTART() && knowledgeBase.isSOUNDS()) {
                return true;
            } else return false;
        });
        Rule r7 = new Rule((t) -> {
            if (knowledgeBase.isRUN() && knowledgeBase.isRESTART() && knowledgeBase.isBLUESRCREEN()) {
                return true;
            } else return false;
        });
        Rule r8 = new Rule((t) -> {
            if (knowledgeBase.isRUN() && knowledgeBase.isRESTART() && knowledgeBase.isSLOW_MOTION()) {
                return true;
            } else return false;
        });
        Rule r9 = new Rule((t) -> {
            if (knowledgeBase.isRUN() && knowledgeBase.isRESTART() && knowledgeBase.isMONIOR_OFF()) {
                return true;
            } else return false;
        });
        Rule r10 = new Rule((t) -> {
            if (knowledgeBase.isRUN() && knowledgeBase.isBLUESRCREEN() && knowledgeBase.isSOUNDS()) {
                return true;
            } else return false;
        });
        Rule r11 = new Rule((t) -> {
            if (knowledgeBase.isRUN() && knowledgeBase.isBLUESRCREEN() && knowledgeBase.isSLOW_MOTION()) {
                return true;
            } else return false;
        });
        Rule r12 = new Rule((t) -> {
            if (knowledgeBase.isRUN() && knowledgeBase.isBLUESRCREEN() && knowledgeBase.isMONIOR_OFF()) {
                return true;
            } else return false;
        });
        Rule r13 = new Rule((t) -> {
            if (knowledgeBase.isRUN() && knowledgeBase.isSLOW_MOTION() && knowledgeBase.isMONIOR_OFF()) {
                return true;
            } else return false;
        });
        Rule r14 = new Rule((t) -> {
            if (knowledgeBase.isMONITOR()) {
                return true;
            } else return false;
        });

        graficsRules.add(r1);
        graficsRules.add(r2);
        graficsRules.add(r3);
        graficsRules.add(r4);
        graficsRules.add(r5);
        graficsRules.add(r6);
        graficsRules.add(r7);
        graficsRules.add(r8);
        graficsRules.add(r9);
        graficsRules.add(r10);
        graficsRules.add(r11);
        graficsRules.add(r12);
        graficsRules.add(r13);
        graficsRules.add(r14);
    }

    private void createPowerRules() {
        powerRules = new ArrayList<>();

        Rule r1 = new Rule((t) -> {
            if (knowledgeBase.isNOT_RUN() && knowledgeBase.isPOWER_OFF()) {
                return true;
            } else return false;
        });
        Rule r2 = new Rule((t) -> {
            if (knowledgeBase.isPOWER_OFF()) {
                return true;
            } else return false;
        });
        powerRules.add(r1);
        powerRules.add(r2);
    }

    private void createMotherboardRules() {
        motherboardRules = new ArrayList<>();
        Rule r1 = new Rule((t) -> {
            if (knowledgeBase.isNOT_RUN() && knowledgeBase.isRESTART() && knowledgeBase.isSLOW_MOTION()) {
                return true;
            } else return false;
        });
        Rule r2 = new Rule((t) -> {
            if (knowledgeBase.isNOT_RUN() && knowledgeBase.isRESTART()) {
                return true;
            } else return false;
        });
        Rule r3 = new Rule((t) -> {
            if (knowledgeBase.isNOT_RUN() && knowledgeBase.isSLOW_MOTION()) {
                return true;
            } else return false;
        });
        Rule r4 = new Rule((t) -> {
            if (knowledgeBase.isRESTART() && knowledgeBase.isSLOW_MOTION()) {
                return true;
            } else return false;
        });

        motherboardRules.add(r1);
        motherboardRules.add(r2);
        motherboardRules.add(r3);
        motherboardRules.add(r4);
    }

    private void createHardDriveRules() {
        hardDriveRules = new ArrayList<>();
        Rule r1 = new Rule((t) -> {
            if (knowledgeBase.isRUN() && knowledgeBase.isHDD_SSD()) {
                return true;
            } else return false;
        });
        Rule r2 = new Rule((t) -> {
            if (knowledgeBase.isRUN() && knowledgeBase.isHDD_SSD() && knowledgeBase.isSOUNDS()) {
                return true;
            } else return false;
        });
        Rule r3 = new Rule((t) -> {
            if (knowledgeBase.isRUN() && knowledgeBase.isRUN_RESTART() && knowledgeBase.isSOUNDS()) {
                return true;
            } else return false;
        });
        Rule r4 = new Rule((t) -> {
            if (knowledgeBase.isRUN() && knowledgeBase.isHDD_SSD() && knowledgeBase.isRUN_RESTART()) {
                return true;
            } else return false;
        });
        hardDriveRules.add(r1);
        hardDriveRules.add(r2);
        hardDriveRules.add(r3);
        hardDriveRules.add(r4);
    }

    public KnowledgeBase getKnowledgeBase() {
        return knowledgeBase;
    }

    public String validateRules() {
        String result = "Rozpoznane wadliwe podzespoły: \n";
        result += validateList(hardDriveRules, "DYSK TWARDY");
        result += validateList(motherboardRules, "PŁYTA GŁÓWNA");
        result += validateList(powerRules, "ZASILANIE");
        result += validateList(graficsRules, "KARTA GRAFICZNA");
        result += validateList(memoryeRules, "KOŚCI RAM");
        result += validateList(heatRules, "CHŁODZENIE");
        result += validateList(processorRules, "PROCESOR");
        return result;
    }

    private String validateList(List<Rule> ruleList, String segments) {
        int counter = 0;
        for (Rule rule : ruleList) {
            if (rule.valid()) {
                counter++;
            }
        }
        if (counter > 0) {
            String res = "Uszkodzony " + segments + "- ilość trafionych reguł = " + counter+ "\n";
            return res;
        }else return "";

    }

    public void addAssertion(String assertion) {
        setOfAssertions.add(assertion);
    }


}
