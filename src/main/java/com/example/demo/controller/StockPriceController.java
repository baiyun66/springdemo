package com.example.demo.controller;

import com.example.demo.bean.StockPrice;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author 24629
 * @Description
 * @create 2022-03-01 20:16
 */
@RestController
public interface StockPriceController {

    /**
     *
     * @param stockId
     * @return
     */
    public List<StockPrice> searchStockPriceByCode(String stockId);


}
