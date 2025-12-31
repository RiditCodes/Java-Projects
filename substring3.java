class substring3{
    public static void main(String args[]){
        String str1 = "Aptech Computer Education";
        String str2 = str1.substring(7, 15);
        String str3 = str1.substring(7);
        String str4 = str1.substring(0, 7) + "Software" + str1.substring(15);
        String str5 = "Program of C++".substring(0, 11) + "Java";
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }
}