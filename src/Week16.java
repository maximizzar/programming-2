import java.util.Arrays;
public class Week16 {
    private Integer task = 0;
    public boolean hat222(int number) {
        while (number > 0) {
            int I = number % 10;
            int II = number % 100 / 10;
            int III = number % 1000 / 100;
            if(I == 2 && I == II && II == III) return true;
            number = number / 10;
        }
        return false;
    }
    public boolean hatHoechstens(int number, int n) {
        int counter = 0;
        while (number != 0) {
            if(number % 10 == 2)
                counter++;
            number = number / 10;
        }
        return counter <= n;
    }
    public boolean hatKein222(int number) {
        while (number > 0) {
            int I = number % 10;
            int II = number % 100 / 10;
            int III = number % 1000 / 100;

            if(I == 2 && I == II && II == III) return false;
            number = number / 10;
        }
        return true;
    }
    public boolean hatMindestens(int number, int n) {
        int counter = 0;
        while (number > 0) {
            if(number % 10 == 2) counter++;
            number = number / 10;
        }
        return counter >= n;
    }
    public int linkeQuersummeN(int number, int N) {
        int returnValue = 0, sign = 1;
        if(number < 0) {
            sign = -1;
            number = Math.abs(number);
        }
        N = String.valueOf(number).length() - N;
        while (N > 0) {
            number = number / 10;
            N--;
        }
        while (number != 0) {
            returnValue = returnValue + number % 10;
            number = number / 10;
        }
        return returnValue * sign;
    }
    public int pruefsumme(int[] array, int mod) {
        int returnValue = 0;
        for (int value : array) returnValue += value;
        return returnValue % mod;
    }
    public int quersumme(int number) {
        int returnValue = 0, sign = 1;
        if(number < 0) {
            sign = -1;
            number = Math.abs(number);
        }
        while (number > 0) {
            returnValue = returnValue + number % 10;
            number = number / 10;
        }
        return returnValue * sign;
    }
    public int quersummeN(int x, int N) {
        int returnValue = 0, sign = 1;
        if(x < 0) {
            sign = -1;
            x = Math.abs(x);
        }
        for (int i = 0; i < N; i++) {
            returnValue += x % 10;
            x /= 10;
        }
        return returnValue * sign;
    }
    public double sumOfMatrix(double[][] matrix) {
        double sumOfMatrix = 0;

        for (double[] array : matrix)
            for (double value : array) sumOfMatrix += value;
        return sumOfMatrix;
    }
    public double sumOfSquares(double[] array) {
        double sumOfSquares = 0;

        for (double value : array)
            sumOfSquares += Math.pow(value, 2);
        return sumOfSquares;
    }
    public double[][] code11(double[][] matrix) {
        double[][] baum = new double[matrix.length][1];
        for (int i = 0; i < matrix.length; i++) {
            baum[i][0] = matrix[i][0];
        }
        return baum;
    }
    public static double[][] code12(double[][] matrix){
        double[][] baum = new double[matrix.length][1];
        for (int colum = 0; colum < matrix.length; colum++) {
            int sum = 0;
            for (int row = 0; row < matrix[colum].length; row++)
                sum += matrix[colum][row];
            baum[colum][0] = sum;
        }
        return baum;
    }
    public double[][] code13(double[][] matrix) {
        double[][] baum = new double[1][matrix[0].length];

        for (double[] array : matrix)
            for (int index = 0; index < array.length; index++)
                baum[0][index] += array[index];
        return baum;
    }
    public double sumOfRow2(double[][] matrix) {
        if (matrix.length < 2) return 0.0;
        double sumOfRow2 = 0.0;

        for (int i = 0; i < matrix[1].length; i++)
            sumOfRow2 += matrix[1][i];
        return sumOfRow2;
    }
    public double sumOfColOne(double[][] matrix){
        double sumOfColOne = 0;
        for (double[] array : matrix) {
            if (array.length >= 2) sumOfColOne += array[1];
            sumOfColOne += 0;
        }
        return sumOfColOne;
    }

    /*
        extracted functions
    */

