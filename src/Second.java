/*2. Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести
        “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
*/
import java.util.Scanner;

public class Second {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите, пожалуйста, имя, например: 'Вячеслав'");
            String name = scanner.nextLine();
            if(name.equals("Вячеслав")){
                System.out.println("Привет, Вячеслав");
            } else {
                System.out.println("Нет такого имени");
                System.out.println(name);
            }
            scanner.close();
        }

}
