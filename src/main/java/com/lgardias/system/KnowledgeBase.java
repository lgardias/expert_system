package com.lgardias.system;


import java.util.HashSet;


public class KnowledgeBase {


    private boolean RUN;
    private boolean NOT_RUN;
    private boolean RUN_RESTART;
    private boolean SOUNDS;
    private boolean HDD_SSD;
    private boolean RESTART;
    private boolean BLUESRCREEN;
    private boolean SLOW_MOTION;
    private boolean LOUD;
    private boolean HEAT;
    private boolean MONITOR;
    private boolean ARTIFACT;
    private boolean MONIOR_OFF;
    private boolean POWER_OFF;

    public KnowledgeBase(HashSet<String> set) {
        if (set.contains("RUN")) RUN = true;
        else RUN = false;

        if (set.contains("NOT_RUN")) NOT_RUN = true;
        else NOT_RUN = false;

        if (set.contains("RUN_RESTART")) RUN_RESTART = true;
        else RUN_RESTART = false;

        if (set.contains("SOUNDS")) SOUNDS = true;
        else SOUNDS = false;

        if (set.contains("HDD/SSD")) HDD_SSD = true;
        else HDD_SSD = false;

        if (set.contains("RESTART")) RESTART = true;
        else RESTART = false;

        if (set.contains("BLUESRCREEN")) BLUESRCREEN = true;
        else BLUESRCREEN = false;

        if (set.contains("SLOW_MOTION")) SLOW_MOTION = true;
        else SLOW_MOTION = false;

        if (set.contains("LOUD")) LOUD = true;
        else LOUD = false;

        if (set.contains("HEAT")) HEAT = true;
        else HEAT = false;

        if (set.contains("MONITOR")) MONITOR = true;
        else MONITOR = false;

        if (set.contains("ARTIFACT")) ARTIFACT = true;
        else ARTIFACT = false;

        if (set.contains("MONIOR_OFF")) MONIOR_OFF = true;
        else MONIOR_OFF = false;

        if (set.contains("POWER_OFF")) POWER_OFF = true;
        else POWER_OFF = false;
    }

    public boolean isRUN() {
        return RUN;
    }

    public boolean isNOT_RUN() {
        return NOT_RUN;
    }

    public boolean isRUN_RESTART() {
        return RUN_RESTART;
    }

    public boolean isSOUNDS() {
        return SOUNDS;
    }

    public boolean isHDD_SSD() {
        return HDD_SSD;
    }

    public boolean isRESTART() {
        return RESTART;
    }

    public boolean isBLUESRCREEN() {
        return BLUESRCREEN;
    }

    public boolean isSLOW_MOTION() {
        return SLOW_MOTION;
    }

    public boolean isLOUD() {
        return LOUD;
    }

    public boolean isHEAT() {
        return HEAT;
    }

    public boolean isMONITOR() {
        return MONITOR;
    }

    public boolean isARTIFACT() {
        return ARTIFACT;
    }

    public boolean isMONIOR_OFF() {
        return MONIOR_OFF;
    }

    public boolean isPOWER_OFF() {
        return POWER_OFF;
    }

    @Override
    public String toString() {
        return "KnowledgeBase{" +
                "RUN=" + RUN +
                ", NOT_RUN=" + NOT_RUN +
                ", RUN_RESTART=" + RUN_RESTART +
                ", SOUNDS=" + SOUNDS +
                ", HDD_SSD=" + HDD_SSD +
                ", RESTART=" + RESTART +
                ", BLUESRCREEN=" + BLUESRCREEN +
                ", SLOW_MOTION=" + SLOW_MOTION +
                ", LOUD=" + LOUD +
                ", HEAT=" + HEAT +
                ", MONITOR=" + MONITOR +
                ", ARTIFACT=" + ARTIFACT +
                ", MONIOR_OFF=" + MONIOR_OFF +
                ", POWER_OFF=" + POWER_OFF +
                '}';
    }
}
