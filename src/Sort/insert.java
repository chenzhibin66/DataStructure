package Sort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class insert {
    public static void main(String[] args) {
        int[] a = new int[]{5, 8, 12, 1, 22, 10};
        int[] newArr = insertSort(a);
        System.out.println(Arrays.toString(newArr));
    }

    private static int[] insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int target = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > target) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = target;
        }
        return a;
    }
}
