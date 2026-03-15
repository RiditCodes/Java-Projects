import java.util.Scanner;

class Comparison2{
    void greatersmaller(int x, int y){
        if(x > y){
            System.out.println(x + " is greater than " + y);
        } else if(x < y){
            System.out.println(x + " is less than " + y);
        }
    }
}

class Comparenumber extends Comparison2{
    void equal(int x, int y){
        if(x == y){
            System.out.println(x + " is equal to " + y);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        Comparenumber c = new Comparenumber();
        c.greatersmaller(num1, num2);
        c.equal(num1, num2);
        
        sc.close();
    }
}