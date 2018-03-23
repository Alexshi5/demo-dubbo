package com.mengfei.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderTest {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-provider.xml");
        context.start();
        System.out.println("服务已经启动！");
        System.in.read();//在控制台按任意键退出
    }
}
