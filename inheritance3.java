interface Learner{
    default void display1(){
        System.out.println("This is a student.");
    }
}

interface Teacher{
    default void display2(){
        System.out.println("This is a teacher.");
    }
}

class Instructor implements Learner, Teacher{
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.display1();
        instructor.display2();
    }
}