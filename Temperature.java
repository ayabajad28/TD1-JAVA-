class Temperature {
    private double value;
    public Temperature(double value) {
        if (value < -273.15) {
            throw new IllegalArgumentException("Temperature cannot be below absolute zero");
        }
        this.value = value;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        if (value < -273.15) {
            throw new IllegalArgumentException("Temperature cannot be below absolute zero");
        }
        this.value = value;
    }
}
class Main {
    public static void main(String[] args) {
        Temperature temp1 = new Temperature(25.0);
        System.out.println("Temperature valide: " + temp1.getValue());  
        try {
            Temperature temp2 = new Temperature(-300.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur: " + e.getMessage());
        }   
        try {
            temp1.setValue(-280.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}