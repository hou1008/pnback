package cn.bdqn.pnback.pojo;


import java.io.Serializable;

public class Linkage implements Serializable{
    private Integer lId;
    private Integer gId;
    private Integer aId;

    public Integer getlId() {
        return lId;
    }

    public void setlId(Integer lId) {
        this.lId = lId;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }
}
