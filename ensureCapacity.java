/* 
If we want to preallocate room for a certain number of characters after a StringBuffer has been created, we can use ensureCapacity() to set the size of the buffer.
*/

class ensureCapacity{
    public static void main(String args[]){
        StringBuffer sb1 = new StringBuffer("Aptech");
        System.out.println(sb1.capacity());
        sb1.ensureCapacity(10);
        System.out.println(sb1.capacity());
        
        StringBuffer sb2 = new StringBuffer("Computer");
        System.out.println(sb2.capacity());
        sb2.ensureCapacity(30);
        System.out.println(sb2.capacity());

        StringBuffer sb3 = new StringBuffer();
        System.out.println(sb3.capacity());
        sb3.ensureCapacity(40);
        System.out.println(sb3.capacity());

        StringBuffer sb4 = new StringBuffer();
        System.out.println(sb4.capacity());
        sb4.ensureCapacity(-40);
        System.out.println(sb4.capacity());
    }
}