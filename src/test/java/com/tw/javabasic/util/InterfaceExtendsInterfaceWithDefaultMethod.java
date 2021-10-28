package com.tw.javabasic.util;

public interface InterfaceExtendsInterfaceWithDefaultMethod extends InterfaceWithDefaultMethod {
    @Override
    default String getTheTruthOfTheUniverse() {
        return "Food";
    }
}
