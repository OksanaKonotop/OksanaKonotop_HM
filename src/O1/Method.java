package O1;

/**
 * Created by oksanakonotop on 23.04.2016.
 */
public class Method {

        public static void main(String[] args) {

            public static int[] createAndFillArray (int size, int range){

             int[] mas = new int[size];
             int random = 0;

                for (int i = 0; i < mas.length; i++) {
                     random = (int) (Math.random() * range);
                 if (i == 0 || i %2 == 0) {


                 if (random %2 == 0) {
                       mas[i] = random;

                 } else {
                       mas[i] = random + 1;
                                }

                 } else {

                  if (random %2 != 0) {
                  mas[i] = random;
                         } else {
                        mas[i] = random + 1;
                                }
                            }
                        }
                        return mas;
                    }
