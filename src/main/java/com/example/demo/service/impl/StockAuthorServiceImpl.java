package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.bean.StockAuthor;
import com.example.demo.service.StockAuthorService;
import com.example.demo.mapper.StockAuthorMapper;
import org.springframework.stereotype.Service;

/**
* @author 24629
* @description 针对表【stock_author】的数据库操作Service实现
* @createDate 2022-03-02 18:39:45
*/
@Service
public class StockAuthorServiceImpl extends ServiceImpl<StockAuthorMapper, StockAuthor>
    implements StockAuthorService{

}




