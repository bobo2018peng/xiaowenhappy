package com.xiaowen.manage_cms.controller;

import com.xiaowen.api.cms.CmsStudentControllerApi;
import com.xiaowen.framework.domain.cms.Student;

import com.xiaowen.manage_cms.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cms/student")
public class CmsStudentController implements CmsStudentControllerApi {

    @Autowired
    PageService pageService;

    @GetMapping("/get/{id}")
    public Student findStudentById(@PathVariable("id") String id) {

        return pageService.findStudentById(id);
    }


}
