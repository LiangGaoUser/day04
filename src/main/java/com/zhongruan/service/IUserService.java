package com.zhongruan.service;

import com.zhongruan.bean.UserInfo;

import java.util.List;

public interface IUserService {
    public List<UserInfo> findAll();
    public boolean save(UserInfo userInfo);
    public boolean update (UserInfo userInfo);
    public UserInfo queryById(int id);
    public boolean delete (int id);
}
