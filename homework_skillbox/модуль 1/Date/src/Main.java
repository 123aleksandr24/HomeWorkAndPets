import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main
{
    //Исправить код таким образом, чтобы дата печаталась в формате: "15:30 28.08.2015". ("hh:mm MM/dd/yyyy")
    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat ("hh:mm dd/MM/yyyy");
        Date date = new Date ();
        System.out.println(format.format (date));
    }
}

