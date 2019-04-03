package Sort;
/**
 * 选择排序
 */

import java.util.Arrays;

public class select {
    public static void main(String[] args) {
        int[] a = new int[]{5, 8, 12, 1, 22, 10};
        int[] newArr = selectSort(a);
        System.out.println(Arrays.toString(newArr));
    }

    private static int[] selectSort(int[] a) {
        int len = a.length;
        for (int i = 0; i < len - 1; i++) {
            int k = i;
            for (int j = k + 1; j < len; j++) {
                if (a[j] < a[k]) {
                    k = j;  //找到最小值所在的位置
                }
            }
            if (i != k) {
                int temp = a[i];
                a[i] = a[k];
                a[k] = temp;
            }
        }
        return a;
    }
}
