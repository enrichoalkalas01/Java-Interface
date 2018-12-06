public class FahrenheitToCelcius implements iConverter {
    @Override
    public double convert(double input) {
        return input = ((input - 32) * 5) / 9;
    }
}
