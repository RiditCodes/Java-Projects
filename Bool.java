public class Bool{
    public static void main(String[] args){
        boolean a, b, c, d;
        a = true;
        b = false;

        c = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        if (a == true) {
            System.out.println("Futurite");
        } else if (c == true) {
            System.out.println("education");
        }

        d = 6 > 10;
        d = true;

        System.out.println("d = " + d);
    }
}