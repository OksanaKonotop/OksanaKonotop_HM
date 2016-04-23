package O1;

import java.util.Scanner;

/**
 * Created by oksanakonotop on 23.04.2016.
 */
public class CountSymb {


    //Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер

        public static void main(String[] args)throws Exception{
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter first num: ");

            int num1 = sc.nextInt();
            String n1 = String.valueOf(num1);

            System.out.println("Enter second num: ");

            int num2 = sc.nextInt();
            String n2 = String.valueOf(num2);

            System.out.println("Enter third num: ");

            int num3 = sc.nextInt();
            String n3 = String.valueOf(num3);


            char[] symb1 = n1.toCharArray();
            int count1 = 0;
            for(int i = 0; i < symb1.length; ++i)
                if(symb1[i] == '8')
                    ++count1;

            char[] symb2 = n2.toCharArray();
            int count2 = 0;
            for(int i = 0; i < symb2.length; ++i)
                if(symb2[i] == '8')
                    ++count2;



            char[] symb3 = n3.toCharArray();
            int count3 = 0;
            for(int i = 0; i < symb3.length; ++i)
                if(symb3[i] == '8')
                    ++count3;



            System.out.println("В числе №1 "+num1 +" встераеться  -  " + count1 +
                    " cовпадение\nВ числе №2 " +num2 + " встераеться  -  " + count2 +
                    " cовпадение  \nВ числе №3 "+num3 +" встераеться  -  " + count3 + " cовпадение ");
        }
    }


