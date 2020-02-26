import java.util.Arrays;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/5/21
 * @Time: Created at 20:07
 * @Description:
 */

public class Exam4 {
    public static void main(String[] args) {
        int i = 1;
        String str = "hello";
        Integer num = 200;
        int[] arr = {1,2,3,4,5};
        MyDate my = new MyDate();

        change(i, str, num, arr, my);

        System.out.println("i = " + i);
        System.out.println("str = " + str);
        System.out.println("num = " + num);
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("my.a = " + my.a);
    }

    private static void change(int j, String s, Integer n, int[] a, MyDate m) {
        j += 1;
        s += "world";
        n += 1;
        a[0] += 1;
        m.a += 1;
    }


}

class MyDate {
    int a = 10;
}
