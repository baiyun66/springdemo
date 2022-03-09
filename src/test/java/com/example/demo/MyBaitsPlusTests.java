package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.bean.Author;
import com.example.demo.bean.StockPrice;
import com.example.demo.mapper.AuthorMapper;
import com.example.demo.service.AuthorService;
import com.example.demo.service.StockPriceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.security.PublicKey;
import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 24629
 * @Description
 * @create 2022-03-08 17:46
 */

@SpringBootTest
public class MyBaitsPlusTests {


    @Autowired
    private AuthorService authorService;

    @Autowired
    private StockPriceService stockPriceService;



    @Test
    public void saveTest1(){
//        authorMapper.
        Author author = new Author();
        author.setAge(20);
        author.setName("test1");
        authorService.save(author);
    }


    @Test
    public void saveOrUpdateTest1(){
        // 根据author 的 id 看是否的存在
        Author author = new Author();
        author.setAge(20);
        author.setId(5);
        author.setName("saveOrUpdateTest1");
        authorService.saveOrUpdate(author);
    }


    @Test
    public void saveOrUpdateTest2(){
        // 根据author 的 id 看是否的存在
        Author author = new Author();
        UpdateWrapper<Author> wrapper = new UpdateWrapper<>();
        wrapper.lt("age",100);
        author.setAge((int)(Math.random()*100));
        authorService.saveOrUpdate(author,wrapper);
    }

    @Test
    public void updateTest(){
        // 根据author 的 id 看是否的存在
        UpdateWrapper<Author> wrapper = new UpdateWrapper<>();
        wrapper.lt("age",100);
        wrapper.gt("id",3);
        wrapper.set(true,"age",(int)(Math.random()*100));
        authorService.update(wrapper);
    }

    @Test
    public void listTest(){
        // 根据author 的 id 看是否的存在
        QueryWrapper<Author> wrapper = new QueryWrapper<>();
        wrapper.lt("age",100);
        wrapper.gt("id",3);
        List<Map<String,Object>> authors = authorService.listMaps(wrapper);
        for (int i = 0; i < authors.size(); i++) {
            System.out.println(authors.get(i));
            System.out.println(authors.get(i));
        }
    }

    @Test
    public void pageTest(){
        QueryWrapper<StockPrice> wrapper = new QueryWrapper<>();
        wrapper.eq("stock_id_id","1");
        IPage<StockPrice> iPage = new Page<>(2,100);
        IPage<StockPrice> nPage =stockPriceService.page(iPage,wrapper);
        System.out.println(nPage.getRecords().size());
    }

    @Test
    public void ChainTest(){
        QueryWrapper<StockPrice> wrapper = new QueryWrapper<>();
        wrapper.eq("stock_id_id","1").lt("`close`",3);
        IPage<StockPrice> iPage = new Page<>(2,100);
        IPage<StockPrice> nPage =stockPriceService.page(iPage,wrapper);
        System.out.println(nPage.getRecords().size());
    }


    @Test
    public void DeleteBatchIds(){
        List<Integer> idList = new ArrayList<>();
        idList.add(5);
        idList.add(6);
        authorService.removeByIds(idList);
    }

















}
