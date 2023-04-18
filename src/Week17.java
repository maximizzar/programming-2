public class Week17 {
    private Integer task = 0;
    public boolean compareIntArrays(int[] a1, int[] a2) {
        return java.util.Arrays.equals(a1, a2);
    }
    public boolean deepCompareIntArrays(int[][] a1, int[][] a2) {
        return java.util.Arrays.deepEquals(a1,a2);
    }
    public String array2String(int[] a1) {
        return java.util.Arrays.toString(a1);
    }
    public String deepArray2String(int[][] a1) {
        return java.util.Arrays.deepToString(a1);
    }
    public int[] sortIntArray(int[] a1) {
        java.util.Arrays.sort(a1);
        return a1;
    }
    public static int[] bubbleSort(int[] array) {
        int done = 0;

        while (array.length > 2 && done < array.length) {
            int buffer;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] <= array[i]) {
                    done++;
                    continue;
                }
                buffer = array[i - 1];
                array[i - 1] = array[i];
                array[i] = buffer;
            }
        }
        return array;
    }
    public void test() {
        printHeading();
        System.out.println(compareIntArrays(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 }));
        System.out.println(compareIntArrays(new int[] {}, new int[] {}));
        System.out.println(compareIntArrays(new int[] {}, new int[] { 1 }));
        System.out.println(compareIntArrays(new int[] { 2 }, new int[] { 1 }));
        System.out.println(compareIntArrays(new int[] { 2 }, new int[] { 2, 1 }));
        System.out.println(compareIntArrays(new int[] { -1000, -1000 }, new int[] { -1000, -1000 }));

        printHeading();
        System.out.println(deepCompareIntArrays(new int[][] { { 1 }, { 2, 3 } }, new int[][] { { 1 }, { 2, 3 } }));
        System.out.println(deepCompareIntArrays(new int[][] { { 1 }, { 2, 3 } }, new int[][] { { 1 }, { 2 }, { 3 } }));
        System.out.println(deepCompareIntArrays(new int[][]{{},{}}, new int[][]{{},{}})) ;
        System.out.println(deepCompareIntArrays(new int[][]{{1},{}}, new int[][]{{},{}})) ;

        printHeading();
        System.out.println(array2String(new int[] { 1, 2, 3 }));
        System.out.println(array2String(new int[] {}));
        System.out.println(array2String(new int[] { 5, 3, 1, -1 }));

        printHeading();
        System.out.println(deepArray2String(new int[][] { { 1 }, { 2 }, { 4 } }));
        System.out.println(deepArray2String(new int[][] { { 1 }, { 2, 3 } }));
        System.out.println(deepArray2String(new int[][] {}));
        System.out.println(deepArray2String(new int[][] { { 5, 3 }, { 1 }, { -1, 1 } }));

        printHeading();
        System.out.println(java.util.Arrays.toString(sortIntArray(new int[] { 3, -1, 2, 4 })));
        System.out.println(java.util.Arrays.toString(sortIntArray(new int[] {})));
        System.out.println(java.util.Arrays.toString(sortIntArray(new int[] { 0, 0, 1, 0, 2 })));

        printHeading();
        System.out.println(java.util.Arrays.toString(bubbleSort(new int[] { 3, -1, 2, 4 })));
        System.out.println(java.util.Arrays.toString(bubbleSort(new int[] {})));
        System.out.println(java.util.Arrays.toString(bubbleSort(new int[] { 0, 0, 1, 0, 2 })));
    }
    private void printHeading() {
        this.task++;
        System.out.println("\n<> task: " + this.task);
    }
}
