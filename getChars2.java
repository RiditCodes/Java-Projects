import java.util.Scanner;

class getChars2{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        char[] charArray = new char[str.length()];
        str.getChars(0, str.length(), charArray, 0);
        
        System.out.print("Extracted characters: \n");
        for(char c : charArray){
            System.out.println(c);
        }
        
        scanner.close();
    }
}