package com.xiaoxiao.gulimall.product.dao;

import com.xiaoxiao.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xiaoxiao
 * @email xiaoxiao@gmail.com
 * @date 2021-02-28 17:18:20
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
