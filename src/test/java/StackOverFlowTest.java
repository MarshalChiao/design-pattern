/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/7/2
 * @Time: Created at 16:41
 * @Description:
 */

public class StackOverFlowTest {

    public static int count = 0;

    public static void main(String[] args) {
        print();
    }

    public static void print() {
        System.out.println("*************" + count++);
        print();
    }
}
