package com.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

public class Tenderingprj {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
    * 招标类型(外键，引用招标类型表的id)
    */
    private Integer tenderingtypeid;

    /**
    * 招标项目发布人（默认是当前登陆用户）外键，引用后台用户表的id
    */
    private Integer userid;

    /**
    * 标题
    */
    private String title;

    /**
    * 内容
    */
    private String body;

    /**
    * 发布时间(发布项目的时候生成)
    */
    private String releasetime;

    /**
    * 截止时间（供应商投标结束时间）
    */
    private String supplierendtime;

    /**
    * 开标时间
    */
    private String opentime;

    /**
    * 中标单位(外键，引用供应商表的id)
    */
    private Integer supplierid;

    /**
    * 标志
    */
    private Integer sign;

@Transient
    private Tenderingtype tenderingtype;

    public Tenderingtype getTenderingtype() {
        return tenderingtype;
    }

    public void setTenderingtype(Tenderingtype tenderingtype) {
        this.tenderingtype = tenderingtype;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTenderingtypeid() {
        return tenderingtypeid;
    }

    public void setTenderingtypeid(Integer tenderingtypeid) {
        this.tenderingtypeid = tenderingtypeid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(String releasetime) {
        this.releasetime = releasetime;
    }

    public String getSupplierendtime() {
        return supplierendtime;
    }

    public void setSupplierendtime(String supplierendtime) {
        this.supplierendtime = supplierendtime;
    }

    public String getOpentime() {
        return opentime;
    }

    public void setOpentime(String opentime) {
        this.opentime = opentime;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }
}