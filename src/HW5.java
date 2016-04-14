package O2.O3;

import java.util.Scanner;

/**
 * Created by oksanakonotop on 14.04.2016.
 */
public class HW5 {
    public static void main(String[] args) {
        // 2.5. Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.
        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        System.out.print("Enter num1: ");
        num1 = scanner.nextInt();

        System.out.print("Enter num2: ");
        num2 = scanner.nextInt();

        if (num1+num2 >= 11 && num1+num2 <= 19){
            System.out.println(num1 + num2);
        }
    }
}
