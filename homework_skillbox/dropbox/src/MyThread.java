import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class MyThread extends Thread
{
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    while(true)

    {
        try {
            out.write(System.in.read());
            out.sleep(5000);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    System.out.println(out.toString());



    public int threadNumber;

    //@Override
    //public void run()
    //{
    //    for (int i = 10; i >= 0; i--)
    //    {
    //        System.out.println(i);
    //        try {
    //            sleep(1000);
     //       } catch (InterruptedException e) {
     //           e.printStackTrace();
    //        }
    //    }
    //}

}
