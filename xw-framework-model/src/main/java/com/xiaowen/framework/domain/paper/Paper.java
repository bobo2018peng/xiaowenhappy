package com.xiaowen.framework.domain.paper;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by admin on 2018/2/10.
 */

public class Paper implements Serializable {
    private static final long serialVersionUID = -916357110051689486L;

    private int id;
    private String paperName;
    private String paperDate;
    private String paperMark;
    private int paperTeald;
    private int paperClassId;
    private int paperCourseId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public String getPaperDate() {
        return paperDate;
    }

    public void setPaperDate(String paperDate) {
        this.paperDate = paperDate;
    }

    public String getPaperMark() {
        return paperMark;
    }

    public void setPaperMark(String paperMark) {
        this.paperMark = paperMark;
    }

    public int getPaperTeald() {
        return paperTeald;
    }

    public void setPaperTeald(int paperTeald) {
        this.paperTeald = paperTeald;
    }

    public int getPaperClassId() {
        return paperClassId;
    }

    public void setPaperClassId(int paperClassId) {
        this.paperClassId = paperClassId;
    }

    public int getPaperCourseId() {
        return paperCourseId;
    }

    public void setPaperCourseId(int paperCourseId) {
        this.paperCourseId = paperCourseId;
    }
}
