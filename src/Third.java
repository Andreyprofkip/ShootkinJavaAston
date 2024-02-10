/* 3. Составить алгоритм: на входе есть числовой массив, необходимо вывести
элементы массива кратные 3
 */

import java.util.Arrays;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив из 10 целых чисел");

        for (int i = 0; i < myArray.length; i++) {
            myArray[i]=scanner.nextInt();
            System.out.println(Arrays.toString(myArray));
        }
        System.out.println("Спасибо. Теперь отобразим элементы кратные 3");

        for (int j : myArray) {
            if (j % 3 == 0) {
                System.out.print(j + ", ");
            }
        }
        scanner.close();
    }
}
