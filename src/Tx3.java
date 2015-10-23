/**
 * Created by admin on 2015/10/23.
 */
public class Tx3 {
    public static void main(String[] args) {
        for (int j = 1; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                for (int l = 0; l < 10; l++) {
                    if (j * j * j + k * k * k + l * l * l ==j*100+k*10+l) {
                        System.out.println(j*100+k*10+l);

                    }

                }

            }

        }



    }
}
