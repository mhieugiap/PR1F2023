package Tutorial.TUT1;

public class PrintMyAge {
    public static void main(String[] args) {
        int birthYear = 2002;
        int currentYear = 2023;
        int age = currentYear - birthYear;
        System.out.print("I was born in " + birthYear + ". ");
        System.out.println("This year is " + currentYear + ".");
        System.out.println("Therefore, my age is: \n" + age);
    }
}
