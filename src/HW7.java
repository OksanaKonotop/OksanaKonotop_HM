package O2.O3;

import java.util.Scanner;

/**
 * Created by oksanakonotop on 14.04.2016.
 */
public class HW7 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        /*2.5. Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел.
         Если второе больше, то выводим сумму */

        int number1 = 4;
        int number2 = 5;

        System.out.println("Enter number 4:");
        number1 = number.nextInt ();

        System.out.println("Enter number 5:");
        number2 = number.nextInt ();

        if (number1 > number2)
            System.out.println(number1 - number2);

        else if (number2 > number1)
            System.out.println(number2 + number1);


    }
}

