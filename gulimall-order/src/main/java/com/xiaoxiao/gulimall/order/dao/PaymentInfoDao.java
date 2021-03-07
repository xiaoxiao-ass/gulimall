package com.xiaoxiao.gulimall.order.dao;

import com.xiaoxiao.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author xiaoxiao
 * @email xiaoxiao@gmail.com
 * @date 2021-02-28 23:30:00
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
