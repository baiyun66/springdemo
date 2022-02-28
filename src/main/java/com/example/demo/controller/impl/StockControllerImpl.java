package com.example.demo.controller.impl;

import com.example.demo.bean.Stock;
import com.example.demo.controller.StockController;
import com.example.demo.service.impl.StockServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 24629
 * @Description
 * @create 2022-02-28 22:16
 */

@RestController
public class StockControllerImpl implements StockController {

    @Autowired
    StockServiceImpl stockService;

    @GetMapping("/stock_count")
    @Override
    public Integer searchAllStock() {
//        return stockService.searchAllStock();
        return stockService.count();
    }

    @GetMapping("/stock/{stock_id}")
    @Override
    public Stock searchStock(@PathVariable("stock_id")  String stockId) {
        return stockService.searchStock(stockId);
    }

    @PostMapping("/stock/add-params")
    @Override
    public Map<String,String> addStock(@RequestParam("stockId") String stockId,
                                       @RequestParam("beginTime") String beginTime ,
                                       @RequestParam("lastTime") String lastTime) throws ParseException {
        System.out.println(beginTime);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //格式化
        Stock stock = new Stock();
        stock.setStockId(stockId);
        stock.setBeginTime((Date)sdf1.parse(beginTime));
        stock.setLastTime((Date)sdf1.parse(lastTime));

        Map<String,String> map = new HashMap<>(5);
        try {
            stockService.addStock(stock);
            map.put("msg","inert success!");
        }catch (Exception e){
            map.put("msg","inert error!");
        }
        return map;
    }


    @PostMapping("/stock/add-Json")
    @Override
    public Map<String,String>  addStock(@RequestBody Map<String,Object> stockString) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //格式化
        Stock stock = new Stock();
        stock.setStockId((String) stockString.get("stockId"));
        stock.setBeginTime((Date)sdf1.parse((String) stockString.get("beginTime")));
        stock.setLastTime((Date)sdf1.parse((String) stockString.get("lastTime")));

        Map<String,String> map = new HashMap<>(5);
        map.put("msg","inert success!");
        try {
            stockService.addStock(stock);
            map.put("msg","inert success!");
        }catch (Exception e){
            map.put("msg","inert error!");
        }
        return map;
    }

}