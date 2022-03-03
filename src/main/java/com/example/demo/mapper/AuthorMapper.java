package com.example.demo.mapper;

import com.example.demo.bean.Author;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.bean.AuthorInfo;
import com.example.demo.bean.House;
import com.example.demo.bean.Stock;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
* @author 24629
* @description 针对表【author】的数据库操作Mapper
* @createDate 2022-03-02 18:39:45
* @Entity com.example.demo.bean.Author
*/
@Mapper
public interface AuthorMapper extends BaseMapper<Author> {

    /**
     * searchAuthorStockById
     * @param authorId
     * @return
     */
    List<Stock> searchAuthorStockById(int authorId);

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

    AuthorInfo searchAuthorIncomeTest(int authorId);

    AuthorInfo searchAuthorHouse(int authorId);

//    /**
//     *
//     * @param authorId
//     * @return
//     */
//    House selectHouse( @Param("authorId") int authorId);
}




