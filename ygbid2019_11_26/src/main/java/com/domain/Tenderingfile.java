package com.domain;

import javax.persistence.Id;

public class Tenderingfile {
    @Id
    private Integer id;

    /**
    * 招标项目表 关联项目招标表的id号
    */
    private Integer tenderingprjid;

    /**
    * 对应文件的路径
    */
    private String filepath;

    private String filename;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTenderingprjid() {
        return tenderingprjid;
    }

    public void setTenderingprjid(Integer tenderingprjid) {
        this.tenderingprjid = tenderingprjid;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }
}