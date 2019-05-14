package com.retail.Retail.Store.service;

import com.retail.Retail.Store.entity.User;

import java.util.List;

public interface UserService {

    User addUser(User user);
    Boolean deleteUser(int id);
    User updateUser(User user);
    User getUser(int id);
    List<User>  getAllUser();
}
