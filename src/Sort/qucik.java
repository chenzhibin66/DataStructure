package Sort;

import java.util.Arrays;

public class qucik {
    public static void main(String[] args) {
        int[] a = new int[]{5, 8, 12, 1, 22, 10};
        int[] newArr = quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] quickSort(int[] a, int start, int end) {
        if (start < end) {
            //数组中第0个数字作为标准数
            int temp = a[start];
            int low = start;
            int high = end;
            while (low < high) {
                while (low < high && temp <= a[high]) {
                    high--;
                }
                a[low] = a[high];
                while (low < high && temp >= a[low]) {
                    low++;
                }
                a[high] = a[low];
            }
            a[low] = temp;
            //处理所有小的数字
            quickSort(a, start, low);
            //处理所有大的数字
            quickSort(a, low + 1, end);
        }
        return a;
    }
}
