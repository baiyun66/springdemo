package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.bean.Author;
import com.example.demo.bean.AuthorInfo;
import com.example.demo.bean.Stock;
import com.example.demo.bean.StockPrice;
import com.example.demo.mapper.HouseMapper;
import com.example.demo.mapper.StockMapper;
import com.example.demo.mapper.StockPriceMapper;
import com.example.demo.service.AuthorService;
import com.example.demo.mapper.AuthorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.websocket.server.PathParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
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

    @Autowired
    StockPriceMapper stockPriceMapper;


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
//    @Override
//    public Map<String,Object> searchAuthorIncome(int authorId) {
//        Map<String,Object> stringObjectMap = new HashMap<>();
//
//        AuthorInfo authorInfo= authorMapper.searchAuthorIncome(authorId);
//        stringObjectMap.put("name",authorInfo.getName());
//
//        Map<String,List<BigDecimal>> incomeMap = new HashMap<>();
////        stringObjectMap.put("stock_list",authorInfo.getStocks());
//        String beginTime = "2019-12-31";
//        String endTime ="2021-12-31";
//
//        List<String> dates = new ArrayList<>();
//        dates.add(beginTime);
//        dates.add(endTime);
//
//        for (Stock stock:authorInfo.getStocks()) {
//           List<StockPrice> stockPrices =  stockPriceMapper.searchStockPriceByCodeAndTime(stock.getStockId(),dates);
//            System.out.println(stockPrices.get(0));
//            List<BigDecimal> incomeList = new ArrayList<>(2);
//           incomeList.add(stockPrices.get(0).getClose());
//           incomeList.add(stockPrices.get(1).getClose());
//           incomeMap.put(stock.getStockId(),incomeList);
//        }
//        stringObjectMap.put("income",incomeMap);
//        return stringObjectMap;
//    }

    @Override
    public Map<String,Object> searchAuthorIncome(int authorId) {
        Map<String,Object> stringObjectMap = new HashMap<>();
        AuthorInfo authorInfo= authorMapper.searchAuthorIncomeTest(authorId);
        System.out.println(authorInfo.getStocks().get(1).getPrices());
        stringObjectMap.put("income",authorInfo);
        return stringObjectMap;
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




