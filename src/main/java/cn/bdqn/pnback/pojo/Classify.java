package cn.bdqn.pnback.pojo;


import java.io.Serializable;

public class Classify implements Serializable{
    private Integer cId;
    private String cName;
    private Integer zId;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Integer getzId() {
        return zId;
    }

    public void setzId(Integer zId) {
        this.zId = zId;
    }
}
