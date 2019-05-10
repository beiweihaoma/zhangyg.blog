package com.zhangyg.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by admin on 2019/4/29.
 */
@RestController
@RequestMapping(value = "/recommend")
public class RecommendController {

    /**
     * 首页列表
     *
     * @return
     * @Edition 1.0.0
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView recommendPage() {
        ModelAndView mv = new ModelAndView("/recommend");
        return mv;
    }
}
