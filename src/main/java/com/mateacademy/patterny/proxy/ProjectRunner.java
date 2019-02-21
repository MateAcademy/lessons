package com.mateacademy.patterny.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/SergeyKlunniy/realProject");

        project.run();
    }

}