    public void test() {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
        test8();
        test9();
        test10();
        test11();
        test12();
        test13();
        test14();
        test15();
    }
    private void test15() {
        printHeading();
        for (double[][] matrix : Arrays.asList(
                new double[][]{},
                new double[][]{{1., 1., 1.}, {2., 2., 2.}, {3., 3., 3.}})) {
            System.out.println(sumOfColOne(matrix));
        }
    }
    private void test14() {
        printHeading();
        for (double[][] matrix : Arrays.asList(
                new double[][]{},
                new double[][]{{1., 1., 1.}, {2., 2., 2.}, {3., 3., 3.}},
                new double[][]{{1., 2.}, {1., 2.}, {1., 2.}},
                new double[][]{{-3.0, 1.0, 2.0, 3.0}},
                new double[][]{{1., 2.}, {1., 0.}})) {
            System.out.println(sumOfRow2(matrix));
        }
    }
    private void test13() {
        printHeading();
        for (double[][] matrix : Arrays.asList(
                new double[][]{{1.0}},
                new double[][]{{1., 1., 1.}, {2., 2., 2.}, {3., 3., 3.}},
                new double[][]{{1., 2.}, {1., 2.}, {1., 2.}},
                new double[][]{{-3.0, 1.0, 2.0, 3.0}})) {
            System.out.println(Arrays.deepToString(code13(matrix)));
        }
    }
    private void test12() {
        printHeading();
        for (double[][] matrix : Arrays.asList(
                new double[][]{},
                new double[][]{{1., 1., 1.}, {2., 2., 2.}, {3., 3., 3.}})) {
            System.out.println(Arrays.deepToString(code12(matrix)));
        }
    }
    private void test11() {
        printHeading();
        for (double[][] matrix : Arrays.asList(
                new double[][]{},
                new double[][]{{1., 1., 1.}, {2., 2., 2.}, {3., 3., 3.}},
                new double[][]{{1., 2.}, {1., 2.}, {1., 2.}},
                new double[][]{{-3.0, 1.0, 2.0, 3.0}},
                new double[][]{{1., 2.}, {1., 0.}},
                new double[][]{{-5., 0.}, {-1., 1.}, {-2., 2.}})) {
            System.out.println(Arrays.deepToString(code11(matrix)));
        }
    }
    private void test10() {
        printHeading();
        for (double[] doubles : Arrays.asList(new double[]{1., 1., 1.}, new double[]{1., 2., 3.})) {
            System.out.println(sumOfSquares(doubles));
        }
    }
    private void test9() {
        printHeading();
        for (double[][] matrix : Arrays.asList(
                new double[][]{},
                new double[][]{{1., 1., 1.}, {2., 2., 2.}, {3., 3., 3.}})) {
            System.out.println(sumOfMatrix(matrix));
        }
    }
    private void test8() {
        printHeading();
        for (int i : new int[]{1, 2, 5}) {
            System.out.println(quersummeN(333, i));
        }
    }
    private void test7() {
        printHeading();
        for (int i : new int[]{333, -11}) {
            System.out.println(quersumme(i));
        }
    }
    private void test6() {
        printHeading();
        System.out.println(pruefsumme(new int[] { 10, 10, 11 }, 5));
        System.out.println(pruefsumme(new int[] { 10, 10, 11, 10 }, 12));
        System.out.println(pruefsumme(new int[] {}, 5));
    }
    private void test5() {
        printHeading();
        System.out.println(linkeQuersummeN(4333, 1));
        System.out.println(linkeQuersummeN(4333, 2));
        System.out.println(linkeQuersummeN(331, 5));
        System.out.println(linkeQuersummeN(12345, 3));
        System.out.println(linkeQuersummeN(-11111, 2));
    }
    private void test4() {
        printHeading();
        System.out.println(hatMindestens(3332, 1));
        System.out.println(hatMindestens(2022201, 5));
        System.out.println(hatMindestens(2022202, 5));
    }
    private void test3() {
        printHeading();
        for (int i : new int[]{333, 2022201, 202200222}) {
            System.out.println(hatKein222(i));
        }
    }
    private void test2() {
        printHeading();
        System.out.println(hatHoechstens(3332, 1));
        System.out.println(hatHoechstens(2022201, 5));
        System.out.println(hatHoechstens(2022222, 5));
    }
    private void test1() {
        printHeading();
        for (int i : new int[]{333, 2022201, 202200222}) {
            System.out.println(hat222(i));
        }
    }
    private void printHeading() {
        this.task++;
        System.out.println("\n<> task: " + this.task);
    }
}
