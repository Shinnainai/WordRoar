package com.example.shinn.wordroar;
public class Question {

    private int ID;
    private String question;
    private String optA;
    private String optB;
    private String optC;
    private String answer;

    public Question() {
        ID = 0;
        question = "";
        optA = "";
        optB = "";
        optC = "";
        answer = "";
    }

    public Question(String question, String optA, String optB, String optC, String answer) {
        this.question = question;
        this.optA = optA;
        this.optB = optB;
        this.optC = optC;
        this.answer = answer;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptA() {
        return optA;
    }

    public void setOptA(String optA) {
        this.optA = optA;
    }

    public String getOptB() {
        return optB;
    }

    public void setOptB(String optB) {
        this.optB = optB;
    }

    public String getOptC() {
        return optC;
    }

    public void setOptC(String optC) {
        this.optC = optC;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "ID=" + ID +
                ", question='" + question + '\'' +
                ", optA='" + optA + '\'' +
                ", optB='" + optB + '\'' +
                ", optC='" + optC + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
