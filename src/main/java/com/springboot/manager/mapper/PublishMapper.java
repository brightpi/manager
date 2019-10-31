package com.springboot.manager.mapper;

import com.springboot.manager.model.Publish;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PublishMapper {
    @Insert("insert into publish(title,description,tag,gmt_create,gmt_modified,creator) values(#{title},#{description},#{tag},#{gmt_create},#{gmt_modified},#{creator})")
    public void create(Publish publish);
}

