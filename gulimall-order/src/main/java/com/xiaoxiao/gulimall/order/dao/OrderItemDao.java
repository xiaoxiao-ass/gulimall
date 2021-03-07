package com.xiaoxiao.gulimall.order.dao;

import com.xiaoxiao.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author xiaoxiao
 * @email xiaoxiao@gmail.com
 * @date 2021-02-28 23:30:00
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
