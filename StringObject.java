class StringObject{
    public static void main(String[] args) {
        String str1 = "Software";
        String str2 = new String(str1);
        String str3 = new String("Hardware");

        char[] ch = {'N', 'e', 't', 'w', 'o', 'r', 'k'};
        String str4 = new String(ch);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}