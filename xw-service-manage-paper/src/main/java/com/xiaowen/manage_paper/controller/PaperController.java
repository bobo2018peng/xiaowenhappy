package com.xiaowen.manage_paper.controller;

import com.xiaowen.api.paper.PaperControllerApi;
import com.xiaowen.framework.domain.paper.Paper;
import com.xiaowen.framework.web.BaseController;
import com.xiaowen.manage_paper.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Administrator
 * @version 1.0
 **/
@RestController
@RequestMapping("/paper")
public class PaperController extends BaseController implements PaperControllerApi {

    @Autowired
    PaperService paperService;



    @GetMapping("/paper/{paperId}")
    public Paper findPaper(@PathVariable("id") String id) {
        return paperService.findPaperById(id);
    }
}
