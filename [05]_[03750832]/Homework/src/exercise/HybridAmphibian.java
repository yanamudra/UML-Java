package exercise;

public class HybridAmphibian extends HybridCar implements IVessel{
    @Override
    public void sail() {
        System.out.println("I'm sailing");
    }//implement method that prints a string
}
