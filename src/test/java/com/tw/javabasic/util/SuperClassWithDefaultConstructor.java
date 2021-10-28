package com.tw.javabasic.util;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("WeakerAccess")
public class SuperClassWithDefaultConstructor {
    private final List<String> logger = new ArrayList<>();

    void addLog(String log) { logger.add(log); }

    public String[] getLogger() { return logger.toArray(new String[0]); }

    public SuperClassWithDefaultConstructor() { addLog("SuperClassWithDefaultConstructor.constructor()"); }
    public SuperClassWithDefaultConstructor(String name) {
        addLog("SuperClassWithDefaultConstructor.constructor(String)");
    }
}
