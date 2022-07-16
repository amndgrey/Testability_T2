public class Main {

    public static void main(String[] args) {
        BmiService bmiService = new BmiService();

        double bodyIndex = bmiService.calculate(1.71, 55);
        System.out.println(bodyIndex);
    }
}
