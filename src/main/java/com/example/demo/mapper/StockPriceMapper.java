package com.example.demo.mapper;

import com.example.demo.bean.StockPrice;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

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

    /**
     *
     * @param stockId
     * @return
     */
    public List<StockPrice> searchStockPriceByCodeAndTime(@Param("stockId") String stockId,@Param("dates") List<String> dates);

    /**
     *
     * @param stockPrices
     */
    void addRandomStockPriceByCode(List<StockPrice> stockPrices);
}




