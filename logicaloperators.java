public class logicaloperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        
        boolean c = a && b;
        System.out.println("a && b: " + (a && b));
        System.out.println("and operation of a and b is " + c);

        c = a || b;
        System.out.println("a || b: " + (a || b));
        System.out.println("or operation of a and b is " + c);

        c = !(a && b);
        System.out.println("!(a && b): " + !(a && b));
        System.out.println("not operation of a&&b is " + c);

        c = !(a || b);
        System.out.println("!(a || b): " + !(a || b));
        System.out.println("not operation of a||b is " + c);
    }
}