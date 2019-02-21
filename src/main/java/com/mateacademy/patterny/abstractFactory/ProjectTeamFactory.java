package com.mateacademy.patterny.abstractFactory;

public interface ProjectTeamFactory {
    Developer getDevelooper();
    Tester getTester();
    ProjectManager getProjectManager();
}
