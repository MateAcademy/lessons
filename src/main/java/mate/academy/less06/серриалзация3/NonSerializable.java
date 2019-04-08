package mate.academy.less06.серриалзация3;

public class NonSerializable {
    public String myData = "";

    public String getMyData() {
        return myData;
    }

    public void setMyData(String myData) {
        this.myData = myData;
    }

    @Override
    public String toString() {
        return "NonSerializable{" +
                "myData='" + myData + '\'' +
                '}';
    }
}
