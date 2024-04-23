package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> questions = new ArrayList<>();
    private int numberOfCorrectQuestions = 0;
    private Scanner scanner = new Scanner(System.in);

    public ArrayList<Question> getQuestions() {
        return this.questions;
    }

    //Add questions to quiz
    public void addQuestion(Question question){
        this.questions.add(question);
    }

    //Run the quiz
    public void runQuiz(){
        for (Question question : questions){
            System.out.println(question.getQuestion());
            String userAnswer = this.getUserAnswers();
            //check the answer
            boolean userGotQuestionCorrect = question.checkAnswer(userAnswer);
            System.out.println(userGotQuestionCorrect);
            if (userGotQuestionCorrect){
                this.numberOfCorrectQuestions++;
            }
        }
        //Grade the quiz
        double percentage = ((double) numberOfCorrectQuestions / (double) this.questions.size()) * 100;
        System.out.println("Grade : "+percentage+" %");
    }

    private String getUserAnswers(){
        String userAnswer = scanner.next();
         return userAnswer;
    }


}
