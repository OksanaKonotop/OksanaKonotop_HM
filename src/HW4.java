package O2.O3;

import java.util.Scanner;

/**
 * Created by oksanakonotop on 14.04.2016.
 */
public class HW4 {
    /*Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
            */
    public static class ABC {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the floating-point number: ");
            float number = scanner.nextFloat();

            if ((number >= 0) && (number <= 1)){
                System.out.println("Between 0 and 1.");
            }
            else {
                System.out.println("Out.");
            }
        }
    }
}
