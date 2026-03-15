//Single Inheritance

class Calculation{
    int z;
    void addition(int x, int y){
        z = x + y;
        System.out.println(x + " + " + y + " = " + z);
    }
    void subtraction(int x, int y){
        z = x - y;
        System.out.println(x + " - " + y + " = " + z);
    }
}

class Calculate extends Calculation{
    void multiplication(int x, int y){
        z = x * y;
        System.out.println(x + " * " + y + " = " + z);
    }
    public static void main(String[] args){
        int x = 40, y = 25;
        Calculate c = new Calculate();
        c.addition(x, y);
        c.subtraction(x, y);
        c.multiplication(x, y);
    }
}