package cn.bdqn.pnback.pojo;

import java.io.Serializable;

public class Trouble implements Serializable{
    private Integer tId;
    private String tProblem;
    private String tAnswer;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettProblem() {
        return tProblem;
    }

    public void settProblem(String tProblem) {
        this.tProblem = tProblem;
    }

    public String gettAnswer() {
        return tAnswer;
    }

    public void settAnswer(String tAnswer) {
        this.tAnswer = tAnswer;
    }
}
