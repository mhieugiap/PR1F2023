package Tutorial.TUT7.Emploee;

public class Employee {
    public String name;
    double salary;
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public void raiseSalary(double byPercent){
        double increase = salary*byPercent/100;
        salary+=increase;
    }
}

