package O1;

/**
 * Created by oksanakonotop on 22.04.2016.
 */
public class Avr {

    public static void main(String[] args) {
        int[] numbers = {5, 12, 23, 45, 56};
        int result = 0;

        for(int i = 0; i < 5; i++){
            result = result + numbers[i];
        }
        result = result / 5;
        System.out.println("Среднее арифметическое: " + result);
    }
}
