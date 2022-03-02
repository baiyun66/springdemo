package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.bean.House;
import com.example.demo.service.HouseService;
import com.example.demo.mapper.HouseMapper;
import org.springframework.stereotype.Service;

/**
* @author 24629
* @description 针对表【house】的数据库操作Service实现
* @createDate 2022-03-02 18:39:45
*/
@Service
public class HouseServiceImpl extends ServiceImpl<HouseMapper, House>
    implements HouseService{

}




