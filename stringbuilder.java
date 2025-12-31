/*
Difference between StringBuffer and StringBuilder
StringBuffer is synchronised i.e. thread safe. This means two threads can't call the methods of StringBuffer simultaneously. StringBuffer is less efficient than StringBuilder.
StringBuilder is non-synchronised i.e. not thread safe. This means two threads can't call the methods of StringBuilder simultaneously. StringBuilder is more efficient than StringBuffer.
*/

class stringbuilder{
    public static void main(String args[]){
        StringBuilder sb1 = new StringBuilder("Aptech");
        
        sb1.append(" Education");
        System.out.println(sb1);

        sb1.insert(7, "Computer ");
        System.out.println(sb1);
        
        sb1.delete(10, 15);
        System.out.println(sb1);
        
        sb1.replace(7, 10, "Software");
        System.out.println(sb1);
        
        sb1.reverse();
        System.out.println(sb1);

    }
}