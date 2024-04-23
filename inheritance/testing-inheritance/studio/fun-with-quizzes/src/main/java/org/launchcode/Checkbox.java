package org.launchcode;

public class Checkbox extends Question{

    public Checkbox(String question, String answer) {
        super(question,answer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        String actualAnswer = this.getAnswer();
        return answer.equalsIgnoreCase(actualAnswer);
    }
}
