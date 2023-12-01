public class BmiService {

    public int calculate(double weightKg, double heightMeters) {

        int index;
        index = (int) (weightKg / Math.pow(heightMeters, 2));
        return index;


    }

}
