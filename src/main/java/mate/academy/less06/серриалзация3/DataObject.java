package mate.academy.less06.серриалзация3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class DataObject extends NonSerializable implements Serializable {

    CustomObject customObject = new CustomObject();
    private int i = 5;
    private String s = "AAA";
    private transient String[] def = {"2", "3", "4", "6"};

    @Override
    public String toString() {
        return "DataObject{" +
                "customObject=" + customObject +
                ", i=" + i +
                ", s='" + s + '\'' +
                ", def=" + Arrays.toString(def) +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeObject(getMyData());

    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        String s = (String) in.readObject();
        setMyData(s);
    }
}
