/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/5/22
 * @Time: Created at 19:35
 * @Description:
 */

public class TestStep2 {

    public static void main(String[] args) {
        System.out.println(new TestStep2().recursion(40));
    }

    public int recursion(int n) {
        if (n < 1) {
            throw new IllegalArgumentException(n + "不能<1");
        }
        if (n == 1 || n == 2) {
            return n;
        }
        return recursion(n-2) + recursion(n-1);
    }
}
