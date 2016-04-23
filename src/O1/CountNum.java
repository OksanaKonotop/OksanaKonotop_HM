package O1;

/**
 * Created by oksanakonotop on 23.04.2016.
 */
public class CountNum {

        // Посчитать сколько цифр(цифра задается пользователем) в массиве

        public static int countNum(int num, int[] mas) {

            int count = 0;

            for (int i = 0; i < mas.length; i++) {
                if (mas[i] == num) {
                    count++;
                }
            }

            return count;
        }
    }


