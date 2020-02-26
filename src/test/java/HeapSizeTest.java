/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/7/2
 * @Time: Created at 20:06
 * @Description:
 */

public class HeapSizeTest {

    public static void main(String[] args) {
        //-Xms1024m -Xmx1024m
        //获取Java虚拟机使用的最大值
        long maxMemory = Runtime.getRuntime().maxMemory();
        //获取Java虚拟机使用的初始值
        long totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println("Max_Memory" + maxMemory/1024/1024 + "MB");
        System.out.println("Total_Memory" + totalMemory/1024/1024 + "MB");
    }
}
