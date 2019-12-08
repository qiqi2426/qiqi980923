package com.controller;

import com.service.TenderingfileService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@Controller
public class TenderingprjFileContorller {

    @Resource(name ="tenderingfileServiceImpl" )
    TenderingfileService tenderingfileService;

    @ResponseBody
    @RequestMapping("addfile")
    public String addFile(@RequestParam("file") MultipartFile file){
        System.out.println(file.getName());
        return file.getName();
    }
}
