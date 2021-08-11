public class Swapper {

    Integer a = 7;
    Integer b = 4;

    public Swapper() {
        printValues("BEFORE");
        swap();
        printValues("AFTER");
    }

    public void printValues(String when) {
        System.out.println("\n" + when + " SWAP");
        System.out.println("a = " + this.a);
        System.out.println("b = " + this.b);
    }

    public void swap() {
        Integer tmp;
        tmp = this.a;
        this.a = this.b;
        this.b = tmp;
    }
    
    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Swapper();
            }
        });
    }
}


