package com.example.loe.dao.impl;

import com.example.loe.dao.UserDao;
import com.example.loe.domain.User;
import com.example.loe.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
  @Autowired
  private UserMapper userMapper;
  
  public List<User> listUsers() {
    return userMapper.listUsers();
   }
  
  public User getUserById(Long userId) {
    return userMapper.getUserById(userId);
   }
  public void saveUser(User user) {
    userMapper.saveUser(user);
   }
  
  public void updateUser(User user) {
    userMapper.updateUser(user);
   }
  
  public void removeUser(Long userId) {
    userMapper.removeUser(userId);
   }
  
}