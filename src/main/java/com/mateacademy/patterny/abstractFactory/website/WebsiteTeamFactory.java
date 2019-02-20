package com.mateacademy.patterny.abstractFactory.website;

import com.mateacademy.patterny.abstractFactory.Developer;
import com.mateacademy.patterny.abstractFactory.ProjectManager;
import com.mateacademy.patterny.abstractFactory.ProjectTeamFactory;
import com.mateacademy.patterny.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDevelooper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
