package mate.academy.less02.constr;

public class Student extends Human {
    private int a;

    public Student(int x) {
        super(5, "w");
        a = x;
      //  super();
        System.out.println("Student Constr");
    }
}
