import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/12
 * @Time: Created at 10:42
 * @Description:
 */

public class Test {

    public static void main(String[] args) {
        System.out.print(System.currentTimeMillis() / 1000);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        long startTimeOfDay = calendar.getTime().getTime() / 1000;
        System.out.print(startTimeOfDay);

        try {
            String encode1 = URLEncoder.encode("乐普(北京)医疗器械股股份有限公司", "UTF-8");
            String encode2 = URLEncoder.encode(".*@$&-_~!( )", "UTF-8");
            String encode3 = URLEncoder.encode("-._~:/?#[]@!$&'()*+,;=`.", "UTF-8");
            String encode4 = URLEncoder.encode("-._~:/?#[]@!$&'()*+,;=`.", "UTF-8");
            System.out.println(encode1);
            System.out.println(encode2);
            System.out.println(encode3);
            System.out.println(encode4);
            String str = "- . _ ~ : / ? # [ ] @ ! $ & ' ( ) * + , ; = ` .";
            String[] s = str.split(" ");
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i] + " 对应 " + URLEncoder.encode(s[i], "UTF-8"));
            }
            System.out.println(" " + " 对应 " + URLEncoder.encode(" ", "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
