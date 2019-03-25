package mate.academy.hw02.patternBuilder;

public class Main {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar.Builder("Audi").setColor("green").setMaxSpeed(350).build();

        System.out.println(sportCar.getName());
        System.out.println(sportCar.getColor());
        System.out.println(sportCar.getMaxSpeed());
        System.out.println(sportCar.getView());
    }
}

class SportCar {
    private String name;
    private String color;
    private Integer maxSpeed;
    private Integer coust;
    private Integer namber;
    private Integer enginePower;
    private Integer doors;
    private String view;
    private String aspect;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public Integer getCoust() {
        return coust;
    }

    public Integer getNamber() {
        return namber;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    public Integer getDoors() {
        return doors;
    }

    public String getView() {
        return view;
    }

    public String getAspect() {
        return aspect;
    }

    private SportCar(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.maxSpeed = builder.maxSpeed;
        this.coust = builder.coust;
        this.namber = builder.namber;
        this.enginePower = builder.enginePower;
        this.doors = builder.doors;
        this.view = builder.view;
        this.aspect = builder.aspect;
    }

    static class Builder {
        private String name;
        private String color = "black";
        private Integer maxSpeed = 200;
        private Integer coust = 15000;
        private Integer namber = 777;
        private Integer enginePower = 600;
        private Integer doors = 5;
        private String view = "sedan";
        private String aspect = "USA";

        public Builder(String name) {
            this.name = name;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setMaxSpeed(Integer maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder setCoust(Integer coust) {
            this.coust = coust;
            return this;
        }

        public Builder setNamber(Integer namber) {
            this.namber = namber;
            return this;
        }

        public Builder setEnginePower(Integer enginePower) {
            this.enginePower = enginePower;
            return this;
        }

        public Builder setDoors(Integer doors) {
            this.doors = doors;
            return this;
        }

        public Builder setView(String view) {
            this.view = view;
            return this;
        }

        public Builder setAspect(String aspect) {
            this.aspect = aspect;
            return this;
        }

        public SportCar build() {
            return new SportCar(this);
        }

    }
}