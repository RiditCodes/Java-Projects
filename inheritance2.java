class Employee{
    int salary = 15000;
}
class Developer extends Employee{
    int bonus = 5000;
    public static void main(String[] args) {
        Developer d = new Developer();
        System.out.println(d.salary);
        System.out.println(d.bonus);
    }
}