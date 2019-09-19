package cn.bdqn.pnback.pojo;


import java.io.Serializable;

public class Goods implements Serializable{
    private Integer gId;
    private String gName;
    private Integer dId;
    private Integer cId;
    private String rContent;
    private Double pFen;
    private String kTime;
    private String jTime;
    private String address;
    private double price;
    private String gTime;
    private Integer rSeat;
    private Double gDiscount;
    private Integer photoId;
    private Classify classify;
    private String photoName;

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }


    public Classify getClassify() {
        return classify;
    }

    public void setClassify(Classify classify) {
        this.classify = classify;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getrContent() {
        return rContent;
    }

    public void setrContent(String rContent) {
        this.rContent = rContent;
    }

    public Double getpFen() {
        return pFen;
    }

    public void setpFen(Double pFen) {
        this.pFen = pFen;
    }

    public String getkTime() {
        return kTime;
    }

    public void setkTime(String kTime) {
        this.kTime = kTime;
    }

    public String getjTime() {
        return jTime;
    }

    public void setjTime(String jTime) {
        this.jTime = jTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getgTime() {
        return gTime;
    }

    public void setgTime(String gTime) {
        this.gTime = gTime;
    }

    public Integer getrSeat() {
        return rSeat;
    }

    public void setrSeat(Integer rSeat) {
        this.rSeat = rSeat;
    }

    public Double getgDiscount() {
        return gDiscount;
    }

    public void setgDiscount(Double gDiscount) {
        this.gDiscount = gDiscount;
    }

    public Integer getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Integer photoId) {
        this.photoId = photoId;
    }
}
