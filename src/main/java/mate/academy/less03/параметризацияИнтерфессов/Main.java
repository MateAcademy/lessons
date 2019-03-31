package mate.academy.less03.параметризацияИнтерфессов;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Aircraft<Mechanizm> aircraft = new Aircraft<>(new Mechanizm());
        Mechanizm mechanizm = new Mechanizm();
        mechanizm.clone();
    }
}

class Aircraft<K extends Mechanizm & Cloneable>  {

        K detail ;

    public Aircraft(K detail) {
        this.detail = detail;
    }

    <T> K getFaildDetail(T arg) {
        return detail; }

    void workWithDeteil() {
        detail.oppenChassi();
    }
}

class Mechanizm implements Cloneable{
    void oppenChassi() {
        System.out.println("Шасси!");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Chassi extends  Mechanizm {
    @Override
    void oppenChassi() {
        System.out.println("Шасси открыты");
    }
}