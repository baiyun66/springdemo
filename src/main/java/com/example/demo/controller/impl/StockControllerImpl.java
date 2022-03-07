package com.example.demo.controller.impl;

import com.example.demo.bean.Stock;
import com.example.demo.service.impl.StockServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 24629
 * @Description
 * @create 2022-02-28 22:16
 */

@RestController
public class StockControllerImpl {

    @Autowired
    StockServiceImpl stockService;

    @GetMapping("/stock_count")
    public Integer searchAllStock() {
//        return stockService.searchAllStock();
        return stockService.count();
    }

    @GetMapping("/stock/{stock_id}")
    public Stock searchStock(@PathVariable("stock_id")  String stockId) {
        return stockService.searchStock(stockId);
    }

    @PostMapping("/stock/add-params")
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

    /**
     * 查询多只股票的信息
     *
     * @param stockId 股票信息
     * @return List<Map < String, String>>
     * @throws ParseException 参数错误
     */
    @GetMapping ("/stock/search_stocks/{stockId}")
    public List<Stock> searchByCode(@PathVariable("stockId") String stockId) throws ParseException {
        System.out.println(stockId);
        stockId+="_";
        System.out.println(stockId);
        return stockService.searchByCode(stockId);
    }

}
