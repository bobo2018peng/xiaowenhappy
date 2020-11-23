package com.xiaowen.api.cms;


import com.xiaowen.framework.domain.cms.Student;
import com.xiaowen.framework.domain.paper.Paper;
import com.xiaowen.framework.model.response.QueryResponseResult;
import com.xiaowen.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value="学生管理接口",description = "学生管理接口，提供页面的增、删、改、查")
public interface CmsStudentControllerApi {
    //页面查询
    @ApiOperation("分页查询页面列表")
    public Student findStudentById(String studentId);



}
