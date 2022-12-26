import java.util.Scanner;

import static java.lang.Math.*;

public class z6_1 {
    public static void main(String[] args) {
        double sum, scrm, cr, chis, znam;
        chis = 0;
        znam = 1;
        sum = 0;
        scrm = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("введите N");
        int N = input.nextInt();
        System.out.println("введите M");
        int M = input.nextInt();
        for (int i = 1; i <= N; i++){
            chis += cos(i);
            if (i % 2 != 0) {
                znam *= sin(i);
            } else {
                znam *= cos(i);
            }
            cr = chis / znam;
            sum += cr;
            if (cr < M) {
                scrm += cr;
            }
        }
        System.out.printf("Сумма первых " + N + " членов ряда = %5.2f\n",sum);
        System.out.printf("Сумма членов ряда, которые меньше " + M + " = %5.2f\n",scrm);
    }
}
