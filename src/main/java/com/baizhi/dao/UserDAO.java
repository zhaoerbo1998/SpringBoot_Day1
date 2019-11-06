package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

public interface UserDAO {
    //插入
    public  void   save(User user);
    //查询所有
    public  List<User> selectAll();
    //修改
    public  void  update(User user);
    //删除
    public void   delete(String id);
    //批量删除
    public void   deleteByIDS(String[] ids);

}
