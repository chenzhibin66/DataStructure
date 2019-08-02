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
        //数组的第0个为标准数
        int stard = a[start];
        //记录需要排序的下标
        int low = start;
        int high = end;
        //循环找比标准数大的和比标准数小的数
        while (low < high) {
            //右边的数字比标准数大
            while (low < high && stard <= a[high]) {
                high--;
            }
            //使用右边的数字替换左边的数字
            a[low] = a[high];
            //如果左边的数字比标准数小
            while (low < high && a[low] <= stard) {
                low++;
            }
            a[high] = a[low];
        }
        //把标准数赋给低所在的位置的元素
        a[low] = stard;
        quickSort(a, start, low);
        quickSort(a, low + 1, end);
    }

}
