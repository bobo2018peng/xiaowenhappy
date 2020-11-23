package com.xiaowen.manage_paper.dao;

import com.github.pagehelper.Page;
import com.xiaowen.framework.domain.paper.Paper;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Administrator.
 */
@Mapper
public interface PaperMapper {
   Paper findPaperById(String id);
}
