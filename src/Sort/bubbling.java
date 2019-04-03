package Sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class bubbling {
    public static void main(String[] args) {
        int[] a = new int[]{5, 8, 12, 1, 22, 10};
        int[] newArr = bullingSort(a);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] bullingSort(int[] a) {
        int len = a.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
