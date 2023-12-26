package Tutorial.TUT1;

public class BMICalculator {
    public static void main(String[] args) {
        double w = 60;
        double h = 1.74;
        double bmi = w / (h * h);
        System.out.println("My weight: " + w + " (kg)");
        System.out.println("My height: " + h + " (m)");
        System.out.println("My BMI: " + bmi + " (kg/m2)");
    }
}
