package org.example.dao;

public class UserDaoMysql implements UserDao{
    @Override
    public void getUser() {
        System.out.println("MySQL获取用户数据");
    }
}
