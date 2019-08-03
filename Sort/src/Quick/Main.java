package Quick;

import java.util.Arrays;

/**
 * @author Calvin
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{3, 5, 4, 1, 2, 8, 9};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    private static void quickSort(int[] a, int start, int end) {
        if (start >= end) {
            return;
        }
        int low = start;
        int high = end;
        int stard = a[start];
        while (low < high) {
            while (low < high && stard <= a[high]) {
                high--;
            }
            a[low] = a[high];
            while (low < high && stard >= a[low]) {
                low++;
            }
            a[high] = a[low];
        }
        a[low] = stard;
        quickSort(a, start, low);
        quickSort(a, low + 1, end);
    }
}
