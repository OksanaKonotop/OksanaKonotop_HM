package O1;

/**
 * Created by oksanakonotop on 22.04.2016.
 */
public class SumArr {
    /*Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
    который получается в результате суммы arr1[i] + arr2[i]*/

    public static void sumArr1Arr2(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr2.length];

        for (int i = 0; i < arr2.length; i++) {
            arr3[i] = arr1[i] + arr2[i];
            System.out.print(arr3[i] + " ");
        }

    }
}
