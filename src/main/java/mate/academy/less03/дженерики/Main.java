package mate.academy.less03.дженерики;

public class Main {
    public static void main(String[] args) {
        Gold pieceGold = new Gold(1000);
        Storage<Gold> storage = new Storage(pieceGold);
        Gold objGold = storage.getThing();
            objGold.changeOnMoney();


    }
}

class Gold {
    private int weightInGrams;

    public Gold(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public void changeOnMoney() {
        System.out.println("Ваши " + weightInGrams + " грамм золота обменены на " + weightInGrams*50 + " гривен" );
    }
}


class Storage<T> {
    private T thing;

    public Storage(T thing ) {
        this.thing = thing;
    }

    public T getThing() {
        return thing;
    }

    public void setThing(T thing) {
        this.thing = thing;
    }
}
