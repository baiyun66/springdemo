package com.example.demo.service;

import com.example.demo.bean.Stock;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 24629
* @description 针对表【stock_stocklist】的数据库操作Service
* @createDate 2022-02-28 22:08:21
*/
public interface StockService extends IService<Stock> {
    /**
     * @param stockId
     * @return
     */
    public Stock searchStock(String stockId);

//    /**
//     *
//     * @return
//     */
//    public Integer searchAllStock();

    /**
     * @param stock
     */
    public void addStock(Stock stock);

    /**
     *
     * @param stockId
     * @return
     */
    List<Stock> searchByCode(String stockId);


    /**
     *
     * @param StockId
     * @return
     */
    List<Float> searchAuthorStockCloseById(String StockId);


}
