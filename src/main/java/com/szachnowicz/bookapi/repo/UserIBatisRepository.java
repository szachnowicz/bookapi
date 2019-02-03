package com.szachnowicz.bookapi.repo;

import com.szachnowicz.bookapi.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserIBatisRepository {


    @Select("SELECT * FROM USER WHERE id = #{id}")
    public User findById(long id);

    @Select("Select * from User")
    public List<User> findAll();

}
