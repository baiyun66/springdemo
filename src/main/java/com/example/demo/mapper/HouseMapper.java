package com.example.demo.mapper;

import com.example.demo.bean.House;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 24629
* @description 针对表【house】的数据库操作Mapper
* @createDate 2022-03-02 18:39:45
* @Entity com.example.demo.bean.House
*/
@Mapper
public interface HouseMapper extends BaseMapper<House> {

    /**
     *
     * @param authorId
     * @return
     */
    String searchAuthorCityById(int authorId);
}




