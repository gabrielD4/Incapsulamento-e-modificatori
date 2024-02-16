public class Main {
    public static void main(String[] args) throws Exception {
        Car firstCar = new Car("Ferrari", "Enzo", "Eh78f98", 1800, 800000, 0.1);
        Car secondCar = new Car("Bugatti", "Byron", "SKL9856", 2800, 1500000, 0.1);

//        System.out.println("The selected car is: ");
//        System.out.println("Car brand = " + firstCar.getBrand());
//        System.out.println("Model and engine power = " + firstCar.getModel() + " " + firstCar.getEnginePower());
//        System.out.println("Plate = " + firstCar.getPlate());
//        System.out.println("Price = " + firstCar.getPrice());
//        System.out.println(" ");
//        System.out.println("The selected car is: ");
//        System.out.println("Car brand = " + secondCar.getBrand());
//        System.out.println("Model and engine power = " + secondCar.getModel() + " " + secondCar.getEnginePower());
//        System.out.println("Plate = " + secondCar.getPlate());
//        System.out.println("Price = " + secondCar.getPrice());

        Checkout checkout = new Checkout(new Car[] {firstCar, secondCar,}, new Optional[] {});

        //System.out.println("Checkout: " + checkout); //Perchè non compare la proprietà prezzo nell array cars?
        System.out.println("Checkout: ");
        System.out.println("Articles in the checkout: " + checkout.getCars().length);
        System.out.println("Final price is: " + checkout.getFinalPrice(false));
        System.out.println("Final price with iva is: " + checkout.getFinalPrice(true));
        Car thirdCar = new Car("Lamborghini", "Uranus", "GFH7856", 2000, 2000000, 0.1);
        checkout = new Checkout(new Car[] {firstCar, secondCar, thirdCar}, new Optional[] {});
        System.out.println();
        System.out.println("Checkout update: ");
        System.out.println("Articles in the checkout: " + checkout.getCars().length);
        System.out.println("Final price is: " + checkout.getFinalPrice(false));
        System.out.println("Final price with iva is: " + checkout.getFinalPrice(true));
    }
}
