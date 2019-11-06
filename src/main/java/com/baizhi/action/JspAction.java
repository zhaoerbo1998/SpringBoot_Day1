package com.baizhi.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class JspAction {

    @RequestMapping("/jsp")
    public  String   jsp() throws Exception{
        System.out.println("我是第一个jsp");
        return "index";  //  /index.jsp
    }


}
