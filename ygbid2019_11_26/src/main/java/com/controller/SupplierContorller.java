package com.controller;

import com.domain.Supplier;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.SupplierService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * 供应商控制层
 */
@Controller
public class SupplierContorller {
    @Resource(name ="supplierServiceImpl")
    SupplierService supplierService;

    /**
     * 遍历显示所以的供应商信息表
     * @return
     */
    @RequestMapping("selectallsupplier")
    public ModelAndView SelectAllSupplier(Integer page){
        if (page==null){
            page=0;
        }
        PageHelper.startPage(page,3);
        List<Supplier> suppliers = supplierService.selectAllSupplier();
        PageInfo pageInfo = new PageInfo(suppliers);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("suppliers");
        modelAndView.addObject("suppliers",suppliers);
        modelAndView.addObject("pageInfo",pageInfo);
        return modelAndView;
    }
}
