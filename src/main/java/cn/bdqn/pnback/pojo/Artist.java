package cn.bdqn.pnback.pojo;


import java.io.Serializable;

public class Artist implements Serializable{
    private Integer aId;
    private String aName;
    private String aContent;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaContent() {
        return aContent;
    }

    public void setaContent(String aContent) {
        this.aContent = aContent;
    }
}
