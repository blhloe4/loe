package com.example.loe.mapper;

import com.example.loe.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> listUsers();

    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") Long id);

    @Insert("insert into user (name,age) values (#{name},#{age})")
    void saveUser(User user);

    @Update("update user set name = #{name} , age = #{age} where id = #{id}")
    void updateUser(User user);

    @Delete("delete from user where id = #{id}")
    void removeUser(@Param("id") Long id);
}
