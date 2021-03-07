package com.xiaoxiao.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiaoxiao.gulimall.product.entity.BrandEntity;
import com.xiaoxiao.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {/*
       BrandEntity brandEntity=new BrandEntity();
       brandEntity.setName("apple");
        brandService.save(brandEntity);*/

        List<BrandEntity> list=brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1));
        list.stream().forEach(item->{
            System.out.println(item);
        });
    }

}
