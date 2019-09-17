package cn.bdqn.pnback.pojo;


import java.io.Serializable;

public class Inventory implements Serializable{
    private Integer iId;
    private Integer tId;
    private Integer iVotes;
    private Integer iSurplus;
    private Integer iSold;
    private String cName;

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public Integer getiVotes() {
        return iVotes;
    }

    public void setiVotes(Integer iVotes) {
        this.iVotes = iVotes;
    }

    public Integer getiSurplus() {
        return iSurplus;
    }

    public void setiSurplus(Integer iSurplus) {
        this.iSurplus = iSurplus;
    }

    public Integer getiSold() {
        return iSold;
    }

    public void setiSold(Integer iSold) {
        this.iSold = iSold;
    }
}
