package com.controller;

import com.domain.Tenderingfile;
import com.domain.Tenderingprj;
import com.domain.Tenderingtype;
import com.domain.User;
import com.service.TenderingfileService;
import com.service.TenderingprjService;
import com.service.TenderingtypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class TenderingprjContorller {
    @Resource(name = "tenderingprjServiceImpl")
    TenderingprjService tenderingprjService;

    @Resource(name = "tenderingtypeServiceImpl")
    TenderingtypeService tenderingtypeService;

    @Resource(name ="tenderingfileServiceImpl" )
    TenderingfileService tenderingfileService;

    /**
     * 表单提交到数据库
     * @param tenderingprj
     * @param
     * @return
     */
    @RequestMapping("addtenderingprj")
    public String addTenderingprj(Tenderingprj tenderingprj, @RequestParam("file")List<MultipartFile> files, HttpSession session,String tenderingtypename){
        tenderingprj.setSign(0);
        User user = (User) session.getAttribute("user");
        tenderingprj.setUserid(user.getId());
        tenderingprj.setTenderingtypeid(tenderingtypeService.MyselectWithName(tenderingtypename));
        String filepath="E:\\阳光采购招标询价系统\\a\\";
        Tenderingfile tenderingfile=new Tenderingfile();
        tenderingprjService.insert(tenderingprj);
        try {
            for (MultipartFile file : files) {
                file.transferTo(new File(filepath+file.getOriginalFilename()));
                tenderingfile.setFilepath(filepath+file.getOriginalFilename());
                tenderingfile.setTenderingprjid(tenderingprj.getId());
                tenderingfileService.insert(tenderingfile);
            }

        } catch (Exception e) {

        }

        return "tenderingprjfrom";
    }

    /**
     * 控制层到tenderingprjFrom.jsp页面
     * @return
     */
    @RequestMapping("getprjform")
    public ModelAndView GetprjForm(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("tenderingprjfrom");
        return modelAndView;
    }

    /**
     * 获取招标类型
     * @return
     */
    @ResponseBody
    @RequestMapping("gettype")
    public List<Tenderingtype> Gettype(){
        List<Tenderingtype> tenderingtypes = tenderingtypeService.selectAll();
        return tenderingtypes;
    }
    /**
     * 查询增加的招标项目
     */
    @RequestMapping("selectprjall")
    public ModelAndView selectprjAll(HttpSession session){
        ModelAndView modelAndView=new ModelAndView();
        User user = (User) session.getAttribute("user");
        Tenderingprj tenderingprj=new Tenderingprj();
        tenderingprj.setUserid(user.getId());
        tenderingprj.setSign(0);
        List<Tenderingprj> tenderingprjs = tenderingprjService.selectprjAll(tenderingprj);
        modelAndView.addObject("tenderingprjs",tenderingprjs);
        modelAndView.setViewName("selectprjallbyuserid");
        return modelAndView;
    }

    /**
     * 查看id对应的项目表单信息
   * @param id
     * @return
     */
    @RequestMapping("selectdetailedinformation/{id}")
    public ModelAndView selectDetailedInformation(@PathVariable("id") int id){
        ModelAndView modelAndView=new ModelAndView();
        Tenderingprj tenderingprj = tenderingprjService.selectDetailedInformationById(id);
        modelAndView.addObject("tenderingprj",tenderingprj);
        modelAndView.setViewName("prjInformation/selectdetailedinformation");
        List<Tenderingfile> tenderingfiles = tenderingfileService.selectAllFileByPrjid(id);
        modelAndView.addObject("tenderingfiles",tenderingfiles);
        return modelAndView;
    }

    /**
     * 通过待发布的项目
     * @param id
     * @return
     */
    @RequestMapping("tongguotenderngprjbyid/{id}")
    public String tongguoTenderngprjById(@PathVariable("id")int id){
        SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
        Date date=new Date(System.currentTimeMillis());
        String nowTime = formatter.format(date);
        Tenderingprj tenderingprj=new Tenderingprj();
        tenderingprj.setId(id);
        tenderingprj.setReleasetime(nowTime);
        tenderingprjService.tongguoTenderngprjById(tenderingprj);
        return "redirect:/selecttongguoprj";
    }

    /**
     * 查询已经发布的项目
     */
    @RequestMapping("selecttongguoprj")
    public ModelAndView selectTongguoPrj(HttpSession session){
        ModelAndView modelAndView=new ModelAndView();
        User user = (User) session.getAttribute("user");
        Tenderingprj tenderingprj=new Tenderingprj();
        tenderingprj.setUserid(user.getId());
        tenderingprj.setSign(1);
        List<Tenderingprj> tenderingprjs = tenderingprjService.selectprjAll(tenderingprj);
        modelAndView.addObject("tenderingprjs",tenderingprjs);
        modelAndView.setViewName("prjInformation/selecttongguoprj");
        return modelAndView;
    }

    /**
     * 查看id对应的项目表单信息
     * @param id
     * @return
     */
    @RequestMapping("selecttongguoinformation/{id}")
    public ModelAndView selecttongguoinformation(@PathVariable("id") int id){
        ModelAndView modelAndView=new ModelAndView();
        Tenderingprj tenderingprj = tenderingprjService.selectDetailedInformationById(id);
        modelAndView.addObject("tenderingprj",tenderingprj);
        modelAndView.setViewName("prjInformation/selecttongguoinformation");
        List<Tenderingfile> tenderingfiles = tenderingfileService.selectAllFileByPrjid(id);
        modelAndView.addObject("tenderingfiles",tenderingfiles);
        return modelAndView;
    }
}
