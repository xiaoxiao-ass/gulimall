package com.xiaoxiao.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoxiao.gulimall.common.utils.PageUtils;
import com.xiaoxiao.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author xiaoxiao
 * @email xiaoxiao@gmail.com
 * @date 2021-02-28 21:04:07
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

