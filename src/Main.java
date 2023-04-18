public class Main {
    public static void main(String[] args) {
        int printMode;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("""
                [0] : all weeks (Default)
                [1] : Week15
                [2] : Week16
                [3] : Week17
                """);

        printMode = scanner.nextInt();

        if (printMode == 0) {
            new Week15().test();
            new Week16().test();
            new Week17().test();
        }
        else if (printMode == 1) new Week15().test();
        else if (printMode == 2) new Week16().test();
        else if (printMode == 3) new Week17().test();

        scanner.close();
    }
}