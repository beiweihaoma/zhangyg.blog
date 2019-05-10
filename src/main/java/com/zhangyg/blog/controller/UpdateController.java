package com.zhangyg.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by admin on 2019/4/29.
 */
@RestController
@RequestMapping(value = "/update")
public class UpdateController {

    /**
     * 首页列表
     * @Edition 1.0.0
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView updatePage() {
        ModelAndView mv = new ModelAndView("/update");
        return mv;
    }
}
