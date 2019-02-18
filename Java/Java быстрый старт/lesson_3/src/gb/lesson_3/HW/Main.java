package gb.lesson_3.HW;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша задача угадать число.");
        int range = 10;
        int number = (int)(Math.random() * range); // Math.random генерит случайные числа от 0 до 1, если умножить его, то будет от 0 до 10
        // Важно - Math.ramdom генерирует дробные числа, если вначале стоит (int), то эта констрекция позволяет получить только целые
        while(true) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали.");
                break;
            } else if (input_number > number) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
        scanner.close();
    }
}
