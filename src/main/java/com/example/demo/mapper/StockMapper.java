package com.example.demo.mapper;

import com.example.demo.bean.Stock;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
* @author 24629
* @description 针对表【stock_stocklist】的数据库操作Mapper
* @createDate 2022-02-28 22:08:21
* @Entity com.example.demo.bean.Stock
*/

@Mapper
public interface StockMapper extends BaseMapper<Stock> {

    /**
     * 查看所有的股票的数目
     * @return Integer
     */

//    @Select("select count(*) from stock_stocklist")
//    public Integer searchAllStock();

    /**
     * 查看的股票的信息
     * @param stockId 股票id
     * @return Stock
     */
    public Stock searchStock(String stockId);

    /**
     * 插入的股票的信息
     * @param stock 插入的值
     */
    public void addStock(Stock stock);

    /**
     * 查询多只股票的信息
     * @param stockId 股票信息
     * @return List<Map<String,String>>
     */
    public List<Stock> searchByCode(String stockId);

}




