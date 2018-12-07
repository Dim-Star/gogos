package com.example.main.dao;

import com.example.main.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/12/6.
 */
@Repository
public interface UserDao extends JpaRepository<User,Long> {
}
