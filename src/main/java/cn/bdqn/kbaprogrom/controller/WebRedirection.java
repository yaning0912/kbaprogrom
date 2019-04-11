package cn.bdqn.kbaprogrom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * 单纯的网页跳转
 * */
@Controller
public class WebRedirection {

    /*
    * 跳转到Index页面
    * */
    @RequestMapping("/index.html")
    public String trunIndex(){
        return "home";
    }

    /*
     * 跳转到kab公告页面
     * */
    @RequestMapping("/KabGG.html")
    public String trunKabGG(){
        return "notice";
    }

    /**
     *跳转管理班级页面MaClass
     * @return
     */
    @RequestMapping("/MaClass")
    public String trunMaClass(){
        return "MaClass";
    }

    /**
     *跳转修改个人资料页面personalUpd.ftl
     * @return
     */
    @RequestMapping("/personalUpd")
    public String trunpersonalUpd(){
        return "personalUpd";
    }
    /**
     *修改密码passUpd.ftl
     * @return
     */
    @RequestMapping("/passUpd")
    public String trunpassUpd(){
        return "passUpd";
    }
    /**
     *申请密保  secretPro
     * @return
     */
    @RequestMapping("/secretPro")
    public String trunsecretPro(){
        return "secretPro";
    }
    /**
     *创建班级页码  classCr.ftl
     * @return
     */
    @RequestMapping("/classCr")
    public String trunclassCr(){
        return "classCr";
    }

    /**
     *修改班级页面  classUpd.ftl
     * @return
     */
    @RequestMapping("/classUpd")
    public String trunclassUpd(){
        return "classUpd";
    }


}
