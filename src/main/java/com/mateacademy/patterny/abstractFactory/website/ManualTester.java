package com.mateacademy.patterny.abstractFactory.website;

import com.mateacademy.patterny.abstractFactory.Tester;

public class ManualTester implements Tester {

    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
