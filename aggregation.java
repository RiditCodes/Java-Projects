class class1{
    class1(){
        System.out.println("parent class constructor");
    }
}
class class2 extends class1{
    class2(){
        super();
        System.out.println("child class constructor");
    }
}
class SuperMethod{
    public static void main(String[] args) {
        class2 c2 = new class2();
    }
}