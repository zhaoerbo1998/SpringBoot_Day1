package com.baizhi.test;

import com.baizhi.Application;
import com.baizhi.dao.UserDAO;
import com.baizhi.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class) //开启SpringBoot的测试
@SpringBootTest(classes = Application.class) //初始化SpringBoot的相关配置
public class TestDAO {

    @Autowired
    private UserDAO userDAO;

    @Test
    public  void   testDAO(){
      //  userDAO.save(new User("1","张三","123456",18));
         //userDAO.update(new User("1","李四","888888",29));
        // userDAO.delete("1");
        //批量删除
        String [] ids={"3","4"};
        userDAO.deleteByIDS(ids);
        List<User> users = userDAO.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

}
