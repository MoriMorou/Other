package gb.lesson_4.HW;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Нужно отгадать число");
        int range = 30;
        int number = (int)(Math.random() * range);

        PlayLevel(range, number);

        scanner.close();
    }
    private static void PlayLevel(int range, int number) {
        // модификатор private ограничивает видимость некой сущностиб например метода или переменной в пределах одного класса
        // модификатор static указывает на то, что сущнность находится именно в классе, а не в объекте
        // void указывает на то, что метод не возвращает значение

        while (true) {
            System.out.println("Число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (number == input_number) {
                System.out.println("Вы угадали!");
                break;
            } else if (number < input_number) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }

    }
}
