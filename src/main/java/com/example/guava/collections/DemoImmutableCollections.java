package com.example.guava.collections;

import com.google.common.collect.ImmutableSet;
import org.junit.Test;

import java.util.Set;

public class DemoImmutableCollections {

    @Test
    public void immutable_set() {
        final ImmutableSet<String> COLOR_NAMES = ImmutableSet.of(
                "red",
                "orange",
                "yellow",
                "green",
                "blue"
        );
        System.out.println(COLOR_NAMES); //[red, orange, yellow, green, blue]

        class Foo {
            final ImmutableSet<String> names;
            Foo(Set<String> names) {
                this.names = ImmutableSet.copyOf(names);
            }
        }
    }

}
