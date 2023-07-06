package Polymorpism1;

public class Emp {

    String name;
    int salary;
    int hireYear;
    int endYear;

    public void service(String name, int salary, int hireYear, int endYear) {
        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
        this.endYear = endYear;
        System.out.println(name + " " + salary + " " + hireYear + " " + endYear);
    }

    public void calculate() {
        int yearsOfService = endYear - hireYear;
        System.out.println("Years of service: " + yearsOfService);
    }

    public static void main(String[] args) {
        Emp e = new Emp();
        e.service("keerthi", 10000, 2021, 2023);
        e.calculate();
    }
}
