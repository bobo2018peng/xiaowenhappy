package com.xiaowen.manage_paper.service;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xiaowen.framework.domain.paper.Paper;
import com.xiaowen.manage_paper.dao.*;
import com.xiaowen.manage_paper.client.CmsPageClient;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 * @version 1.0
 **/
@Service
public class PaperService {



    @Autowired
    PaperMapper paperMapper;

    public Paper findPaperById(String id){
          return paperMapper.findPaperById( id);
    }

}
