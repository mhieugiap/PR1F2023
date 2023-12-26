package Tutorial.TUT5;

public class Demo {
    public static void main(String[] args) {
        double base = 12;
        double height = 6.5;
        double areaA = getArea(base, height);
        System.out.println(areaA);
        double areaB = getArea(6, 5.2);
        System.out.println(getArea(6, 5.2));
    }

    public static double getArea(double base, double height) {
        double area;
        area = (base * height) / 2;
        return area;
    }

}
