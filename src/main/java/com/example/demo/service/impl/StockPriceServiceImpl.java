package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.bean.StockPrice;
import com.example.demo.mapper.StockMapper;
import com.example.demo.service.StockPriceService;
import com.example.demo.mapper.StockPriceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 24629
* @description 针对表【stock_stockdaydataadd】的数据库操作Service实现
* @createDate 2022-02-28 22:10:04
*/
@Service
public class StockPriceServiceImpl extends ServiceImpl<StockPriceMapper, StockPrice>
    implements StockPriceService{

    @Autowired
    StockPriceMapper stockPriceMapper;

    /**
     * @return
     */
    @Override
    public List<StockPrice> searchStockPriceByCode(String stockId) {
        return stockPriceMapper.searchStockPriceByCode(stockId);
    }
}




