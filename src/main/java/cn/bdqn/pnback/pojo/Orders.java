package cn.bdqn.pnback.pojo;

import java.sql.Date;

public class Orders {
    private Integer oid;
    private String oBianhao;
    private Orderstate oState;
    private Goods goods;
    private Integer oNumber;
    private Double oMoneys;
    private Date oTime;
    private User user;
    private Date wTime;
    private String zBianhao;
    private String sign;
    private String peisong;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getoBianhao() {
        return oBianhao;
    }

    public void setoBianhao(String oBianhao) {
        this.oBianhao = oBianhao;
    }

    public Orderstate getoState() {
        return oState;
    }

    public void setoState(Orderstate oState) {
        this.oState = oState;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
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

    public Date getoTime() {
        return oTime;
    }

    public void setoTime(Date oTime) {
        this.oTime = oTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getwTime() {
        return wTime;
    }

    public void setwTime(Date wTime) {
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
