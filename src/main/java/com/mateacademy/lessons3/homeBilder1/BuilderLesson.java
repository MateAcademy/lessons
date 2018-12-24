package com.mateacademy.lessons3.homeBilder1;

public class BuilderLesson {
    public static void main(String[] args) {
      SportCar sportCar =  new SportCar.Builder("Audi").setColor("green").
              setMaxSpeed(300).build();
        System.out.println(sportCar.getName()+" " + sportCar.getColor() + " " + sportCar.getMaxSpeed());


      SportCar sportCar1 = new SportCar.Builder("BMW").build();
        System.out.println(sportCar1.getName()+" " + sportCar1.getColor() +
                " " + sportCar1.getMaxSpeed());
    }
}

class SportCar
{
    private String name;
    private String color;
    private Integer maxSpeed;
    private Integer yearIssue;
    private Integer enginePower;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public Integer getYearIssue() {
        return yearIssue;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    private SportCar(Builder builder)
    {
        this.name = builder.name;
        this.color = builder.color ;
        this.maxSpeed = builder.maxSpeed;
        this.enginePower = builder.enginePower;
        this.yearIssue = builder.yearIssue;
    }

    static class Builder
    {
        private String name;
        private String color = "---";
        private Integer maxSpeed = 0;
        private Integer yearIssue = 0;
        private Integer enginePower = 0;

        public Builder(String name)
        {
            this.name = name;
        }

        public Builder setColor(String color)
        {
            this.color = color;
            return this;
        }

        public Builder setMaxSpeed(Integer maxSpeed)
        {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder setYearIssue(Integer yearIssue) {
            this.yearIssue = yearIssue;
            return this;
        }

        public Builder setEnginePower(Integer enginePower) {
            this.enginePower = enginePower;
            return this;
        }

        public SportCar build()
        {
            return new SportCar(this);
        }
    }
}
