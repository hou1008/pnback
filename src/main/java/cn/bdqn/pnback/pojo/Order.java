package cn.bdqn.pnback.pojo;


import java.io.Serializable;

public class Order implements Serializable{
    private Integer oid;
    private Integer oBianhao;
    private Integer oState;
    private Integer gId;
    private Integer oNumber;
    private Double oMoneys;
    private String oTime;
    private Integer uid;
    private String wTime;
    private String zBianhao;
    private String sign;
    private String peisong;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getoBianhao() {
        return oBianhao;
    }

    public void setoBianhao(Integer oBianhao) {
        this.oBianhao = oBianhao;
    }

    public Integer getoState() {
        return oState;
    }

    public void setoState(Integer oState) {
        this.oState = oState;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getoNumber() {
        return oNumber;
    }

    public void setoNumber(Integer oNumber) {
        this.oNumber = oNumber;
    }

    public Double getoMoneys() {
        return oMoneys;
    }

    public void setoMoneys(Double oMoneys) {
        this.oMoneys = oMoneys;
    }

    public String getoTime() {
        return oTime;
    }

    public void setoTime(String oTime) {
        this.oTime = oTime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getwTime() {
        return wTime;
    }

    public void setwTime(String wTime) {
        this.wTime = wTime;
    }

    public String getzBianhao() {
        return zBianhao;
    }

    public void setzBianhao(String zBianhao) {
        this.zBianhao = zBianhao;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getPeisong() {
        return peisong;
    }

    public void setPeisong(String peisong) {
        this.peisong = peisong;
    }
}
