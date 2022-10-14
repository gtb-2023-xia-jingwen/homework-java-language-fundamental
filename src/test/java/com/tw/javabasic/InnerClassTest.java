package com.tw.javabasic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tw.javabasic.util.AnonymousClassUpdateField;
import com.tw.javabasic.util.InnerClassUpdateField;
import com.tw.javabasic.util.LocalClassUpdateField;
import com.tw.javabasic.util.StaticInnerClass;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class InnerClassTest {
    // Recommended time used: 30 min

    @Test
    void should_access_instance_field_of_parent_class() {
        InnerClassUpdateField instance = new InnerClassUpdateField();
        instance.somethingHappen();

        // TODO:
        //  Please write down your answer directly.
        //
        // Hint:
        //  If you want some references, please check page 331 of "Core Java Vol 1", section 6.4.1.
        // <--start
        final Integer expected = 2019;
        // --end-->

        assertEquals(expected, instance.getYear());
    }

    @Test
    void should_refer_inner_class_from_outside() {
        InnerClassUpdateField instance = new InnerClassUpdateField();

        InnerClassUpdateField.YearIncrementer incrementer = instance.new YearIncrementer();
        incrementer.increment();

        // TODO:
        //  Please write down your answer directly.
        //
        // Hint:
        //  And if you want some references, please check page 334 of "Core Java Vol 1", section 6.4.2.
        // <--start
        final Integer expected = 2019;
        // --end-->

        assertEquals(expected, instance.getYear());
    }

    @Test
    void should_update_field_using_local_class() {
        LocalClassUpdateField instance = new LocalClassUpdateField();
        instance.somethingHappen();

        // TODO:
        //  Please write down your answer directly.
        //
        // Hint:
        //  And if you want some references, please check page 331 of "Core Java Vol 1", section 6.4.1.
        //  and page 339, section 6.4.4.
        // <--start
        final Integer expected = 2019;
        // --end-->

        assertEquals(expected, instance.getYear());
    }

    @Test
    void should_update_field_using_anonymous_class() {
        AnonymousClassUpdateField instance = new AnonymousClassUpdateField();
        instance.somethingHappen();

        // TODO:
        //  Please write down your answer directly.
        //
        // Hint:
        //  And if you want some references, please check page 342 of "Core Java Vol 1", section 6.4.6.
        // <--start
        final Integer expected = 2019;
        // --end-->

        assertEquals(expected, instance.getYear());
    }

    @Test
    void should_create_instance_for_static_inner_class() {
        StaticInnerClass instance = new StaticInnerClass();
        StaticInnerClass.Inner inner = instance.createInner();

        // TODO:
        //  Please write down your answer directly.
        //
        // Hint:
        //  And if you want some references, please check page 346 of "Core Java Vol 1", section 6.4.7.
        // <--start
        final String expected = "Hello";
        // --end-->

        assertEquals(expected, inner.getName());
    }
}
