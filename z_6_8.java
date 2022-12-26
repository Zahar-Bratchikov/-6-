import java.util.Scanner;
import static java.lang.Math.*;

public class z_6_8 {
    public static class FunctionMy {
        public static double FunctionMy1(double u) {
            double y = 1;
            return (Math.sin(2 * u) / log(2 * y + u));
        }

        public static double FunctionMy2(double x) {
            double z = 1, b = 1, a = 1;
            return (sqrt(abs(x) + pow(cos(x), 3) + pow(z, 4))) /
                    (log(x) - asin(b * x - a));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        double summ = 0;
        for (int n = 1; n <= 10; n++) {
            System.out.print("Укажите x: ");
            double x = in.nextDouble();
            sum += FunctionMy.FunctionMy1(x);
            summ += FunctionMy.FunctionMy2(x);
        }

        System.out.println(sum);
        System.out.println(summ);
    }
}