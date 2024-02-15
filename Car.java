public class Car {

    private String brand;

    private String model;

    private String plate;

    private int enginePower;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", plate=" + plate +
                ", enginePower=" + enginePower +
                '}';
    }

    public Car(String brand, String model, String plate, int enginePower) throws Exception {
        this.brand = brand;
        this.model = model;
        // With this exception I want the program to stop if the plate doesn't match the requirements,
        // and to alert the user that they tried to insert a not valid plate license number.
        if (plate != null && plate.length() == 7) {
            if (plate.matches("^[a-zA-Z0-9]*$")) {
                this.plate = plate;
            } else {
                throw new Exception ("La targa non deve contenere spazi o caratteri speciali.");
            }
        } else {
            throw new Exception("La lunghezza della targa deve essere esattamente di 7 caratteri.");
        }
        this.enginePower = enginePower;
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

    public int getEnginePower() {
        return this.enginePower;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPlate(String plate) throws Exception {
        if (plate != null && plate.length() == 7) {
            if (plate.matches("^[a-zA-Z0-9]*$")) {
                this.plate = plate;
            } else {
                throw new Exception ("La targa non deve contenere spazi o caratteri speciali.");
            }
        } else {
            throw new Exception("La lunghezza della targa deve essere esattamente di 7 caratteri.");
        }
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

}

