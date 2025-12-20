class compareToIgnoreCaseMethod{
    public static void main(String args[]){
        String str1 = "Aptech";
        String str2 = "aptech";
        String str3 = "Aptech";
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str2.compareTo(str3));
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.compareToIgnoreCase(str3));
        System.out.println(str2.compareToIgnoreCase(str3));
    }
}