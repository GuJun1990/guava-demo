package com.example.guava;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

public class DemoPrecondition {

    private void checkArgumentTest(int i) {
        checkArgument(i >= 0, "Argument was %s but expected nonnegative", i);
    }

    private void checkArgumentTest2(int i, int j) {
        checkArgument(i > j, "Expected i < j, but %s >= %s", i, j);
    }

    private void checkNotNullTest(Object o) {
        checkNotNull(o);
    }

    public static void main(String[] args) {
        DemoPrecondition demoPrecondition = new DemoPrecondition();

//        {
//            demoPrecondition.checkArgumentTest(10);
//            demoPrecondition.checkArgumentTest(-1); // Throws a IllegalArgumentException
//            demoPrecondition.checkArgumentTest2(1, 2);
//            demoPrecondition.checkArgumentTest2(1, 1); // Throws a IllegalArgumentException
//        }

//        {
//            demoPrecondition.checkNotNullTest(new Object());
//            demoPrecondition.checkNotNullTest(null); // Throws a NullPointerException
//        }

    }

}
