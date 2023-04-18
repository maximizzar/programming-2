import java.util.Arrays;

public class Week15 {
    private Integer task = 0;
    public boolean checkPredecessor(int[] array) {
        int lessThanPredecessorCount = 0;
        for (int index = 1; index < array.length; index++)
            if(array[index - 1] < array[index]) lessThanPredecessorCount++;
        return lessThanPredecessorCount <= 2;
    }
    public static boolean checkPredecessor2(int[] array) {
        int higherThanPredecessorCount = 0;
        for (int index = 0; index < array.length - 1; index++)
            if (array[index + 1] > array[0]) higherThanPredecessorCount++;
        return higherThanPredecessorCount >= 2;
    }
    public double computeNorm(double[] array) {
        double norm = 0;
        for (double value : array)
            norm += value * value;
        return norm;
    }
    public boolean containsMultipleOf(int[] array, int base) {
        for (int value : array)
            if (value % base == 0)
                return true;
        return false;
    }
    public boolean containsMultipleOf2(int[] x, int base) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] % base != 0 || i == x.length - 1) continue;
            for (int j = i++; j < x.length; j++)
                if (x[j] % base == 0) return false;
        }
        return true;
    }
    public boolean istPalindrom(String string) {
        for (int first = 0, last = string.length() - 1; first < string.length(); first++, last--)
            if (string.charAt(first) != string.charAt(last)) return false;
        return true;
    }
    public int fromBinaryString(String binString) {
        int decimal = 0;
        for (int i = 0, j = binString.length() - 1; i < binString.length(); i++, j--)
            if (binString.charAt(j) == '1') decimal = (int) (decimal + Math.pow(2, i));
        return decimal;
    }
    public void test() {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    private void task7() {
        printHeading();
        for (String s : Arrays.asList("100", "101")) {
            System.out.println(fromBinaryString(s));
        }
    }
    private void task6() {
        printHeading();
        for (String s : Arrays.asList("tot", "toto", "anna")) {
            System.out.println(istPalindrom(s));
        }
    }
    private void task5() {
        printHeading();
        System.out.println(containsMultipleOf2(new int[] {}, 2));
        System.out.println(containsMultipleOf2(new int[] { 1, 1, 1 }, 2));
        System.out.println(containsMultipleOf2(new int[] { 5, 5, 1 }, 5));
        System.out.println(containsMultipleOf2(new int[] { -3, 2, -3 }, 3));
    }
    private void task4() {
        printHeading();
        System.out.println(containsMultipleOf(new int[] {}, 2));
        System.out.println(containsMultipleOf(new int[] { 1, 1, 1 }, 2));
        System.out.println(containsMultipleOf(new int[] { 1, 1, 3 }, 3));
    }
    private void task3() {
        printHeading();
        for (double[] doubles : Arrays.asList(new double[]{}, new double[]{1., 1., 1.})) {
            System.out.println(computeNorm(doubles));
        }
    }
    private void task2() {
        printHeading();
        for (int[] ints : Arrays.asList(
                new int[]{},
                new int[]{1, 3, 1},
                new int[]{-3, 50, 66, 77, 20},
                new int[]{-3, -2, -1, 0, -1000})) {
            System.out.println(checkPredecessor2(ints));
        }
    }
    private void task1() {
        printHeading();
        for (int[] ints : Arrays.asList(
                new int[]{},
                new int[]{1, 3, 1},
                new int[]{-3, 50, 66, 77, 20},
                new int[]{-3, -2, -1, 0, -1000})) {
            System.out.println(checkPredecessor(ints));
        }
    }
    private void printHeading() {
        this.task++;
        System.out.println("<> task: " + this.task);
    }
}