import java.util.Scanner;
public class lab_1 {
    public static void main(String[] args) {
        System.out.println("Программа подсчёта суммы трёх чисел");
        System.out.print("Введите первое число: ");
        Scanner scan1 = new Scanner(System.in);
        int number1 = scan1.nextInt();
        System.out.print("Введите второе число: ");
        Scanner scan2 = new Scanner(System.in);
        int number2 = scan2.nextInt();
        int sum2 = number1 + number2;

        System.out.print("Введите третье число: ");
        Scanner scan3 = new Scanner(System.in);
        int number3 = scan3.nextInt();
        int result = sum2 + number3;

        System.out.printf("Сумма чисел = %d%n", result);
    }
}
