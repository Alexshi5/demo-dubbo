package com.mengfei.provider;

import com.mengfei.api.DemoService;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello" + name;
    }
}
