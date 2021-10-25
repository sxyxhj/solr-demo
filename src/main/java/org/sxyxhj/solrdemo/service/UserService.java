package org.sxyxhj.solrdemo.service;

import org.sxyxhj.solrdemo.entity.User;

public interface UserService {


    User getUserById(int id);

    boolean addUser(User user);

    boolean deleteUserById(int id);

    boolean updateUser(User user);
}
