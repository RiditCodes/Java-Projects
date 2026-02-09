import java.util.Vector;

class vector3{
    public static void main(String args[]){
        Vector<String> vec = new Vector<String>();
        vec.addElement("Hello");
        vec.addElement("World");

        System.out.println(vec);
        System.out.println("Capacity: " + vec.capacity());
    }
}