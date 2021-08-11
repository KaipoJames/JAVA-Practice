public class Math {
    public Math() {
        System.out.println("4 is even: " + isEven(4));
        System.out.println("3 is even: " + isEven(3));
        System.out.println("2 is even: " + isEven(2));
        System.out.println("1 is even: " + isEven(1));
    }

    public boolean isEven(Integer num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Math();
            }
        });
    }
}
