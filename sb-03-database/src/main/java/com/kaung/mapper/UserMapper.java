package com.kaung.mapper;

import com.kaung.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> queryLs();

    void delUser(int id);
}
