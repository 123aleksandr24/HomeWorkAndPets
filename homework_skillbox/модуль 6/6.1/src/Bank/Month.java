package Bank;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Month extends Account {

    public static void main(String[] args)  {

//        LocalDate localDate = LocalDate.now();
//        localDate.plusMonths(1);
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        System.out.println(localDate.format(dateTimeFormatter));
//        LocalDate localDate1 = localDate.parse("23/03/2017",dateTimeFormatter);
//        System.out.println(localDate1);
//        LocalDate localDate2 = LocalDate.now();


        Date date = new Date();//(String.valueOf(calendar));
        //Calendar calendar = new GregorianCalendar();
        Calendar calendarBegin = Calendar.getInstance();
        System.out.println(calendarBegin.getTime());
        Calendar calendarEnd = Calendar.getInstance();
        //date.toInstant();
        //date.setTime (date.getTime() + 3600L * 1000 * 24 * 365); // час в милисекундах сутки год
        calendarEnd.roll(Calendar.MONTH, +1);
        calendarEnd.setTime(date);
        System.out.println(calendarEnd.getTime());
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);//задает упрощенный готовый формат даты
        System.out.println(dateFormat.format(calendarEnd.getTime()));
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        //Date newDate = simpleDateFormat.parse("21/12/2012");
        //System.out.println("Конец света наступил: " + newDate);

//        Account account = new Account();
//        account.setCalendarBegin(calendarBegin);
//        System.out.println(calendarBegin);
//        Account account2 = new Account();
//        account2.setCalendarEnd(calendarEnd);
//        System.out.println(calendarEnd);
    }

    public Month(double AllCoins, double money) {
        super(AllCoins,money);
    }

    public double getMoney(double money) {
            //if (setCalendarEnd(calendarEnd) > calendarBegin) {
            AllCoins = AllCoins - money;
            return money;
            //} else {
            //    System.out.println("Вы не можете полуить деньги раньше чем через месяц после внесения");
            //}
            }
        //}

}



