import java.util.Scanner;

class Builder{
    Builder(String name){
        System.out.println("Name of builder: " + name);
    }
}
class Labourer{
    Labourer(String name, int age){
        System.out.println("Name of labourer: " + name);
        System.out.println("Age of labourer: " + age);
    }
}
public class constructor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the builder: ");
        String name1 = sc.nextLine();

        System.out.print("Enter the name of the labourer: ");
        String name2 = sc.nextLine();
        
        System.out.print("Enter the age of the labourer: ");
        int age = sc.nextInt();

        Builder b = new Builder(name1);
        Labourer l = new Labourer(name2, age);

        sc.close();
    }
}