package com.mateacademy.patterny.abstractFactory.banking;

import com.mateacademy.patterny.abstractFactory.Developer;
import com.mateacademy.patterny.abstractFactory.ProjectManager;
import com.mateacademy.patterny.abstractFactory.ProjectTeamFactory;
import com.mateacademy.patterny.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDevelooper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
