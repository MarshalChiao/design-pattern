/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/7/1
 * @Time: Created at 10:41
 * @Description:
 */

public class Demo {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //最大公约数
        int division = division(a, b);
        System.out.println("最小公倍数1为：" + a * b /division);
        int result = commonDivision(a, b);
        System.out.println("最小公倍数为2：" + a * b / result);
    }

    public static int division(int a, int b) {
        int min = a > b ? b : a;
        int result = 0;
        for (int i = min; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                result = i;
                System.out.println("最大公约数1为：" + result);
                return result;
            }
        }
        return result;
    }

    /**
     * 辗转相除法
     * @param a
     * @param b
     * @return
     */
    public static int commonDivision(int a, int b) {
        int temp = 0;
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        System.out.println("最大公约数2为：" + a);
        return a;
    }
}
