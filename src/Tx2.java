/**
 * Created by admin on 2015/10/23.
 */
public class Tx2 {
    public static void main(String[] args) {
        int z=0;
        for (int i = 101; i <= 200; i++) {
            boolean b = true;
            for (int j = 2; j < i / 2 + 1; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b){
                System.out.println(i);

                z=z+1;
            }

        }
        System.out.println(z);}
}
