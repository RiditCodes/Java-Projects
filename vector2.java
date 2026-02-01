/*Vector class is located in java.util package. Vector supports dynamic array i.e. it can grow or shrink as required. It does not support primitive data types such as int, float, char, etc.*/

import java.util.Vector;

class vector2{
    public static void main(String[] args){
        Vector v = new Vector();
        v.add("1");
        v.add("2");
        v.add("3");
        System.out.println(v.get(0));
        System.out.println(v.get(1));
        System.out.println(v.get(2));
    }
}