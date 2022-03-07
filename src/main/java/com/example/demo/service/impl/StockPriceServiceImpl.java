package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.bean.StockPrice;
import com.example.demo.mapper.StockMapper;
import com.example.demo.service.StockPriceService;
import com.example.demo.mapper.StockPriceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;


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


    /**
     *
     * @param stockId
     * @return
     */
    @Override
    public List<StockPrice> searchStockPriceByCodeAndTime(String stockId, List<String> dates){
        return stockPriceMapper.searchStockPriceByCodeAndTime(stockId,dates);
    }

    /**
     * @param stockId
     * @return
     */
    @Override
    public Map<String, Object> addRandomStockPriceByCode(String stockId) {
        Map<String,Object> result = new HashMap<>();
        LocalDate localDate = LocalDate.now();

        try {
            List<StockPrice> stockPrices = new ArrayList<StockPrice>();
            StockPrice stockPrice ;
            for (int i = 0; i < 900; i++) {
                stockPrice = new StockPrice();
                stockPrice.setAmount(new BigDecimal("3333.00"));
                stockPrice.setVolume(new BigDecimal("44444.00"));

                stockPrice.setAngle1(new BigDecimal(String.valueOf((int)(Math.random()*180))));
                stockPrice.setAngle3(new BigDecimal(String.valueOf((int)(Math.random()*180))));
                stockPrice.setAngle5(new BigDecimal(String.valueOf((int)(Math.random()*180))));
                stockPrice.setAngle7(new BigDecimal(String.valueOf((int)(Math.random()*180))));
                stockPrice.setAngle10(new BigDecimal(String.valueOf((int)(Math.random()*180))));
                stockPrice.setAngle14(new BigDecimal(String.valueOf((int)(Math.random()*180))));
                stockPrice.setAngle20(new BigDecimal(String.valueOf((int)(Math.random()*180))));
                stockPrice.setAngle21(new BigDecimal(String.valueOf((int)(Math.random()*180))));


                stockPrice.setData1(new BigDecimal(String.valueOf((int)(Math.random()*20))));
                stockPrice.setData3(new BigDecimal(String.valueOf((int)(Math.random()*20))));
                stockPrice.setData5(new BigDecimal(String.valueOf((int)(Math.random()*20))));
                stockPrice.setData7(new BigDecimal(String.valueOf((int)(Math.random()*20))));
                stockPrice.setData10(new BigDecimal(String.valueOf((int)(Math.random()*20))));
                stockPrice.setData14(new BigDecimal(String.valueOf((int)(Math.random()*20))));
                stockPrice.setData20(new BigDecimal(String.valueOf((int)(Math.random()*20))));
                stockPrice.setData21(new BigDecimal(String.valueOf((int)(Math.random()*20))));


                stockPrice.setAvg1210(new BigDecimal(String.valueOf((int)(Math.random()*20))));
                stockPrice.setAvg2420(new BigDecimal(String.valueOf((int)(Math.random()*20))));
                stockPrice.setAvg4840(new BigDecimal(String.valueOf((int)(Math.random()*20))));


                stockPrice.setClose(new BigDecimal(String.valueOf((int)(Math.random()*20))));
                stockPrice.setHigh(new BigDecimal(String.valueOf((int)(Math.random()*20))));
                stockPrice.setLow(new BigDecimal(String.valueOf((int)(Math.random()*20))));
                stockPrice.setOpen(new BigDecimal(String.valueOf((int)(Math.random()*20))));
                stockPrice.setStockIdId(stockId);

                stockPrice.setTime(java.sql.Date.valueOf(localDate.minusDays(i)));

                stockPrices.add(stockPrice);
            }

//           ( 2,'2018-03-07 22:02:02.000000', 5.000, 6.000, 5.000, 8.000, 3333.00, 44444.00, 10.000, 12.000,
//           10.000, 12.000, 20.000, 20.000, 12.000, 2.000, 5.000, 6.000, 7.000, 8.000, 9.000, 0.000, 10.000,
//           4.000, 5.000, 6.000, '1', 4.000);
            stockPriceMapper.addRandomStockPriceByCode(stockPrices);
            result.put("status",1);
            result.put("mag","插入成功");
        }catch (Exception e){
            System.out.println(e);
            result.put("status",0);
            result.put("mag","插入失败");
        }
        return result;
    }
}




