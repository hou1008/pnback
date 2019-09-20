package cn.bdqn.pnback.pojo;

public class Banner {
    private  Integer  Id;
    private Integer    gId;
      private String  bPhoto;
    private String    bTime;
    private Integer   zhuangtai;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getbPhoto() {
        return bPhoto;
    }

    public void setbPhoto(String bPhoto) {
        this.bPhoto = bPhoto;
    }

    public String getbTime() {
        return bTime;
    }

    public void setbTime(String bTime) {
        this.bTime = bTime;
    }

    public Integer getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(Integer zhuangtai) {
        this.zhuangtai = zhuangtai;
    }
}
