package pl.sda.learnjava.LearnJava.dto;

import java.util.ArrayList;
import java.util.List;

public class QuizAnswerDTO {

    private List<SimpleAnswer> simpleAnswers;



    public List<SimpleAnswer> getSimpleAnswers() {
        return simpleAnswers;
    }

    public void setSimpleAnswers(List<SimpleAnswer> simpleAnswers) {
        this.simpleAnswers = simpleAnswers;
    }


    @Override
    public String toString() {
        return "QuizAnswerDTO{" +
                "simpleAnswers=" + simpleAnswers +
                '}';
    }
}
