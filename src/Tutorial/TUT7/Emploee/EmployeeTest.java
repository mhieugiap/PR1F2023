package Tutorial.TUT7.Emploee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee em = new Employee("Harry Jones", 50000);
        em.raiseSalary(10); // Harry gets a 10 percent raise
        System.out.println(em.getName() + " is paid $" + em.getSalary() + "/month");
    }
}
