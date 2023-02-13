package fr.xibalba.apprendreJavaExos;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to this console Trivia Game! (made with https://the-trivia-api.com)");
        System.out.print("Please entre your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
        ApiConnection.Difficulty difficulty = getDifficulty();
        Categories[] categories = getCategories();
        System.out.println("Let's start!");
        boolean isPlaying = true;
        boolean isInGame = true;
        int score = 0;
        int questionNumber = 0;
        do {
            clearConsole();
            if (isInGame) {
                questionNumber++;
                Question question = ApiConnection.getQuestion(difficulty, categories);
                System.out.println(question.question());
                List<String> answers = question.getAnswers();
                int goodAnswerIndex = answers.indexOf(question.correctAnswer());
                for (int i = 0; i < answers.size(); i++) {
                    System.out.println((i + 1) + ". " + answers.get(i));
                }
                System.out.print("Please enter your answer: ");
                String answer = scanner.nextLine();
                if (answer.equals(String.valueOf(goodAnswerIndex + 1))) {
                    System.out.println("Good answer!");
                    score++;
                } else {
                    System.out.println("Wrong answer!");
                }
                System.out.print("Go to the menu? (y/n): ");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("y")) {
                    isInGame = false;
                }
            } else {
                System.out.println("1. Return to game");
                System.out.println("2. Show the score and settings");
                System.out.println("3. Change the difficulty");
                System.out.println("4. Change the categories");
                System.out.println("5. Exit");
                System.out.print("Please enter your choice: ");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "1" -> isInGame = true;
                    case "2" -> {
                        System.out.println("Score: " + score + "/" + questionNumber);
                        System.out.println("Difficulty: " + difficulty.name());
                        System.out.println("Categories: ");
                        for (Categories category : categories) {
                            System.out.println("- " + category.getName());
                        }
                        System.out.println("Press enter to continue...");
                        scanner.nextLine();
                    }
                    case "3" -> difficulty = getDifficulty();
                    case "4" -> categories = getCategories();
                    case "5" -> isPlaying = false;
                    default -> {
                        System.out.println("Please enter a valid choice!");
                        System.out.println("Press enter to continue...");
                        scanner.nextLine();
                    }
                }
            }
        } while (isPlaying);
        System.out.println("Thanks for playing!");
        System.out.println("Your score: " + score + "/" + questionNumber);
    }

    public static void clearConsole() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    private static Categories[] getCategories() {

        System.out.println("Please select the categories of the questions (you can change it later): ");
        System.out.println("1. Art & Literature");
        System.out.println("2. Film & TV");
        System.out.println("3. Food & Drink");
        System.out.println("4. General Knowledge");
        System.out.println("5. Geography");
        System.out.println("6. History");
        System.out.println("7. Music");
        System.out.println("8. Science");
        System.out.println("9. Society & Culture");
        System.out.println("10. Sport & Leisure");
        System.out.print("Please enter your choice (you can choose multiple categories by typing their numbers separated by a space): ");
        Categories[] categoriesEnum;
        try {
            String categories = scanner.nextLine();
            String[] categoriesArray = categories.split(" ");
            categoriesEnum = new Categories[categoriesArray.length];
            for (int i = 0; i < categoriesArray.length; i++) {
                categoriesEnum[i] = Categories.getByOrdinal(Integer.parseInt(categoriesArray[i]) - 1);
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid choice!");
            categoriesEnum = getCategories();
        }
        return categoriesEnum;
    }

    private static ApiConnection.Difficulty getDifficulty() {
        System.out.println("Please select the difficulty of the game (you can change it later): ");
        System.out.println("1. Easy");
        System.out.println("2. Medium (default)");
        System.out.println("3. Hard");
        System.out.print("Please enter your choice: ");
        return switch (scanner.nextLine()) {
            case "1" -> ApiConnection.Difficulty.Easy;
            case "3" -> ApiConnection.Difficulty.Hard;
            default -> ApiConnection.Difficulty.Medium;
        };
    }
}