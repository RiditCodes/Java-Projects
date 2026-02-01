import java.util.Vector;

public class vector{
    public static void main(String[] args){
        Vector<Integer> numbers = new Vector<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Vector elements: " + numbers);

        int firstElement = numbers.get(0);
        System.out.println("First element: " + firstElement);

        numbers.remove(1);
        System.out.println("Vector after removal: " + numbers);

        int size = numbers.size();
        System.out.println("Size of Vector: " + size);
    }
}