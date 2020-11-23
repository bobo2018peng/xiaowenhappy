package com.xiaowen.api.paper;


import com.xiaowen.framework.domain.paper.Paper;
import com.xiaowen.framework.model.response.QueryResponseResult;
import com.xiaowen.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Created by Administrator.
 */
@Api(value="教案管理接口",description = "教案管理接口，提供教案的增、删、改、查")
public interface PaperControllerApi {
    @ApiOperation("教案查询")
    public Paper findPaper(String paperId);


}
