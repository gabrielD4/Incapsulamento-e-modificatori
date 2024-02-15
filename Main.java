public class Main {
    public static void main(String[] args) throws Exception {
        Car firstCar = new Car("Ferrari", "Enzo", "Eh78f98", 1800);
        Car secondCar = new Car("Bugatti", "Byron", "SKL9856", 2800);
        System.out.println("The selected car is: ");
        System.out.println("Car brand = " + firstCar.getBrand());
        System.out.println("Model and engine power = " + firstCar.getModel() + " " + firstCar.getEnginePower());
        System.out.println("Plate = " + firstCar.getPlate());
        System.out.println(" ");
        System.out.println("The selected car is: ");
        System.out.println("Car brand = " + secondCar.getBrand());
        System.out.println("Model and engine power = " + secondCar.getModel() + " " + secondCar.getEnginePower());
        System.out.println("Plate = " + secondCar.getPlate());
    }
}
