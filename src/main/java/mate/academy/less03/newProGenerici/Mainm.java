package mate.academy.less03.newProGenerici;

public class Mainm {
    public static void main(String[] args) {
        Container<? extends Aircraft> container = new Container<>();
//        container.setMaschine(new Planner());
//        container.setMaschine(new Aircraft());
//        container.setMaschine(new Boeing());

        Container<? super Aircraft> container2 = new Container<>();
//        container2.setMaschine(new Planner());
        container2.setMaschine(new Aircraft());
        container2.setMaschine(new Boeing());
    }
}

class Planner {
}

class Aircraft extends Planner {
}

class Boeing extends Aircraft {
}

class Container<T> {
    private T maschine;

    public T getMaschine() {
        return maschine;
    }

    public void setMaschine(T maschine) {
        this.maschine = maschine;
    }


}
