class ensureCapacity2{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Aptech");
        System.out.println(sb.capacity());
        sb.append("Computer Education");
        System.out.println(sb.capacity());
        sb.ensureCapacity(20);
        System.out.println(sb.capacity());
        sb.ensureCapacity(40);
        System.out.println(sb.capacity());
    }
}