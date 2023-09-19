package exercise;

public class HybridCar implements IBatteryPowered, IFuelPowered, IVehicle {

    private double charge = 0; //initialize attribute
    private double tank = 0; //initialize attribute

    @Override
    public void refuel(double liters) {
        this.tank = tank + liters;
        System.out.println("The tank contains " + tank + " liters now");
    }//implement method that increases the value of tank and prints a string

    @Override
    public void recharge(double kWh) {
        this.charge = charge + kWh;
        System.out.println("The battery has a charge of " + charge + " kWh now");
    }//implement method that increases the value of charge and prints a string

    @Override
    public void drive() {
        System.out.println("I’m driving");
        //implement method that prints a string
    }
}
