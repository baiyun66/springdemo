package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.bean.Stock;
import com.example.demo.service.StockService;
import com.example.demo.mapper.StockMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 24629
* @description 针对表【stock_stocklist】的数据库操作Service实现
* @createDate 2022-02-28 22:08:21
*/
@Service
public class StockServiceImpl extends ServiceImpl<StockMapper, Stock>
    implements StockService{

    @Autowired
    StockMapper stockMapper;


    /**
     * @param stockId
     * @return
     */
    @Override
    public Stock searchStock(String stockId) {
        return stockMapper.searchStock(stockId);
    }

    /**
     * @param stock
     */
    @Override
    public void addStock(Stock stock) {
        stockMapper.addStock(stock);
    }

    /**
     * @param stockId
     * @return
     */
    @Override
    public List<Stock> searchByCode(String stockId) {
        return stockMapper.searchByCode(stockId);
    }

    /**
     * @param StockId
     * @return
     */
    @Override
    public List<Float> searchAuthorStockCloseById(String StockId) {
        return stockMapper.searchAuthorStockCloseById(StockId);
    }
}




