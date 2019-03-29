package com.mateacademy.patterny.builder;

public class BuilderLesson {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar.Builder("audi").setColor("red").setMaxSpeed(150).build();
        SportCar sportCar2 = new SportCar.Builder("audi").setColor("red").build();

        System.out.println(sportCar.getMaxSpeed());
        System.out.println(sportCar2.getMaxSpeed());
    }
}

class SportCar {
    private String name;
    private String color;
    private int maxSpeed;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private SportCar(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.maxSpeed = builder.maxSpeed;
    }

        static class Builder {
            private String name;
            private String color;
            private int maxSpeed = 400;

            public Builder(String name) {
            this.name = name;

            }

            public Builder setColor(String color) {
                this.color = color;
                return this;
            }

            public Builder setMaxSpeed(int maxSpeed) {
                this.maxSpeed = maxSpeed;
                return this;
            }

            public SportCar build() {
                return new SportCar(this);
            }
        }

}
