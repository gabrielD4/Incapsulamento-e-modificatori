import java.util.Arrays;

public class Checkout {

    private Car[] cars;

    private Optional[] optionals;


    public Checkout(Car[] cars, Optional[] optionals) {
        setCars(cars);
        this.optionals = optionals;
    }

    public Car[] getCars() {
        return cars;
    }

    public Optional[] getOptionals() {
        return optionals;
    }

    public double getFinalPrice(boolean withIva) {
        double finalPrice = 0.0;
        for (int i = 0; i < cars.length; i++) {
            finalPrice += cars[i].getPrice(withIva);
        }
        return finalPrice;
    }


    public void setCars(Car[] cars) {
        this.cars = cars;
        }


    @Override
    public String toString() {
        return "Checkout{" +
                "cars=" + Arrays.toString(cars) +
                ", optionals=" + Arrays.toString(optionals) +
                '}';
    }
}
