package mate.academy.less06.серриалзация3;

import java.io.*;

public class CustomObject implements Externalizable {
    public transient boolean b = true;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }

    @Override
    public String toString() {
        return "CustomObject{" +
                "b=" + b +
                '}';
    }
}
