package fr.xibalba.apprendreJavaExos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public record Question(Categories category, String correctAnswer, String[] incorrectAnswers, String question) {

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Question: ").append(this.question).append("\n");
        stringBuilder.append("Category: ").append(this.category.getName()).append("\n");
        stringBuilder.append("Correct answer: ").append(this.correctAnswer).append("\n");
        stringBuilder.append("Incorrect answers: ");
        for (String incorrectAnswer : this.incorrectAnswers) {
            stringBuilder.append(incorrectAnswer).append(", ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    public List<String> getAnswers() {

        List<String> answers = new ArrayList<>(Arrays.asList(this.incorrectAnswers));
        answers.add(this.correctAnswer);
        Collections.shuffle(answers);
        return answers;
    }
}