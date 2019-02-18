package Mori.lesson_Java.Berrsong;

public class Main {

    public static void main(String[] args) {
        int beerNum = 5;
        String word = "бутылок/бутылки";

        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "Бутылка";
            }
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " пива на стене");
                System.out.println("Возьми одную");
                System.out.println("Пусти по кругу.");
                beerNum = beerNum - 1;
            }
            }
        System.out.println("Нет бутылок на стене");
    }
}
