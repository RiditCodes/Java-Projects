//setLength() method is used to set the length of the buffer within StringBuffer object

class setLength{
    public static void main(String args[]){
        StringBuffer sb1 = new StringBuffer("Aptech");
        System.out.println("Before using setLength()\nsb1: " + sb1);
        System.out.println("Length of sb1: " + sb1.length());
        System.out.println("Capacity of sb1: " + sb1.capacity());
        sb1.setLength(2);
        System.out.println("\nAfter using setLength()\nsb1: " + sb1);
        System.out.println("Length of sb1: " + sb1.length());
        System.out.println("Capacity of sb1: " + sb1.capacity());
        StringBuffer sb2 = new StringBuffer("Computer");
        System.out.println("\nBefore using setLength()\nsb2: " + sb2);
        System.out.println("Length of sb2: " + sb2.length());
        System.out.println("Capacity of sb2: " + sb2.capacity());
        sb2.setLength(10);
        System.out.println("\nAfter using setLength()\nsb2: " + sb2);
        System.out.println("Length of sb2: " + sb2.length());
        System.out.println("Capacity of sb2: " + sb2.capacity());
        StringBuffer sb3 = new StringBuffer("Education");
        System.out.println("\nBefore using setLength()\nsb3: " + sb3);
        System.out.println("Length of sb3: " + sb3.length());
        System.out.println("Capacity of sb3: " + sb3.capacity());
        sb3.setLength(0);
        System.out.println("\nAfter using setLength()\nsb3: " + sb3);
        System.out.println("Length of sb3: " + sb3.length());
        System.out.println("Capacity of sb3: " + sb3.capacity());
    }
}