package fr.xibalba.apprendreJavaExos;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.atomic.AtomicReference;

public class ApiConnection {

    public static Question getQuestion(Difficulty difficulty, Categories... categories) throws IOException {
        //Preparing the parameters
        StringBuilder categoriesNames = new StringBuilder();
        for (Categories category : categories) {
            categoriesNames.append(category.getCode()).append(",");
        }
        categoriesNames.deleteCharAt(categoriesNames.length() - 1);
        String url = "https://the-trivia-api.com/api/questions?categories=" + categoriesNames + "&limit=1&region=FR&difficulty=" + difficulty.name.toLowerCase();
        //Set up the connection
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);
        //Connect to the API
        connection.connect();
        int status = connection.getResponseCode();
        if (status != 200) {
            throw new IOException("Error while connecting to the API: " + status + " with the url: " + url + " and response: " + connection.getResponseMessage());
        }
        //Read the response
        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        connection.disconnect();
        //Parse the response
        AtomicReference<Question> question = new AtomicReference<>();
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(content.toString());
        jsonNode.elements().forEachRemaining(jsonNode1 -> question.set(new Question(
                Categories.getByName(jsonNode1.get("category").asText()),
                jsonNode1.get("correctAnswer").asText(),
                objectMapper.convertValue(jsonNode1.get("incorrectAnswers"), String[].class),
                jsonNode1.get("question").asText()
        )));

        return question.get();
    }

    public enum Difficulty {
        Easy("Easy"),
        Medium("Medium"),
        Hard("Hard");

        private final String name;

        Difficulty(String name) {
            this.name = name;
        }
    }
}