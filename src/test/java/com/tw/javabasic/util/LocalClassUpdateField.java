package com.tw.javabasic.util;

public class LocalClassUpdateField {
    private int year;

    public LocalClassUpdateField() {
        year = 2018;
    }

    public int getYear() {
        return year;
    }

    public void somethingHappen() {
        class YearIncrementer {
            @SuppressWarnings("WeakerAccess")
            public void increment() {
                ++year;
            }
        }

        new YearIncrementer().increment();
    }
}
