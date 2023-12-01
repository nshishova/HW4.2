public class Main {

    public static void main(String[] args) {

        System.out.println("Adult BMI Calculator");
        BmiService service = new BmiService();
        double height = 1.87; // meters
        double weight = 98; // kilograms
        int index = service.calculate(weight, height);
        System.out.println();
        System.out.println( index);


    }
}
