package com.xiaowen.manage_cms.dao;

import com.xiaowen.framework.domain.cms.Student;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface StudentMapper {
   Student findStudentById(String id);
}
