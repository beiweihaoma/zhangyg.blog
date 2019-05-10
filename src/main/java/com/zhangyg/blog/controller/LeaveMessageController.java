package com.zhangyg.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by admin on 2019/4/29.
 */
@RestController
@RequestMapping(value = "/leaveMessage")
public class LeaveMessageController {

    /**
     * 首页列表
     *
     * @return
     * @Edition 1.0.0
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView leaveMessage() {
        ModelAndView mv = new ModelAndView("leaveMessage");
        return mv;
    }
}
