/**
 * @Title: HiController.java
 * @Desc: TODO
 * @Package: com.bermaker.easybuy.controller
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年8月19日 下午10:11:06
 * @version 1.0
 */
package com.bermaker.easybuy.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bermaker.easybuy.view.CommonJsonModelAndView;

/**
 * ClassName: HiController
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年8月19日 下午10:11:06
 * @version 1.0
 */
@Controller
@RequestMapping("/hi")
public class HiController {

    private static final Logger LOG = LoggerFactory.getLogger(HiController.class);

    @RequestMapping(value = "say", method = RequestMethod.GET)
    public ModelAndView say() {
        CommonJsonModelAndView view = new CommonJsonModelAndView();

        return view;
    }

    @RequestMapping(value = "hand", method = RequestMethod.GET)
    public ModelAndView hand() {
        CommonJsonModelAndView view = new CommonJsonModelAndView();
        List<Integer> list = new ArrayList<Integer>();
        list.add(2017);
        list.add(2018);
        list.add(2019);
        view.addDataItem("list", list);
        LOG.info(">>>> Receive a hand request, size={}", list.size());
        return view;
    }
}

