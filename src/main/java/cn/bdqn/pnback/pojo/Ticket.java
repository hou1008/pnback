package cn.bdqn.pnback.pojo;


import java.io.Serializable;

public class Ticket implements Serializable{
    private Integer tId;
    private Integer sId;
    private double tMoney;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public double gettMoney() {
        return tMoney;
    }

    public void settMoney(double tMoney) {
        this.tMoney = tMoney;
    }
}
