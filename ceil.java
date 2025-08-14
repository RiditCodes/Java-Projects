public class ceil{
    public static void main(String[] args) {
        double number = 5.3;
        double result = Math.ceil(number);
        System.out.println("The ceiling of " + number + " is: " + result);

        double num2 = Math.ceil(10);
        double num3 = Math.ceil(10.1);
        double num4 = Math.ceil(5.5);
        double num5 = Math.ceil(-20);
        double num6 = Math.ceil(-42.4);
        double num7 = Math.ceil(0);

        System.out.println("Ceiling of 10: " + num2);
        System.out.println("Ceiling of 10.1: " + num3);
        System.out.println("Ceiling of 5.5: " + num4);
        System.out.println("Ceiling of -20: " + num5);
        System.out.println("Ceiling of -42.4: " + num6);
        System.out.println("Ceiling of 0: " + num7);
    }
}