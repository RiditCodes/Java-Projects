class Address{
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Employee{
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println(id + " " + name);
        System.out.println(address.city + ", " + address.state + ", " + address.country);
    }

    public static void main(String[] args){
        Address addr1 = new Address("Mumbai", "Maharashtra", "India");
        Address addr2 = new Address("New York", "NY", "USA");

        Employee e1 = new Employee(101, "Aman", addr1);
        Employee e2 = new Employee(102, "John", addr2);

        e1.display();
        e2.display();
    }
}
