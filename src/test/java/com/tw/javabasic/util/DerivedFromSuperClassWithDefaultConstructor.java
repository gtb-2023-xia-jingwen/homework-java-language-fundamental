package com.tw.javabasic.util;

public class DerivedFromSuperClassWithDefaultConstructor extends SuperClassWithDefaultConstructor {
    public DerivedFromSuperClassWithDefaultConstructor() {
        addLog("DerivedFromSuperClassWithDefaultConstructor.constructor()");
    }

    public DerivedFromSuperClassWithDefaultConstructor(int arg) {
        this();
        addLog("DerivedFromSuperClassWithDefaultConstructor.constructor(int)");
    }

    public DerivedFromSuperClassWithDefaultConstructor(String arg) {
        super(arg);
        addLog("DerivedFromSuperClassWithDefaultConstructor.constructor(String)");
    }
}
