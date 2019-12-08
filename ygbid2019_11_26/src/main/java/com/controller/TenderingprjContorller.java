package com.controller;

import com.domain.Tenderingfile;
import com.domain.Tenderingprj;
import com.domain.Tenderingtype;
import com.domain.User;
import com.service.TenderingfileService;
import com.service.TenderingprjService;
import com.service.TenderingtypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
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
    public String AddTenderingprj(Tenderingprj tenderingprj, @RequestParam("file")List<MultipartFile> files, HttpSession session,String tenderingtypename){
        tenderingprj.setSign(0);
        User user = (User) session.getAttribute("user");
        tenderingprj.setUserid(user.getId());
        tenderingprj.setTenderingtypeid(tenderingtypeService.MyselectWithName(tenderingtypename));
        String filepath="E:\\阳光采购招标询价系统\\a\\";
        Tenderingfile tenderingfile=new Tenderingfile();

        try {
            for (MultipartFile file : files) {
                file.transferTo(new File(filepath+file.getOriginalFilename()));
                tenderingfile.setFilepath(filepath+file.getOriginalFilename());
                tenderingfileService.insert(tenderingfile);
                tenderingprj.setTenderingfileid(tenderingfile.getId());
            }

        } catch (Exception e) {

        }
        tenderingprjService.insert(tenderingprj);
        return "tenderingprjFrom";
    }

    /**
     * 控制层到tenderingprjFrom.jsp页面
     * @return
     */
    @RequestMapping("getprjForm")
    public ModelAndView GetprjForm(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("tenderingprjFrom");
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
}
