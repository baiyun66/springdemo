package com.example.demo.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

/**
 * @author 24629
 * @Description
 * @create 2022-03-03 20:16
 */
@Data
@TableName(value ="stock_stocklist")
public class StockAuthor extends Stock{

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    private List<Author> authors;

}
