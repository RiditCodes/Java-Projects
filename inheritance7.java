//Multilevel Inheritance

class Car{
    Car(){
        System.out.println("within Car class");
    }
    void vehicleType(){
        System.out.println("Vehicle type: Car");
    }
}

class Maruti extends Car{
    Maruti(){
        System.out.println("within Maruti class");
    }
    void brand(){
        System.out.println("Brand: Maruti");
    }
}

class Maruti800 extends Maruti{
    Maruti800(){
        System.out.println("within Maruti800 class");
    }
    void carModel(){
        System.out.println("Car Model: Maruti800");
    }
}

class Multilevel{
    public static void main(String[] args) {
        Maruti800 object = new Maruti800();
        object.vehicleType();
        object.brand();
        object.carModel();
    }
}