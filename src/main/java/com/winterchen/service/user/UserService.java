package com.winterchen.service.user;

import com.github.pagehelper.PageInfo;
import com.winterchen.model.UserDomain;

import java.util.List;

public interface UserService {

    int addUser(UserDomain user);
    int deleteUser(UserDomain user);
    int updateUser(UserDomain user);
    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}