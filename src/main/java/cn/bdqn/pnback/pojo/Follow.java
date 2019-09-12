package cn.bdqn.pnback.pojo;


import java.io.Serializable;

public class Follow implements Serializable{
    private int fId;
    private int uId;
    private int gId;

    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }
}
