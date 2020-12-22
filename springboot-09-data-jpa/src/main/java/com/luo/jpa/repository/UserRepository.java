package com.luo.jpa.repository;

import com.luo.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 继承JpaRepository来完成对数据库的操作
 * @author luo Fuqiang
 * @date 2020/12/22 14:25
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
