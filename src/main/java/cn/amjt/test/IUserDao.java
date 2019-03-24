package cn.amjt.test;

import cn.amjt.domain.User;

import java.util.List;

public interface IUserDao {

    List<User> findAll();



    User findById(Integer id);
}
