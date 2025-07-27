public class parsing{
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str);
        double d = Double.parseDouble(str);
        int y = Integer.parseInt("50", 8);
        int z = Integer.parseInt("50", 10);
        int a = Integer.parseInt("50", 16);
        int b = Integer.parseInt("-cc", 16);

        System.out.println(num);
        System.out.println(d);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
    }
}