package com.example.demo.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

/**
 * @author 24629
 * @Description
 * @create 2022-03-02 20:39
 */

@TableName(value ="author")
@Data
public class AuthorInfo extends Author{
    private House house;
    private List<Stock> stocks;


    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }
}
