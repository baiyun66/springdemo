package com.example.demo.controller.impl;

import com.example.demo.bean.StockPrice;
import com.example.demo.service.impl.StockPriceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author 24629
 * @Description
 * @create 2022-03-01 20:18
 */
@RestController
public class StockPriceControllerImpl {

    @Autowired
    StockPriceServiceImpl stockPriceService;


    /**
     * @param stockId
     * @return
     */
    @GetMapping("/stock_price/{stock_id}")
    public List<StockPrice> searchStockPriceByCode(@PathVariable("stock_id") String stockId) {
        return stockPriceService.searchStockPriceByCode(stockId);
    }


    /**
     * @param stockId
     * @return
     */
    @GetMapping("/stock_price/{stock_id}/addRandom")
    public Map<String,Object> addRandomStockPriceByCode(@PathVariable("stock_id") String stockId) {
        return stockPriceService.addRandomStockPriceByCode(stockId);
    }

}
