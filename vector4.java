import java.util.*;

class vector4{
    public static void main(String[] args) {
        Vector<String> v = new Vector<>(2);
        v.addElement("Banana");
        v.addElement("Orange");
        v.addElement("Pineapple");
        v.addElement("Apple");
        System.out.println("Size of vector: " + v.size());
        System.out.println("Capacity of vector: " + v.capacity());
        v.addElement("Mango");
        v.addElement("Jackfruit");
        v.addElement("Watermelon");
        System.out.println("Size of vector: " + v.size());
        System.out.println("Capacity of vector: " + v.capacity());
        Enumeration<String> en = v.elements();
        System.out.println("\nElements are-------");
        while(en.hasMoreElements()) {
            System.out.println(en.nextElement());    
        }
    }
}