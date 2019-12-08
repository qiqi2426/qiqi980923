package com.domain;

public class Supplier {
    private Integer id;

    /**
    * 供应商名字
    */
    private String suppliername;

    /**
    * 法人
    */
    private String supplierpeople;

    /**
    * 注册资金
    */
    private Integer suppliermoney;

    /**
    * 地址
    */
    private String supplieraddress;

    /**
    * 电话
    */
    private String tel;

    /**
    * 注册标志
    */
    private Integer sign;

    /**
    * 审核的意见
    */
    private String explain;

    /**
    * 供应商类型
    */
    private Integer suppliertypeid;

    /**
    * 行业类型
    */
    private Integer tradetypeid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public String getSupplierpeople() {
        return supplierpeople;
    }

    public void setSupplierpeople(String supplierpeople) {
        this.supplierpeople = supplierpeople;
    }

    public Integer getSuppliermoney() {
        return suppliermoney;
    }

    public void setSuppliermoney(Integer suppliermoney) {
        this.suppliermoney = suppliermoney;
    }

    public String getSupplieraddress() {
        return supplieraddress;
    }

    public void setSupplieraddress(String supplieraddress) {
        this.supplieraddress = supplieraddress;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public Integer getSuppliertypeid() {
        return suppliertypeid;
    }

    public void setSuppliertypeid(Integer suppliertypeid) {
        this.suppliertypeid = suppliertypeid;
    }

    public Integer getTradetypeid() {
        return tradetypeid;
    }

    public void setTradetypeid(Integer tradetypeid) {
        this.tradetypeid = tradetypeid;
    }
}