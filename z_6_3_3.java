public class z_6_3_3 {
    public static void main(String[] args) {
        int sum_1 = 0;
        int sum_2 = 0;
        int pr = 1;
        for (int i = 1; i <= 8; i++) {
            sum_1 = 0;
            for (int j = 1; j <= i; j++) {
                pr = 1;
                for (int k = 1; k <= (2 * i + j); k++) {
                    pr = pr * ((2 * j) - (3 * (i - k)));
                }
                sum_1 += pr;
            }
            sum_2 += sum_1;
        }
        System.out.println(sum_2);
    }
}
