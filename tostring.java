public class tostring{
    public static void main(String[] args){
        int num1 = 123;
        double num2 = 45.67;
        char c = 'A';
        float num3 = 89.12f;

        System.out.println(Integer.toString(num1));
        System.out.println(Double.toString(num2));
        System.out.println(Character.toString(c));
        System.out.println(num1 + num2 + num3 + c);

        double n = 250.26;
        String str1 = Double.toString(n);
        String[] str2 = str1.split("\\.");
        String int_part = str2[0];
        String fraction_part = str2[01];
        System.out.println("Integer part of " + n + " is: " + int_part);
        System.out.println("Decimal part of " + n + " is: " + fraction_part);
    }
}