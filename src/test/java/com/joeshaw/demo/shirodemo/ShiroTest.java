package com.joeshaw.demo.shirodemo;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShiroTest {

    @Test
    public void getPsw() {
        /**
         * 构造器参数分别为:加密类型,需要加密的密码,盐,加密次数
         * 结果为加密后的密码
         */
        SimpleHash hash = new SimpleHash("md5", "123", "ls", 1024);
        System.out.println(hash);
    }
}
