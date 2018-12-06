public class CelciusToFahrenheit implements iConverter {
    @Override
    public double convert(double input) {
        // return input = ((input + 32) * 9) / 5;
        return input = (input * 1.8) + 32;
    }

}
