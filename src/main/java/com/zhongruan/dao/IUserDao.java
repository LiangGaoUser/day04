package com.zhongruan.dao;

import com.zhongruan.bean.UserInfo;

import java.util.List;

public interface IUserDao {
    public List<UserInfo> findAll();
    public boolean save(UserInfo userInfo);
    public boolean delete (int id);
    public boolean update(UserInfo userInfo);
    public UserInfo queryById(int id);
}
