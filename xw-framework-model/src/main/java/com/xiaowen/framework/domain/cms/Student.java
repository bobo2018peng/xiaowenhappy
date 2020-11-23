package com.xiaowen.framework.domain.cms;

import java.io.Serializable;

/**
 * Created by admin on 2018/2/10.
 */

public class Student implements Serializable {
    private static final long serialVersionUID = -916357110051689486L;

    private int id;
    private String stuName;
    private int stuClassId;
    private String stuSex;
    private String stuBirth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuClassId() {
        return stuClassId;
    }

    public void setStuClassId(int stuClassId) {
        this.stuClassId = stuClassId;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public String getStuBirth() {
        return stuBirth;
    }

    public void setStuBirth(String stuBirth) {
        this.stuBirth = stuBirth;
    }
}
