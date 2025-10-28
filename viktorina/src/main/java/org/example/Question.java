package org.example;

import java.util.List;

public class Question {
    private int id;
    private String text;
    private List<String> options; // A.E
    private String correct; // "A"/"B"/"C"/"D"/"E"

    public Question(int id, String text, List<String> options, String correct) {
        this.id = id;
        this.text = text;
        this.options = options;
        this.correct = correct;
    }

    public int getId() { return id; }
    public String getText() { return text; }
    public List<String> getOptions() { return options; }
    public String getCorrect() { return correct; }
}
