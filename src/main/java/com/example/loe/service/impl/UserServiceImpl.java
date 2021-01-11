package com.example.loe.service.impl;

import com.example.loe.dao.UserDao;
import com.example.loe.domain.User;
import com.example.loe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserDao userDao;
  
  public List<User> listUsers() {
    return userDao.listUsers();
   }
  
  public User getUserById(Long userId) {
    return userDao.getUserById(userId);
   }
  public void saveUser(User user) {
   userDao.saveUser(user);
   }
  
  public void updateUser(User user) {
   userDao.updateUser(user);
   }
  
  public void removeUser(Long userId) {
   userDao.removeUser(userId);
   }
  
}
