public class z_6_3_2 {
    public static void main(String[] args) {
        int pr = 1;
        int sum = 0;
        for (int i = 1; i <= 8; i++) {
            pr = 1;
            for (int j = 1; j <= 3; j++) {
                pr = pr*(j+i);
            }
            sum += pr;
        }
        System.out.println(sum);
    }
}
