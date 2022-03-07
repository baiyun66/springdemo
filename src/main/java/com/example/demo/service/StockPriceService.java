package com.example.demo.service;

import com.example.demo.bean.StockPrice;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
* @author 24629
* @description 针对表【stock_stockdaydataadd】的数据库操作Service
* @createDate 2022-02-28 22:10:04
*/
public interface StockPriceService extends IService<StockPrice> {

    /**
     *
     * @return
     */
    public List<StockPrice> searchStockPriceByCode(String stockId);


    /**
     *
     * @param stockId
     * @return
     */
    public List<StockPrice> searchStockPriceByCodeAndTime(String stockId, List<String> dates);

    /**
     *
     * @param stockId
     * @return
     */
    Map<String, Object> addRandomStockPriceByCode(String stockId);
}
