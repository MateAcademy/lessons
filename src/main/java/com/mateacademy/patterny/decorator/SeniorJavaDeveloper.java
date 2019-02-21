package com.mateacademy.patterny.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeRevieew() {
        return " Make code review. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeRevieew();
    }
}
