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
        System.out.println(System.currentTimeMillis() / 1000);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        long startTimeOfDay = calendar.getTime().getTime() / 1000;
        System.out.println(startTimeOfDay);
    }
}
