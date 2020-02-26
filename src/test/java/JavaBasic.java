/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/6/10
 * @Time: Created at 17:34
 * @Description:
 */

public class JavaBasic {
    public static void main(String[] args) {
        String s1 = new String("xyz");//创建了2个对象
        String s2 = "xyz";//创建了0个字符串对象
        String s3 = "xyz";//创建了0个字符串对象
        String s4 = s2;//创建了0个对象
        String s5 = new String("xyz");//创建了1个对象

        System.out.println(s2 == "xyz");//返回true，比较两个字符串对象是否相等
        System.out.println(s2 == s3);//返回true
        System.out.println(s2 == s4);//返回true
        System.out.println(s1 == s5);//返回false
        System.out.println(s1 == s2);//返回false
        System.out.println(s1 == "xyz");//返回false
    }
}
