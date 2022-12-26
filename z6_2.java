import java.util.Scanner;

public class z6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double S, A, B, M;
        System.out.print("Введите ваши накопления: ");
        S = input.nextDouble();
        System.out.print("Введите вашу стипендию: ");
        A = input.nextDouble();
        System.out.print("Введите расходы на жилье (Расходы > стипендия): ");
        B = input.nextDouble();
        System.out.print("Введите расходы на канц.товары на 3 мес: ");
        M = input.nextDouble();

        double traty, m;
        double sredstva = S;

        for (m = 1; m <= 20; m++) {
            S += A;
            B *= (1.0 + m / 100);
            S -= B;

            if (m % 3 == 0) {
                S += A;
                traty = (B + M) * (1 + m / 100);
                S -= traty;
            }
            if (S <= 0) {
                System.out.println("На ваши сбережения и стипендию вы сможете прожить: " + m + " месяцев");
                break;
            }
        }
        for (m = 1; m <= 20; m++) {
            S += A;
            B *= (1.0 + m / 100);
            S -= B;

            if (m % 3 == 0) {
                S += A;
                traty = (B + M) * (1 + m / 100);
                S -= traty;
                }
            if (Math.abs(S) >= 2 * sredstva) {
                System.out.println("долг, в 2 раза больший ваших накоплений вы наберете через " + m + "месяцев");
                break;
                }
            }
    }
}
