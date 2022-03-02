package com.example.demo.service;

import com.example.demo.bean.House;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
* @author 24629
* @description 针对表【house】的数据库操作Service
* @createDate 2022-03-02 18:39:45
*/
@Service
public interface HouseService extends IService<House> {



}
