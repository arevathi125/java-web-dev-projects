package org.launchcode;

public abstract class Question {
    private String answer;
    private String question;

    public Question(String answer, String question) {
        this.answer = answer;
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }

    public abstract boolean checkAnswer(String answer);
}
