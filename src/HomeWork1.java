import java.awt.*;
import java.util.Scanner;

/**
 * Created by oksanakonotop on 14.04.2016.
 */
public class HomeWork1 {

    /*2.1Пользователь вводит параметр с консоли (текущий час от 0 до 24)
    Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")*/

    public static void main(String[] args) {
        Scanner timetable = new Scanner(System.in);

        System.out.print ("Enter recent time:");
        int RecentTime = timetable.nextInt();

        if (RecentTime < 0 || RecentTime > 24)
            System.out.println();

        else if (RecentTime >= 9 && RecentTime <= 18)
            System.out.println("I'm at work");

        else
            System.out.println("I have the rest");


    }


}
