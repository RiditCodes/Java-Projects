import java.util.*;

class vector5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>(0);
        System.out.print("Enter the number of elements to add to the vector: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Enter an element: ");
            v.addElement(sc.nextInt());
        }

        System.out.println("\nVector: " + v);
        System.out.println("Size: " + v.size());
        System.out.println("Capacity: " + v.capacity());

        boolean contains4 = v.contains(4);
        System.out.println("Contains 4: " + contains4);

        System.out.println("Iterating through the vector:");
        Enumeration<Integer> en = v.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());    
        }

        sc.close();
    }
}