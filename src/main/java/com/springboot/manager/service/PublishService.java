package com.springboot.manager.service;

import com.springboot.manager.dto.PublishDto;
import com.springboot.manager.mapper.PublishMapper;
import com.springboot.manager.mapper.UserMapper;
import com.springboot.manager.model.Publish;
import com.springboot.manager.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PublishService {

    @Autowired
    private PublishMapper publishMapper;

    @Autowired
    private UserMapper userMapper;

    public List<PublishDto> list() {
        List<Publish> publishes = publishMapper.list();
        List<PublishDto> publishDtoList = new ArrayList<>();
        for (Publish publish:publishes){
            User user = userMapper.findById(publish.getCreator());
            PublishDto publishDto = new PublishDto();
            BeanUtils.copyProperties(publish,publishDto);
            publishDto.setUser(user);
            publishDtoList.add(publishDto);
        }
        return publishDtoList;
    }
}
