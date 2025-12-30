class substring{
    public static void main(String[] args){
        String str1 = "Futurite Coding Academy";
        String str2 = str1.substring(9, 15);
        String str3 = str1.substring(9);
        String str4 = str1.substring(0, 9) + "Programming" + str1.substring(15);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}