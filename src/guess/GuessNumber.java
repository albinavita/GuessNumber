package guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private static boolean flag = false;
    public static void main(String[] args) {

        Random random = new Random();
        //сохраняем случайное число в переменной
        int randInt = random.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        while (!flag){
           guess(scanner, randInt);
        }

    }

    /**ввод числа пользователем (пользователь угадывает число)*/
    private static void guess(Scanner scanner, int randInt){
        System.out.println("Угадайте число");
        int userInput = scanner.nextInt();
        if(userInput == randInt){
            System.out.println("Совершенно верно! Это и есть загаданное мною число!");
            flag = true;
        }
        if (userInput < randInt){
            System.out.println("Загаданное мною число меньше");
        }
        if(userInput > randInt){
            System.out.println("Загаданное мною число больше");
        }
    }

}
