package com.mateacademy.patterny.abstractFactory.banking;

import com.mateacademy.patterny.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
