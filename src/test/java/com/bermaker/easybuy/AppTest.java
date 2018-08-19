/**
 * @Title: AppTest.java
 * @Desc: TODO
 * @Package: com.bermaker.easybuy
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年8月19日 下午5:23:42
 * @version 1.0
 */
package com.bermaker.easybuy;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ClassName: AppTest
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年8月19日 下午5:23:42
 * @version 1.0
 */
public class AppTest {

    private static final Logger logger = LoggerFactory.getLogger(AppTest.class);
    
    @Test
    public void testLogger() {
        logger.info("hi, this is a test");
    }

}
