import static java.lang.Math.*;

public class z_6_3_1 {
    public static void main(String[] args) {
        double sum_1 = 0;
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                sum_1 += pow(j, 2);
            }
        }
        System.out.println(sum_1);
    }
}
