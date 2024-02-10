// 1. Составить алгоритм: если введенное число больше 7, то вывести “Привет”

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        int number=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Здравствуйте, введите простое число, пожалуйста ");

        if(scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Это не число, перезапустите программу заново");
        }
        if(number > 7)
            System.out.println("Привет");
        System.out.println("Вы ввели число " + number);
        scanner.close();

    }
}