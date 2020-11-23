package com.xiaowen.manage_paper.client;

import com.xiaowen.framework.domain.cms.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by Administrator.
 */
@FeignClient(value = "XW-SERVICE-MANAGE-CMS") //指定远程调用的服务名
public interface CmsPageClient {
    //根据页面id查询页面信息，远程调用cms请求数据
    @GetMapping("/cms/student/get/{id}")//用GetMapping标识远程调用的http的方法类型
    public Student findStudentById(@PathVariable("id") String id);


}
