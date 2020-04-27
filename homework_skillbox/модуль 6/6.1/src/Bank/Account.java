package Bank;

import java.util.Calendar;
import java.util.Date;

public class Account extends Date {



    Calendar calendarBegin;
    protected  Calendar calendarEnd;
    Account account;

    double AllCoins;
    double money;

    public Account(double money, double AllCoins){


        this.money = money;
        this.AllCoins = AllCoins;
    }

    public Account() {

    }

    //ложим на основной счёт другие свои деньги
    public void putMoney (double money){
        this.money = money;
        this.AllCoins = AllCoins + money;
    }
    //получаем с основного счёта кол-во money для пользования ими
    public double getMoney(double money){
        this.AllCoins = AllCoins - money;
        //this.money = money;
        return money;
    }
    public void seeMoney(){
        System.out.println(AllCoins);
    }

    public Calendar getCalendarBegin() {
        return calendarBegin;
    }

    public Calendar getCalendarEnd() {
        return calendarBegin;
    }

    public void setCalendarEnd(Calendar calendarEnd) {
        this.calendarEnd = calendarEnd;
    }

    public void setCalendarBegin(Calendar calendarBegin) {
        this.calendarBegin = calendarBegin;
    }
}
