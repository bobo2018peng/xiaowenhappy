package com.xiaowen.manage_cms.service;


import com.xiaowen.manage_cms.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xiaowen.framework.domain.cms.Student;



@Service
public class PageService {

    @Autowired
    StudentMapper studentMapper;

    public Student findStudentById(String id){

        return studentMapper.findStudentById(id);
    }

}
