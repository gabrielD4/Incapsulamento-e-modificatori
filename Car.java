public class Car {

    private String brand;

    private String model;

    private String plate;

    private int enginePower;

    private double price;

    private final double iva;





    public Car(String brand, String model, String plate, int enginePower, double price, double iva) throws Exception {
        this.brand = brand;
        this.model = model;
        validPlate(plate);
        this.enginePower = enginePower;
        this.price = price;
        this.iva = iva;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public String getPlate() {
        return this.plate;
    }

    public double getPrice(boolean withIva) {
        if (withIva) {
            return price + price * iva;
        }else {
            return this.price;
        }
    }

    public int getEnginePower() {
        return this.enginePower;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private void setPlate(String plate) throws Exception {
        validPlate(plate);
    }

    private void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public void validPlate(String plate) throws Exception {
        if (plate != null && plate.length() == 7) {
            if (plate.matches("^[a-zA-Z0-9]*$")) {
                this.plate = plate;
            } else {
                throw new Exception("La targa non deve contenere spazi o caratteri speciali.");
            }
        } else {
            throw new Exception("La lunghezza della targa deve essere esattamente di 7 caratteri.");
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", plate='" + plate + '\'' +
                ", enginePower=" + enginePower +
                ", price=" + price +
                ", iva=" + iva +
                '}';
    }
}

