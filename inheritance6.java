class Pupil{
    int id = 123;
    String name = "Rajesh Sharma";
    void display1(){
        System.out.println(id);
        System.out.println(name);
    }
}

class Tutor extends Pupil{
    int salary = 50000;
    void display2(){
        System.out.println(salary);
    }
}

class Headmaster extends Tutor{
    String school = "High School";
    void display3(){
        System.out.println(school);
    }
}

class Principal extends Headmaster{
    int bonus = 30000;
    void display4(){
        System.out.println(bonus);
    }

    public static void main(String[] args){
        Principal p = new Principal();
        p.display1();
        p.display2();
        p.display3();
        p.display4();

        Tutor t = new Tutor();
        t.display1();
        t.display2();
    }
}