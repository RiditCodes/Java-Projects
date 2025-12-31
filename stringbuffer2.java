/*
length() returns the number of characters present in a buffer.
capacity() returns buffer storing capacity

StringBuffer()
This constructor creates a stringbuffer object with an empty string and a buffer capacity of 16 characters to store.
StringBuffer(int size)
This constructor creates a stringbuffer object with an empty string and a buffr capacity of initialCapacity.
StringBuffer(String str)
This constructor creates a stringbuffer object with a string str and a buffer capacity of 16 + str.length().
StringBuffer(CharSequence seq)
This constructor creates a stringbuffer object with a Charsequence seq and a buffer capacity of 16 + seq.length().
*/

class stringbuffer2{
    public static void main(String[] args){
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer(45);
        StringBuffer sb3 = new StringBuffer("computer");
        String str = "education";
        StringBuffer sb4 = new StringBuffer(str);

        System.out.println("sb1 = " + sb1 + "\nLength of sb1 = " + sb1.length() + "\nCapacity of sb1 = " + sb1.capacity() + "\n");
        System.out.println("sb2 = " + sb2 + "\nLength of sb2 = " + sb2.length() + "\nCapacity of sb2 = " + sb2.capacity() + "\n");
        System.out.println("sb3 = " + sb3 + "\nLength of sb3 = " + sb3.length() + "\nCapacity of sb3 = " + sb3.capacity() + "\n");
        System.out.println("sb4 = " + sb4 + "\nLength of sb4 = " + sb4.length() + "\nCapacity of sb4 = " + sb4.capacity());
    }
}