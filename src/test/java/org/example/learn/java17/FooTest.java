package org.example.learn.java17;

import org.junit.Test;

public class FooTest {

    @Test
    public void test0() {
        int i = 0xffff << 16;
        System.out.println("Integer.toHexString(i) = " + Integer.toHexString(i));
    }
}
