package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.bean.Author;
import com.example.demo.bean.AuthorInfo;
import com.example.demo.bean.Stock;
import com.example.demo.mapper.HouseMapper;
import com.example.demo.service.AuthorService;
import com.example.demo.mapper.AuthorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Map;

/**
* @author 24629
* @description 针对表【author】的数据库操作Service实现
* @createDate 2022-03-02 18:39:45
*/
@Service
public class AuthorServiceImpl extends ServiceImpl<AuthorMapper, Author>
    implements AuthorService{

    @Autowired
    AuthorMapper authorMapper;

    @Autowired
    HouseMapper houseMapper;

    @Override
    public Author searchAuthorById(int authorId) {
        return authorMapper.selectById(authorId);
    }

    /**
     * 查找用户的住址所在地
     *
     * @param authorId
     * @return
     */
    @Override
    public String searchAuthorCityById(int authorId) {
        return houseMapper.searchAuthorCityById(authorId);
    }

    /**
     * @param authorId
     * @return
     */
    @Override
    public List<Stock> searchAuthorStockById(int authorId) {
        return authorMapper.searchAuthorStockById(authorId);
    }

    /**
     * @param authorId
     * @return
     */
    @Override
    public AuthorInfo searchAuthorInfo(int authorId) {
        return authorMapper.searchAuthorInfo(authorId);
    }

    /**
     * @param authorId
     * @return
     */
    @Override
    public AuthorInfo searchAuthorIncome(int authorId) {
        return authorMapper.searchAuthorIncome(authorId);
    }

    /**
     * @param authorId
     * @return
     */
    @Override
    public AuthorInfo searchAuthorHouse(int authorId) {
        return authorMapper.searchAuthorHouse(authorId);
    }

}




