package Sort;
/**
 * 希尔排序
 */

import java.util.Arrays;

public class shell {
    public static void main(String[] args) {
        int[] a = new int[]{5, 8, 12, 1, 22, 10};
        int[] newArr = shellSort(a);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] shellSort(int[] a) {
        int h = a.length / 2;

        while (h >= 1) {
            for (int i = 0; i < a.length; i++) {
                for (int j = i; j < a.length - h; j += h) {
                    if (a[j] > a[j + h]) {
                        int temp = a[j];
                        a[j] = a[j + h];
                        a[j + h] = temp;
                    }
                }
            }
            h = h / 2;
        }

        return a;
    }
}
