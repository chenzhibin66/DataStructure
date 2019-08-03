package Shell;

import java.util.Arrays;

/**希尔排序
 * @author Calvin
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{3, 5, 4, 1, 2, 8, 9};
        shellSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void shellSort(int[] a) {
        for (int d = a.length / 2; d > 0; d /= 2) {
            for (int i = d; i < a.length; i++) {
                for (int j = i - d; j >= 0; j -= d) {
                    if (a[j] > a[j + d]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
        }

    }
}
