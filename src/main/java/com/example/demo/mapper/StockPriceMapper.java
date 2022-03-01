package com.example.demo.mapper;

import com.example.demo.bean.StockPrice;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author 24629
* @description 针对表【stock_stockdaydataadd】的数据库操作Mapper
* @createDate 2022-02-28 22:10:04
* @Entity com.example.demo.bean.StockPrice
*/

@Mapper
public interface StockPriceMapper extends BaseMapper<StockPrice> {

    /**
     *
     * @param stockId
     * @return
     */
    public List<StockPrice> searchStockPriceByCode(String stockId);

}




