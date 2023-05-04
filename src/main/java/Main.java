import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Инструкция: Тебе нужно ввести 80% правильных ответов или ты начнешь проходить тест заново " +
                "и не узнаешь, что тебя ждет в конце, так что, хорошеньку подумай)\n");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ты готова поиграть и наконец-то узнать, что тебя ждет в конце этой игры? (ДА/НЕТ)");
        String answer = sc.nextLine();

        if (answer.equalsIgnoreCase("ДА")) {
            String[] words = {"Hund", "Milch", "Cola", "Wasser", "Montag",
                    "Wochenende", "Juni", "Kilogramm", "Land", "Ort",
                    "Wetter", "Baum", "Blume", "Kind", "Junge",
                    "Mann", "Frage", "Bitte", "Telefon", "Tochter"};
            String[] articles = {"der", "die", "die", "das", "der",
                    "das", "der", "das", "das", "der",
                    "das", "der", "die", "das", "der",
                    "der", "der", "die", "die", "das", "die"};
            int countAnswers = 0;

            for (int i = 0; i < words.length; i++) {
                System.out.println("А ну, давайка введи правильный артикль для слова " + words[i] + " :");
                String article = sc.nextLine();
            }
        }
    }
}
