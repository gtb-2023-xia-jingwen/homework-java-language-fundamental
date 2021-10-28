package com.tw.javabasic.util;

public class DerivedFromBaseClassForOverridingCallingSuper extends com.tw.javabasic.util.BaseClassForOverriding {
    @Override
    public String getName() {
        return super.getName() + "->DerivedFromBaseClassForOverridingCallingSuper";
    }
}
