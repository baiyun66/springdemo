package com.example.demo.controller.impl;

import com.example.demo.bean.Author;
import com.example.demo.bean.AuthorInfo;
import com.example.demo.bean.Stock;
import com.example.demo.service.impl.AuthorServiceImpl;
import com.example.demo.service.impl.HouseServiceImpl;
import com.example.demo.service.impl.StockServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Map;

/**
 * @author 24629
 * @Description
 * @create 2022-03-02 19:03
 */
@RestController
public class SelectControllerImpl{

    @Autowired
    AuthorServiceImpl authorService;

    @Autowired
    HouseServiceImpl houseService;

    @Autowired
    StockServiceImpl stockService;


    /**
     *
     * @param authorId
     * @return Author
     */
    
    @GetMapping("/author/{author_id}")
    public Author searchAuthorById(@PathVariable("author_id") int authorId) {
        return authorService.searchAuthorById(authorId);

    }

    /**
     * 根据id查询author的住址
     *
     * @param authorId
     * @return
     */
    
    @GetMapping("/author/{author_id}/house/city")
    public String searchAuthorCityById(@PathVariable("author_id") int authorId) {

        return authorService.searchAuthorCityById(authorId);
    }

    /**
     * 根据id查询author的股票信息
     * @param authorId
     * @return
     */
    
    @GetMapping("/author/{author_id}/stock")
    public List<Stock> searchAuthorStockById(@PathVariable("author_id") int authorId) {
        return authorService.searchAuthorStockById(authorId);
    }

    /**
     * 根据id查询author的股票信息的收盘价
     *
     * @param stockId
     * @return
     */
    
    @GetMapping("/stock/{Stock_id}/close")
    public List<Float> searchAuthorStockCloseById(@PathVariable("Stock_id") String stockId) {

        return stockService.searchAuthorStockCloseById(stockId);
    }

    /**
     * 根据id查询author的信息
     *
     * @param authorId
     * @return
     */
    
    @GetMapping("/author/{author_id}/allInfo")
    public AuthorInfo searchAuthorInfo(@PathVariable("author_id") int authorId) {
        return authorService.searchAuthorInfo(authorId);
    }

    /**
     * 根据id查询author的信息
     *
     * @param authorId
     * @return
     */
    
    public AuthorInfo searchAuthorIncome(int authorId) {
        return authorService.searchAuthorIncome(authorId);
    }

    /**
     * 根据id查询author的信息
     *
     * @param authorId
     * @return
     */
    @GetMapping("/author/{author_id}/house")
    public AuthorInfo searchAuthorHouse(@PathVariable("author_id") int authorId) {
        return authorService.searchAuthorHouse(authorId);
    }


}
