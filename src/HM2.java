package O2;

import java.util.Scanner;
/*
 2.2. Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее
 */
public class HM2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = 56;
        int number2 = 47;
        int number3 = 13;

        System.out.print("Enter number 56: ");
        int a = scanner.nextInt();

        System.out.print("Enter number 47: ");
        int b = scanner.nextInt();

        System.out.print("Enter number 13: ");
        int c = scanner.nextInt();

        if (a >= b && a >=c){
            System.out.println(a + " is the biggest number.");
        }
        else if (b >= a && b >= c){
            System.out.println(b + " is the biggest number.");
        }
        else System.out.println(c + " is the biggest number.");


        if (a <= b && a <=c){
            System.out.println(a + " is the smallest number.");
        }
        else if (b <= a && b <= c){
            System.out.println(b + " is the smallest number.");
        }
        else {
            System.out.println(c + " is the smallest number.");
        }
    }
}

