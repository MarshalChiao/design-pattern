import java.util.Random;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/7/2
 * @Time: Created at 19:49
 * @Description:
 */

public class OOMTest {

    public static void main(String[] args) {
        String str = "hello";
        while (true) {
            str += str + new Random().nextInt(99999999);
        }
    }
}
