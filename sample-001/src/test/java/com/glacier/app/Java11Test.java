package com.glacier.app;

import org.junit.jupiter.api.Test;

public class Java11Test {

    @Test
    void testVar() {
        String strBeforeJava10 = "strBeforeJava10";
        var strFromJava10 = "strFromJava10";
        System.out.println(strBeforeJava10);
        System.out.println(strFromJava10);
    }
}
