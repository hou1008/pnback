package cn.bdqn.pnback.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class tiaozhuanController {

    @RequestMapping("index.html")
    public String index(){
        return "index";
    }

    @RequestMapping("welcome.html")
    public String welcome(){
        return "welcome";
    }

    @RequestMapping("_blank.html")
    public String blank(){
        return "_blank";
    }
    @RequestMapping("_footer.html")
    public String _footer(){
        return "_footer";
    }
    @RequestMapping("_meta.html")
    public String _meta(){
        return "_meta";
    }
    @RequestMapping("admin-add.html")
    public String adminadd(){
        return "admin-add";
    }
    @RequestMapping("admin-list.html")
    public String adminlist(){
        return "admin-list";
    }
    @RequestMapping("admin-password-edit.html")
    public String adminpasswordedit(){
        return "admin-password-edit";
    }
    @RequestMapping("admin-permission.html")
    public String adminpermission(){
        return "admin-permission";
    }
    @RequestMapping("admin-role.html")
    public String adminrole(){
        return "admin-role";
    }
    @RequestMapping("admin-role-add.html")
    public String adminroleadd(){
        return "admin-role-add";
    }
    @RequestMapping("article-add.html")
    public String articleadd(){
        return "article-add";
    }
    @RequestMapping("article-class.html")
    public String articleclass(){
        return "article-class";
    }
    @RequestMapping("article-class-edit.html")
    public String articleclassedit(){
        return "article-class-edit";
    }
    @RequestMapping("article-list.html")
    public String articlelist(){
        return "article-list";
    }
    @RequestMapping("shifenxianchang-upd.html")
    public String shifenxianchangUpd() {
        return "shifenxianchang-add";
    }

    @RequestMapping("shifenxianchang.html")
    public String shifenxianchang() {
        return "shifenxianchang";
    }
    @RequestMapping("change-password.html")
    public String changepassword(){
        return "change-password";
    }
    @RequestMapping("changjianwenti-add.html")
    public String changjianwentiAdd(){
        return "changjianwenti-add";
    }
    @RequestMapping("changjianwenti.html")
    public String changjianwenti(){
        return "changjianwenti";
    }

    @RequestMapping("changjianwenti-upd.html")
    public String changjianwentiUpd(){
        return "changjianwenti-upd";
    }

    @RequestMapping("charts-1.html")
    public String chartsa(){
        return "charts-1";
    }
    @RequestMapping("charts-2.html")
    public String chartsb(){
        return "charts-2";
    }
    @RequestMapping("charts-3.html")
    public String chartsc(){
        return "charts-3";
    }
    @RequestMapping("charts-4.html")
    public String chartsd(){
        return "charts-4";
    }
    @RequestMapping("charts-5.html")
    public String chartse(){
        return "charts-5";
    }
    @RequestMapping("charts-6.html")
    public String chartsf(){
        return "charts-6";
    }
    @RequestMapping("charts-7.html")
    public String chartsg(){
        return "charts-7";
    }
    @RequestMapping("charts-8.html")
    public String chartsh(){
        return "charts-8";
    }
    @RequestMapping("codeing.html")
    public String codeing(){
        return "codeing";
    }
    @RequestMapping("faxian.html")
    public String faxian(){
        return "faxian";
    }

    @RequestMapping("feedback-list.html")
    public String feedbacklist(){
        return "feedback-list";
    }
    @RequestMapping("index-2.html")
    public String indexs(){
        return "index-2";
    }
    @RequestMapping("login.html")
    public String login(){
        return "login";
    }
    @RequestMapping("member-add.html")
    public String memberadd(){
        return "member-add";
    }
    @RequestMapping("member-del.html")
    public String memberdel(){
        return "member-del";
    }
    @RequestMapping("member-list.html")
    public String memberlist(){
        return "member-list";
    }
    @RequestMapping("member-record-download.html")
    public String memberrecorddownload(){
        return "member-record-download";
    }
    @RequestMapping("member-record-share.html")
    public String memberrecordshare(){
        return "member-record-share";
    }
    @RequestMapping("member-show.html")
    public String membershow(){
        return "member-show";
    }

    @RequestMapping("picture-add.html")
    public String pictureadd(){
        return "picture-add";
    }
    @RequestMapping("picture-list.html")
    public String picturelist(){
        return "picture-list";
    }
    @RequestMapping("picture-show.html")
    public String pictureshow(){
        return "picture-show";
    }
    @RequestMapping("product-add.html")
    public String productadd(){
        return "product-add";
    }
    @RequestMapping("product-brand.html")
    public String productbrand(){
        return "product-brand";
    }
    @RequestMapping("product-category.html")
    public String productcategory(){
        return "product-category";
    }
    @RequestMapping("product-category-add.html")
    public String productcategoryadd(){
        return "product-category-add";
    }
    @RequestMapping("product-list.html")
    public String productlist(){
        return "product-list";
    }
    @RequestMapping("product-list1.html")
    public String productlista(){
        return "product-list1";
    }
    @RequestMapping("product-list2.html")
    public String productlistb(){
        return "product-list2";
    }
    @RequestMapping("shifenxianchang-add.html")
    public String shifenxianchangAdd() {
        return "shifenxianchang-add";
    }
    @RequestMapping("diqu.html")
    public String diqu(){return "diqu";}
    @RequestMapping("diqu-add.html")
    public String diquAdd(){return "diqu-add";}
    @RequestMapping("diqu-upd.html")
    public String diquUpd(){return "diqu-upd";}

    @RequestMapping("record-browse.html")
    public String recordbrowse(){
        return "record-browse";
    }
    @RequestMapping("record-download.html")
    public String recorddownload(){
        return "record-download";
    }
    @RequestMapping("record-share.html")
    public String recordshare(){
        return "record-share";
    }

    @RequestMapping("system-base.html")
    public String systembase(){
        return "system-base";
    }

    @RequestMapping("system-category.html")
    public String systemcategory(){
        return "system-category";
    }
    @RequestMapping("system-category-add.html")
    public String systemcategoryadd(){
        return "system-category-add";
    }
    @RequestMapping("system-data.html")
    public String systemdata(){
        return "system-data";
    }
    @RequestMapping("system-log.html")
    public String systemlog(){
        return "system-log";
    }
    @RequestMapping("system-shielding.html")
    public String systemshielding(){
        return "system-shielding";
    }


    @RequestMapping("user-add.html")
    public String useradd(){
        return "user-add";
    }
    @RequestMapping("user-list.html")
    public String userlist(){
        return "user-list";
    }
    @RequestMapping("user-password-edit.html")
    public String userpasswordedit(){
        return "user-password-edit";
    }
    @RequestMapping("user-show.html")
    public String usershow(){
        return "user-show";
    }
    @RequestMapping("article-upd.html")
    public  String articleupd(){
        return "article-upd";
    }
}