import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/5/23
 * @Time: Created at 9:53
 * @Description:
 */

public class Exam5 {
    static int s;//成员变量，类变量
    int i;//成员变量，实例变量
    int j;//成员变量，实例变量
    {
        int i = 1;//非静态代码看中的局部变量i
        i++;
        j++;
        s++;
    }
    public void test(int j) {//形参，局部变量j
        j++;
        i++;
        s++;
    }
    public static void main(String[] args) {//形参，局部变量args
        Exam5 obj1 = new Exam5();//局部变量，obj1
        Exam5 obj2 = new Exam5();//局部变量，obj2
        obj1.test(10);
        obj1.test(20);
        obj2.test(30);
        System.out.println(obj1.i + "," + obj1.j + "," + obj1.s);
        System.out.println(obj2.i + "," + obj2.j + "," + obj2.s);
    }
}
