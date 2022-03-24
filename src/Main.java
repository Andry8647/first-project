import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int userInput = scanner.nextInt();
        StepTracker stepTracker = new StepTracker();
        while (userInput != 0) {
            // обаботка разных случаев
            if (userInput == 1) {
                System.out.println("Введите месяц: (По русски, пример: 'Январь')");
                scanner.nextLine();
                String month = scanner.nextLine();
                System.out.println("Введите день:");
                int day = scanner.nextInt();
                System.out.println("Введите количество шагов:");
                int numberOfStep = scanner.nextInt();// ввести количество шагов за определенный день
                stepTracker.saveStepNumber(month, day, numberOfStep);
            } else if (userInput == 2) {
                System.out.println("Введите месяц: (По русски, пример: 'Январь')");
                scanner.nextLine();
                String month = scanner.nextLine();
                stepTracker.statistics(month); // напечатать статистику за определенный месяц
            } else if (userInput == 3) {
                System.out.println("Текущая цель по шагам: " + stepTracker.goalOfStep);// изменить цель по количеству шагов вдень
                System.out.println("Введите новую цель: ");
                int goal = scanner.nextInt();
                stepTracker.goalStep(goal);

            } else {
                System.out.println("Такой команды нет!");

            }
            printMenu(); // печатем меню ещё раз перед завершением предыдущего действия
            userInput = scanner.nextInt(); // повторное считывание данных от пользователя
        }
        System.out.println("Программа завершена");
    }

    private static void printMenu() {
        System.out.println("Что выберете?");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выйти из приложения.");
    }
}
