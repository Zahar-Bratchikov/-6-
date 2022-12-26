import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class z_6_4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Хотите выполнить перевод? (true || false)");
        boolean ans = input.nextBoolean();

        while (ans) {
            ArrayList<Integer> nums = new ArrayList<>();
            System.out.print("Введите число в 10-ой СС: ");
            double num = input.nextDouble();
            System.out.print("Введите систему счисления: ");
            double new_system = input.nextInt();
            double m;
            int q;

            if (new_system == 0 || new_system == 1 || new_system > 10) {
                System.out.println("ведена не верная система счисления");
                break;
            } else {
                if (num / 10 >= 0.1) {
                    System.out.println("введено число, в котором присутствует целая часть");
                    break;
                } else {

                    m = num * new_system;
                    q = (int) Math.floor(m);
                    nums.add(q);
                    for (int i = 1; i <= 15; i++) {
                        m = (m - q) * new_system;
                        q = (int) Math.floor(m);
                        nums.add(q);
                    }
                }
            }
            StringJoiner joiner = new StringJoiner("");
            for (Integer integer : nums) {
                joiner.add(integer.toString());
            }
            String new_number = joiner.toString();
            System.out.println("Значение " + num + " в СС с основанием " + new_system + " = 0," + new_number);
            System.out.println("Хотите переводить дальше? (true || false)");
            ans = input.nextBoolean();
        }
        System.out.println("конец выполнения программы");
    }
}

