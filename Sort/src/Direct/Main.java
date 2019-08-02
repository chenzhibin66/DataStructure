package Direct;

import java.util.Arrays;

/**
 * @author Calvin
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{0, 5, 4, 1, 2, 8, 9};
        directInsertSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void directInsertSort(int[] array) {
        //从第二个数字开始遍历所有数字
        for (int i = 1; i < array.length; i++) {
            //如果当前数字比前一个数字小
            if (array[i] < array[i - 1]) {
                //把当前数字保存起来
                int temp = array[i];
                int j;
                //遍历当前数字前面的所有数字
                for (j = i - 1; j >= 0 && temp < array[j]; j--) {
                    //把前一个数字赋值给后一个数字
                    array[j + 1] = array[j];
                }
                //外层for循环的当前元素赋给不满足条件的后一个元素
                array[j + 1] = temp;
            }
        }
    }
}
