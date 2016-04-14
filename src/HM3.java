package O2.O3;

import java.util.Scanner;

/**
 * Created by oksanakonotop on 14.04.2016.
 */
public class HM3 {

        /*2.3. Пользователь вводит число. Вывести на экран его удвоенное значение,если число делится на 7 нацело.
                */

    public static class ACB {
        public static void main(String[] args) {
            Scanner anynumber = new Scanner (System.in);
            System.out.print("Enter the number: ");
            int number = anynumber.nextInt();

            if (number % 7 == 0){
                System.out.println(number*2);
            }
        }
    }

}