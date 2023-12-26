package Tutorial.TUT6.Activity2;

public class Car {
    // attributes
    double efficiency; // km/liters
    double gas; // liters

    // constructor
    public Car(double efficiency) {
        this.efficiency = efficiency;
        gas = 0;
    }

    // methods
    public void addGas(double liter) {
        gas += liter; //gas = gas + liter
    }

    public void drive(double km) {
        double gasUsed = km / efficiency;
        if (gasUsed <= gas) {
            gas -= gasUsed;
            System.out.println("Car drove for "
                    + km + "km and used " + gasUsed + " liters of gas.");
        } else {
            km = gas * efficiency;
            System.out.println("Car drove for "
                    + km + "km and used up all " + gas + " liters of gas.");
            gas = 0; // out of gas
        }
    }

    public double getGasInTank() {
        return gas;
    }
}
