import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

//        DateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");
//        Date birthday = dateFormat.parse("14/09/1990");
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(birthday);
        //calendar.getTime(DayOfWeek);
        //Date date = new Date();
        //System.out.println(dateFormat.format(date));


        //System.out.println(timestamp);
        //System.out.println(System.currentTimeMillis());

       //int[] days = new int[30];


        for(int i=0; i <= 29 ; i++){
            DateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");
            Date birthday = dateFormat.parse("1990/09/14");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(birthday);
            calendar.roll(Calendar.YEAR, i++);
            System.out.println(calendar.getTime());
            int dayOfWeek;
            dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            //System.out.println(dayOfWeek);
            switch (dayOfWeek){
                case 2:
                    System.out.println("Понедельник");
                    break;
                case 3:
                    System.out.println("Вторник");
                    break;
                case 4:
                    System.out.println("Среда");
                    break;
                case 5:
                    System.out.println("Четверг");
                    break;
                case 6:
                    System.out.println("Пятница");
                    break;
                case 7:
                    System.out.println("Суббота");
                    break;
                case 1:
                    System.out.println("Воскресенье");
                    break;
            }
            System.out.println(dayOfWeek);
            //System.out.println(days [dayOfWeek]);
            //System.out.println(calendar.getTime().getTime(DayOfWeek));
        }
    }
}
