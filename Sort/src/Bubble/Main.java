package Bubble;

import java.util.Arrays;

/**
 * @author Calvin
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{0, 5, 4, 1, 2, 8, 9};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void bubbleSort(int[] a) {
        ///外层循环控制比较的次数
        for (int i = 0; i < a.length - 1; i++) {
            //内存循环控制到达位置
            for (int j = 0; j < a.length - 1 - i; j++) {
                //前面比后面大就交换位置
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
