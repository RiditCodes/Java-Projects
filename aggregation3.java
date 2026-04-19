/*
Aggregation is a special form of association. It is a directional association which means it is strictly a one way association. It represents a "has-a" relationship. Association establishes relationship between two classes through objects. Relationship can be one to one, one to many, many to one and many to many.
*/

class Address{
    int street_num;
    String city, state, country;
    Address(int str, String c, String s, String coun){
        street_num = str;
        city = c;
        state = s;
        country = coun;
    }
}
class Student{
    int roll_num;
    String name;
    Address add;
    Student(int r, String n, Address a){
        roll_num = r;
        name = n;
        add = a;
    }
}
class Aggregation{
    public static void main(String[] args) {
        Address addr = new Address(10, "Delhi", "New Delhi", "India");
        Student stu = new Student(22, "Rahul", addr);
        System.out.println(stu.roll_num);
        System.out.println(stu.name);
        System.out.println(stu.add.street_num);
        System.out.println(stu.add.city);
        System.out.println(stu.add.state);
        System.out.println(stu.add.country);
    }
}