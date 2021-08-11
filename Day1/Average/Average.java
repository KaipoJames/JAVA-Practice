package Average;

public class Average {
    public static void main(String[] args) {
        System.out.println(getAverage(32.5, 12.6, 80.4));
    }

    public static Double getAverage(Double num1, Double num2, Double num3) {
        return (num1 + num2 + num3) / 3;
    }
}
