public class valueofprog{
    public static void main(String[] args) {
        Integer a = Integer.valueOf(20);
        //Float b = Float.valueOf("20");
        Double c = Double.valueOf("20");

        System.out.println(a);
        //System.out.println(b);
        System.out.println(c);

        Integer d = Integer.valueOf("20", 8);
// Base of Octal Number System is 8. the value of 20 is converted into equivalent Decimal Number System
        System.out.println(d);
        d = Integer.valueOf("20", 16);
        System.out.println(d);
    }
}