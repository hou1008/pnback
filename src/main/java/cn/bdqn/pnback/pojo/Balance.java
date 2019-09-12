package cn.bdqn.pnback.pojo;


import java.io.Serializable;

public class Balance implements Serializable{
    private Integer bId;
    private Integer uid;
    private Integer bTotal;

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getbTotal() {
        return bTotal;
    }

    public void setbTotal(Integer bTotal) {
        this.bTotal = bTotal;
    }
}
