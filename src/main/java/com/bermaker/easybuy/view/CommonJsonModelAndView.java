/**
 * @Title: CommonJsonModelAndView.java
 * @Desc: TODO
 * @Package: com.bermaker.easybuy.view
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年8月19日 下午9:56:18
 * @version 1.0
 */
package com.bermaker.easybuy.view;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * ClassName: CommonJsonModelAndView
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年8月19日 下午9:56:18
 * @version 1.0
 */
public class CommonJsonModelAndView extends ModelAndView {

    private Map<String, Object> data = new HashMap<String, Object>();

    /**
     * @Title: CommonJsonModelAndView
     * @Desc: TODO
     */
    public CommonJsonModelAndView() {
        setView(new MappingJackson2JsonView());
        addObject("errno", 0);
        addObject("errmsg", "");
        addObject("data", data);
    }

    /**
     * @Title: CommonJsonModelAndView
     * @Desc: TODO
     * @param key
     * @param value
     */
    public CommonJsonModelAndView(String key, Object value) {
        this();
        addDataItem(key, value);
    }

    /**
     * @Title: getErrno
     * @Desc: TODO
     * @return
     */
    public Integer getErrno() {
        return (Integer) getModel().get("errno");
    }

    /**
     * @Title: setErrno
     * @Desc: TODO
     * @param errno
     */
    public void setErrno(Integer errno) {
        addObject("errno", errno);
    }

    /**
     * @Title: getMessage
     * @Desc: TODO
     * @return
     */
    public String getErrmsg() {
        return (String) getModel().get("errmsg");
    }

    /**
     * @Title: setErrmsg
     * @Desc: TODO
     * @param errmsg
     */
    public void setErrmsg(String errmsg) {
        addObject("errmsg", errmsg);
    }

    /**
     * @Title: addDataItem
     * @Desc: TODO
     * @param key
     * @param value
     */
    public void addDataItem(String key, Object value) {
        this.data.put(key, value);
    }

}
