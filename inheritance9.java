class Person{
    int age = 20;
    Person(){
        System.out.println("In Person class");
    }
}
class Worker extends Person{
    int salary = 50000;
    Worker(){
        System.out.println("In Worker class");
    }
}
class Owner extends Person{
    int salary = 100000;
    Owner(){
        System.out.println("In Owner class");
    }
}
class Farmer extends Person{
    int crops_grown = 100;
    Farmer(){
        System.out.println("In Farmer class");
    }
}
public class inheritance9{
    public static void main(String[] args){
        Worker w = new Worker();
        System.out.println("Worker's age: " + w.age);
        System.out.println("Worker's salary: " + w.salary);

        Owner o = new Owner();
        System.out.println("Owner's age: " + o.age);
        System.out.println("Owner's salary: " + o.salary);

        Farmer f = new Farmer();
        System.out.println("Farmer's age: " + f.age);
        System.out.println("Crops grown by Farmer: " + f.crops_grown);
    }
}