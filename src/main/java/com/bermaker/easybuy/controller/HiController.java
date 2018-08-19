/**
 * @Title: HiController.java
 * @Desc: TODO
 * @Package: com.bermaker.easybuy.controller
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年8月19日 下午10:11:06
 * @version 1.0
 */
package com.bermaker.easybuy.controller;

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

    @RequestMapping(value = "say", method = RequestMethod.GET)
    public ModelAndView say() {
        CommonJsonModelAndView view = new CommonJsonModelAndView();

        return view;
    }

}
