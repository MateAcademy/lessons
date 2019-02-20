package com.mateacademy.patterny.abstractFactory.website;

import com.mateacademy.patterny.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Website PM manages Website projects");
    }
}
