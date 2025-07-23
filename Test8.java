// Temperature Converter (Celsius to Fahrenheit)

class Temperature {
    private double celsius;

    public void setCelsius(double c) {
        celsius = c;
    }

    public double getFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }
}

public class Test8 {
    public static void main(String[] args) {
        Temperature t = new Temperature();
        t.setCelsius(25);
        System.out.println("Fahrenheit: " + t.getFahrenheit());
    }
}
