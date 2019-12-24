package com.example.guava;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class DemoImmutableCollections {

    public static final ImmutableSet<String> COLOR_NAMES = ImmutableSet.of(
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "purple"
    );

    class Foo {
        final ImmutableSet<String> strings;
        Foo(Set<String> strings) {
            this.strings = ImmutableSet.copyOf(strings); // 制作对象的不变副本是一种很好的防御性编程技术
        }
    }

    public static void main(String[] args) {
        DemoImmutableCollections demoImmutableCollections = new DemoImmutableCollections();
        System.out.println(COLOR_NAMES);
        ImmutableSet<String> COLORS = ImmutableSet.<String>builder()
                .addAll(COLOR_NAMES)
                .add("white")
                .build();
        System.out.println(COLORS);
    }

}
