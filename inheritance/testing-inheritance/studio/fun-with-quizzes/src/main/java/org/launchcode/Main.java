package org.launchcode;

public class Main {
    public static void main(String[] args) {
     Quiz quiz = new Quiz();

     MultipleChoice multi = new MultipleChoice("What are the vowwles of english alphabet?"+"\nA: AEIOU\nB: GHJK\nPlease type a single letter as an answer: ","A");
     quiz.addQuestion(multi);

     Checkbox check = new Checkbox("Select all that apply, " +
             "Which fruit is red in color?\nA: Strawberry\nB: Mango\nC: Apples", "A,C");
     quiz.addQuestion(check);

     TrueOrFalse tof = new TrueOrFalse("Elephants are Mammals?  \n True or False?", "True");
     quiz.addQuestion(tof);

     quiz.runQuiz();

    }

}