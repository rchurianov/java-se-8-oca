
import java.time.LocalTime;

public class LocalTimeTest {

    public LocalTime time;

    public void display(int hour, int minute, int second) {
        System.out.println(hour + ":" + minute + ":" + second);
    }

    public static void main(String[] args) {

        LocalTimeTest lct = new LocalTimeTest();

        for (int i = 0; i < 10; i++) {
            lct.time = LocalTime.now();
            lct.display(lct.time.getHour(), lct.time.getMinute(), lct.time.getMinute());
        }
    }
}
