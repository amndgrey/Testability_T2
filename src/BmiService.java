public class BmiService {
    public double calculate(double height, double weight) {

        double countBodyIndex = weight / (height * height);
        return countBodyIndex;
    }
}
