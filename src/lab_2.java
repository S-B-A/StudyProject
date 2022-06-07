import java.util.Scanner;

public class lab_2 {
    public static void main(String args []) {
        int quizNumber = 59; //Загаданное число прописано в программе и не меняется.
        System.out.print("\nОтгадайте число от 1 до 70 за 5 попыток.");
        for (int i = 0; i < 5; i++) {
            System.out.print("\nПопытка " + (i+1) + " Введите число: ");
            Scanner input = new Scanner(System.in);
            int answerNumber = input.nextInt();
            if ( answerNumber == quizNumber) {
                System.out.println("Вы угадали!");
                break;
            }
            else if (i < 4) {
                System.out.println("Попробуйте ещё.");
            }
            else {
                System.out.println("\nНеверно. Попытки закончились. \nПовезёт в другой раз. \nКонец...");
            }
        }
    }
}
