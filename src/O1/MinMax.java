package O1;

/**
 * Created by oksanakonotop on 22.04.2016.
 */
public class MinMax {
    public static void findMinMax(int[] mas) {

        int numMax = mas[0];
        int numMin = mas[0];

        for (int i = 0; i < mas.length; i++) {
         numMax = Math.max(numMax, mas[i]);
         numMin = Math.min(numMin, mas[i]);
        }

        System.out.println("Max number is: " + numMax + "Min number is: " + numMin);
    }

}
