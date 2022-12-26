import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.Math.*;

public class z_6_6 {
    public static boolean Oblast(double x, double y) {
        int counter = 0;
        if ((x >= -3 & x <= -1 & ((y <= (sqrt(3 - pow(x, 2) - 2 * x) + 1)) || (y >= -(sqrt(3 - pow(x, 2) - 2 * x) + 1)))) ||
                (x >= -1 & x <= 2 & (((y >= (1.5 * x + 2)) & (y <= 5)) || ((y >= -0.25 * x + 0.5) & (y <= 1.5 * x + 2) & (y <= -x + 2)))) ||
                ((x >= -1) & (x <= 0) & (y >= -1) & (y <= -x - 1)) ||
                ((x >= -1) & (x <= 1) & (y <= -1) & (y >= (-1.5 * x - 2.5)) & (y <= (-3 * x - 1)))) {
            counter++;
            if (x > -2 & x < -1 & y > (-x - 1) & y < (-0.25 * x + 0.5)) {
                counter--;
            }
        } else {
            return false;
        }
        if ((x > 2) & (x < 4) & (((y > 0.5 * x - 2) & (y < -0.5 * x + 2)) || ((y > -x + 1) & (y > 2 * x - 8) & (y < 0.5 * x - 2)))) {
            counter = 0;
            if (((x >= 2) & (x <= 4) & (y >= 1) & (y <= 3 * x - 5) & (y <= -3 * x + 13)) ||
                    ((x >= 2) & (x <= 4) & (y <= 1) & (y >= -0.5 * x + 2)) ||
                    (x >= 2 & x <= 6 & y <= (sqrt(-12 - pow(x, 2) + 8 * x) - 1) & y >= (-(sqrt(-12 - pow(x, 2) + 8 * x)) - 1)) ||
                    ((x >= 3) & (x <= 5) & (y >= (-0.5 * x - 2.5)) & (y <= x - 7) & (y <= -2 * x + 5)) ||
                    ((x >= 4) & (x <= 7) & (y >= -3) & (y <= x - 7) & (y <= -2 * x + 11)) ||
                    ((x >= 4) & (x <= 7) & (y <= -3) & (y >= -2 * x + 5) & (y >= x - 10))) {
                counter++;
            }
        }
        return counter > 0;
    }

    public static void main(String[] args) {
        double x = 0, y = 0;
        Scanner input = new Scanner(System.in);
        boolean stop = false;
        while (!stop) {
            System.out.println("Введите \"stop\" если хотите закончить выполнение программы.\n" +
                    "Нажмите \"Enter\" если хотите продолжить.");
            String in = input.nextLine().toLowerCase(Locale.ROOT);
            if (in.equals("stop")) {
                stop = true;
            } else {
                System.out.print("Введите x: ");
                x = Double.parseDouble(input.nextLine());
                System.out.print("Введите y: ");
                y = Double.parseDouble(input.nextLine());
                if (Oblast(x, y)) {
                    System.out.println("Точка попала в область :)");
                } else {
                    System.out.println("Точка не попала в область");
                }
            }
        }
    }
}