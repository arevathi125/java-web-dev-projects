package org.launchcode;

public class MultipleChoice extends Question{

    public MultipleChoice(String question, String answer) {
        super(question,answer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        String actualAnswer = this.getAnswer();
        return answer.equalsIgnoreCase(actualAnswer);
    }
}
