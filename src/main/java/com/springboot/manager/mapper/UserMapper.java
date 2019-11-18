package com.springboot.manager.mapper;

import com.springboot.manager.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Insert("insert into user(name,account_id,token,gmt_create,gmt_modified,head_portrait) values(#{name},#{account_id},#{token},#{gmt_create},#{gmt_modified},#{head_portrait})")
    public void insert(User user);

    @Select("select * from user where token = #{token}")
    User findUserByToken(@Param("token") String token);

    @Select("select * from user where id = #{creator}")
    User findById(@Param("creator")Integer creator);
}
