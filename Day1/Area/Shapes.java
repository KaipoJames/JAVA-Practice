package Area;

import java.text.DecimalFormat;

public class Shapes {
    public static void main(String[] args) {
        //System.out.println(getRectArea(7.4, 4.5));
        System.out.println(getCircleArea(54.1));
    }

    public static Double getRectArea(Double length, Double width) {
        String area = new DecimalFormat("#.##").format(length * width);
        return Double.parseDouble(area);
    }

    public static Double getCircleArea(Double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

}
