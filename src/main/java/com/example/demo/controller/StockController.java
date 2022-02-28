package com.example.demo.controller;

import com.example.demo.bean.Stock;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * @author 24629
 * @Description
 * @create 2022-02-28 22:17
 */
@RestController
public interface StockController {
    /**
     * 查看所有的股票的数目
     * @return Integer
     */
    Integer searchAllStock();

    /**
     * 查看一只股票的信息
     * @param stockId 股票id
     * @return Stock
     */
    Stock searchStock(String stockId);


    /**
     * 插入一只股票的信息
     * @param stockId 股票 id
     * @param beginTime 开始的时间
     * @param lastTime 结束的时间
     * @return Map
     * @throws ParseException 参数错误
     */
    Map<String,String> addStock(String stockId, String beginTime , String lastTime) throws ParseException;


    /**
     * 插入一只股票的信息
     * @param stockString 股票信息
     * @return Map
     * @throws ParseException 参数错误
     */
    Map<String,String>  addStock(@RequestBody Map<String,Object> stockString) throws ParseException;


    /**
     * 查询多只股票的信息
     * @param stockId 股票信息
     * @return List<Map<String,String>>
     * @throws ParseException 参数错误
     */
    List<Stock>  searchByCode(String stockId) throws ParseException;

}
