public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double successRate = switch (speed) {
            case 1, 2, 3, 4 -> successRate = 1.0;
            case 5, 6, 7, 8 -> successRate = 0.9;
            case 9 -> successRate = 0.8;
            case 10 -> successRate = 0.77;
            default -> successRate = 0.0; // veya uygun bir varsayılan değer
        };
        double numberOfProducedCars = 221 * speed;

        return numberOfProducedCars * successRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
