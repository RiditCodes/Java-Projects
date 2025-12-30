class compare3{
    public static void main(String[] args) {
        Integer objA = 15;
        Integer objB = 20;
        Integer objC = 15;

        System.out.println("Comparing a and b: " + objA.compareTo(objB));
        System.out.println("Comparing b and c: " + objB.compareTo(objC));
        System.out.println("Comparing a and c: " + objA.compareTo(objC));

        System.out.println("a equals b: " + objA.equals(objB));
        System.out.println("a equals c: " + objA.equals(objC));
        System.out.println("b equals c: " + objB.equals(objC));
    }
}