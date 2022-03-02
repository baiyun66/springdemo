package com.example.demo.service;

import com.example.demo.bean.Author;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.bean.AuthorInfo;
import com.example.demo.bean.Stock;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
* @author 24629
* @description 针对表【author】的数据库操作Service
* @createDate 2022-03-02 18:39:45
*/
@Service
public interface AuthorService extends IService<Author> {

    /**
     *
     * @param authorId
     * @return
     */
    public Author searchAuthorById(int authorId);

    /**
     * 查找用户的住址所在地
     * @param authorId
     * @return
     */
    public String searchAuthorCityById(int authorId);

    /**
     *
     * @param authorId
     * @return
     */
    public List<Stock> searchAuthorStockById(int authorId);

    /**
     *
     * @param authorId
     * @return
     */
    AuthorInfo searchAuthorInfo(int authorId);

    /**
     *
     * @param authorId
     * @return
     */
    AuthorInfo searchAuthorIncome(int authorId);

    /**
     *
     * @param authorId
     * @return
     */
    AuthorInfo searchAuthorHouse(int authorId);
}
