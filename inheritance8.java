class A{
    A(){
        System.out.println("within A");
    }
}
class B extends A{
    B(){
        System.out.println("within B");
    }
}
class C extends A{
    C(){
        System.out.println("within C");
    }
}
class D extends A{
    D(){
        System.out.println("within D");
    }
}
class Hierarchical{
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();
        D objD = new D();
    }
}
