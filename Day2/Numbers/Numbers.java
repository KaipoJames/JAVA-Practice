import java.util.ArrayList;

public class Numbers {
    public static void main(String[] args) {
        printASCII('m');
        printASCII('w');
        printASCII('a');

        ArrayList<Double> results = getDivisionResults(7.0, 3.0);
        System.out.println(results.get(0));
        System.out.println(results.get(1));
    }

    public static void printASCII(Character c) {
        Integer code = getASCII(c);
        StringBuilder sb = new StringBuilder("The ASCII Code for ");
        sb.append(c);
        sb.append(" is " + code);
        System.out.println(sb);
    }
    public static int getASCII(Character c) {
        return (int)c;
    }

    public static ArrayList<Double> getDivisionResults(Double num1, Double num2){
        Double quotient = num1 / num2;
        Double remainder = num1 % num2;
        ArrayList<Double> results = new ArrayList<Double>();
        results.add(quotient);
        results.add(remainder);
        return results;
    }
}
