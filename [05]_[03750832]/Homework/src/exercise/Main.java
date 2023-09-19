package exercise;

public class Main {
    public static void main(String[] args) {
        HybridCar iCar = new HybridCar(); //create object of class HybridCar
        iCar.refuel(20);
        iCar.drive();
        iCar.recharge(5);
        //call methods from the class HybridCar

        HybridAmphibian iAmphibian = new HybridAmphibian(); //create object of class HybridAmphibian
        iAmphibian.recharge(10);
        iAmphibian.sail();
        iAmphibian.drive();
        iAmphibian.refuel(15);
        //call methods from the class HybridCar and HybridAmphibian
    }
}
/* Output
The tank contains 20.0 liters now
I’m driving
The battery has a charge of 5.0 kWh now
The battery has a charge of 10.0 kWh now
I'm sailing
I’m driving
The tank contains 15.0 liters now
 */
