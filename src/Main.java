import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            // обаботка разных случаев

            printMenu(); // печатем меню ещё раз перед завершением предыдущего действия
            userInput = scanner.nextInt(); // повторное считывание данных от пользователя
    }
        System.out.println("Программа завершена");
}
    private static void printMenu() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Что выберете?");
            System.out.println("1 - Ввести количество шагов за определённый день");
            System.out.println("2 - Напечатать статистику за определённый месяц");
            System.out.println("3 - Изменить цель по количеству шагов в день");
            System.out.println("0 - Выйти из приложения.");
            int command = scanner.nextInt();

            if (command == 1) {

                Scanner scanner = new Scanner(System.in);
                String stepOfDay = scanner.nextLine();



            } else if (command == 2) {
    }
}
