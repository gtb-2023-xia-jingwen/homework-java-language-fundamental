package com.tw.javabasic.util;

import java.util.Objects;

public class SimpleObjectWithInternalState {
    private String name;

    public SimpleObjectWithInternalState(String name) {
        if (Objects.isNull(name)) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
