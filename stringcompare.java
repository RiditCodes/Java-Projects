class stringcompare{
    public static void main(String[] args) {
        String str1 = "Computer";
        String str2 = "Computer";
        String str3 = new String("Computer");


        System.out.println("Using '==':");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        System.out.println("\nUsing 'equals()':");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        System.out.println("\nUsing 'compareTo()':");
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
    }
}