package com.mengfei.consumer;

import com.mengfei.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerTest {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
        String hello = demoService.sayHello("World");
        System.out.println(hello);
        System.in.read();//在控制台按任意键退出
    }
}
