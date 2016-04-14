package O2.O3;

import java.util.Scanner;

/**
 * Created by oksanakonotop on 14.04.2016.
 */
public class HW6 {
    /*2.7.Вводим два числа, если одно из них делиться на другое без остатка,
    то выводим true и показываем результат деления (целую часть от деления  и остачу)
    в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, result;

        System.out.print("Enter num1: ");
        num1 = scanner.nextInt();
        System.out.print("Enter num2: ");
        num2 = scanner.nextInt();

        result = num1 / num2;
        if (num1%num2 == 0){
            System.out.println("true");
            System.out.print(result);
        }
        else {
            System.out.println("false");
            System.out.println(result);
            System.out.print(num1%num2);
        }
    }
}