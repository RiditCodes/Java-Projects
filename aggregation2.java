class Animal{
    String name;
    
    Animal(String name){
        System.out.println("Name of animal is: " + name);
    }
}

class Dog extends Animal{
    String breed;
    
    Dog(String name, String breed) {
        super(name);
        System.out.println("Breed of dog is: " + breed);
    }
}

class Cat extends Animal{
    String color;
    
    Cat(String name, String color) {
        super(name);
        System.out.println("Color of cat is: " + color);
    }
}

class SuperMethod2{
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        
        System.out.println();
        
        Cat cat = new Cat("Whiskers", "Orange");
    }
}
