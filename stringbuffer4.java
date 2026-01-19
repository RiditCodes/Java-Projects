class stringbuffer4{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Aptech Computer Education");
        System.out.println("Original StringBuffer: " + sb);
        System.out.println("Original length: " + sb.length());
        
        sb.setLength(5);
        System.out.println(sb);
        System.out.println("New length: " + sb.length());
        
        sb.setLength(10);
        System.out.println(sb);
        System.out.println("New length: " + sb.length());
    }
}