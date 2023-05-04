import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Инструкция: Тебе нужно ввести 80% правильных ответов или ты начнешь проходить тест заново " +
                "и не узнаешь, что тебя ждет в конце, так что, хорошеньку подумай)\n");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ты готова поиграть и наконец-то узнать, что тебя ждет в конце этой игры? (ДА/НЕТ)");
        String answer = sc.nextLine();

        int correctAnswers = 0;
        if (answer.equalsIgnoreCase("ДА")) {
            String[] words = {"Hund", "Milch", "Cola", "Wasser", "Montag",
                    "Wochenende", "Juni", "Kilogramm", "Land", "Ort",
                    "Wetter", "Baum", "Blume", "Kind", "Junge",
                    "Mann", "Frage", "Bitte", "Telefon", "Tochter"};
            String[] articles = {"der", "die", "die", "das", "der",
                    "das", "der", "das", "das", "der",
                    "das", "der", "die", "das", "der",
                    "der", "der", "die", "die", "das", "die"};
            correctAnswers = 0;

            for (int i = 0; i < words.length; i++) {
                System.out.println("А ну, давайка введи правильный артикль для слова " + words[i] + " :");
                String article = sc.nextLine();

                // Задержка перед выводом ответа
                System.out.println("Подожди, я спрашиваю у Фран Еноты ...");
                try {
                    TimeUnit.SECONDS.sleep(0
                    );
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                if (article.equalsIgnoreCase(articles[i])) {
                    correctAnswers++;
                    System.out.println("Richtig");

                } else {
                    System.out.println("Falsch! Правильный ответ будет :" + articles[i]);
                }
            }
        }
        System.out.println("Бубка, ты правильно ответила на " + correctAnswers + "из 20 вопросов!");
        if (correctAnswers >= 16) {
            System.out.println("Отлично, ты умница! Можешь заглянуть в ");
        } else {
            System.out.println("Нужно выполнить условия игры, ничего не поделать, попробуй еще!");
        }
    }

}

