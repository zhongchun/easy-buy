/**
 * @Title: AppTest.java
 * @Desc: TODO
 * @Package: com.bermaker.easybuy
 * @author: yuzhongchun(yuzhongchun @ baidu.com)
 * @date: 2018年8月19日 下午5:23:42
 * @version 1.0
 */
package com.bermaker.easybuy;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ClassName: AppTest
 *
 * @version 1.0
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun @ baidu.com)
 * @date: 2018年8月19日 下午5:23:42
 */
public class AppTest {

    private static final Logger logger = LoggerFactory.getLogger(AppTest.class);

    @Test
    public void testLogger() {
        logger.info("hi, this is a test");
    }

    @Test
    public void testHashMap() {
        Map<String, String> map = new HashMap<String, String>();

        map.put("name", "bermaker");
        map.put("age", "24");
        map.put("address", "beijing, China");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }

}
