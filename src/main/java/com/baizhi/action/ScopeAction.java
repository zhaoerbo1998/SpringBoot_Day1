package com.baizhi.action;

import com.baizhi.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/scope")
public class ScopeAction {

    @RequestMapping("/s1")
    public  String    s1(HttpServletRequest request, HttpSession session) throws Exception{
        request.setAttribute("name","张三");
        session.setAttribute("n","哈哈");
        return "scope";
    }

    @RequestMapping("/s2")
    public  String    s2(Model model, ModelMap Map) throws Exception{
        User user = new User("1", "张三", "123456", 18);
        User user2 = new User("2", "李四", "123456", 18);
        User user3 = new User("3", "赵六", "123456", 18);
        List<User> users= new ArrayList<User>();
        users.add(user);
        users.add(user2);
        users.add(user3);
        Map.addAttribute("users",users);
        return "scope";
    }



}
