/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/5/22
 * @Time: Created at 19:05
 * @Description:
 */

public class TestStep {

    public static void main(String[] args) {
        System.out.println(new TestStep().iteration(40));
    }

    public int iteration(int n) {
        if (n < 1) {
            throw new IllegalArgumentException(n + "不能<1");
        }
        if (n == 1 || n == 2) {
            return n;
        }
        int one = 2;//初始化为欧族岛第二级台阶的走法
        int two = 1;//初始化为走到第一级台阶的走法
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = two + one;
            two = one;
            one = sum;
        }
        return sum;
    }
}
