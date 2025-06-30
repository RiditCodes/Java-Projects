class Student{
    void name() {
        System.out.println("Student's name is Ridit");
    }
}

public class inheritance extends Student{
    public static void main(String[] args) {
        inheritance obj = new inheritance();
        obj.name();
    }
}