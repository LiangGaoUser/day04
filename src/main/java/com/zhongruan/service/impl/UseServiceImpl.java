package com.zhongruan.service.impl;

import com.zhongruan.bean.UserInfo;
import com.zhongruan.dao.IUserDao;
import com.zhongruan.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class UseServiceImpl implements IUserService {
    @Autowired
    IUserDao userdao;
    @Override
    public List<UserInfo> findAll() {
        return userdao.findAll();
    }

    @Override
    public boolean save(UserInfo userInfo) {
        return userdao.save(userInfo);
    }

    @Override
    public boolean update(UserInfo userInfo) {
        return userdao.update(userInfo);
    }

    @Override
    public UserInfo queryById(int id) {
        return userdao.queryById(id);
    }

    @Override
    public boolean delete(int id) {
        return userdao.delete(id);
    }
}
