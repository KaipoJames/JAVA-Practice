public class Numbers {
    public static void main(String[] args) {
        printASCII('m');
        printASCII('w');
        printASCII('a');
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
}
