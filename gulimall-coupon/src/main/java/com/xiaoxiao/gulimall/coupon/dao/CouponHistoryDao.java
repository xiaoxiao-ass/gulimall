package com.xiaoxiao.gulimall.coupon.dao;

import com.xiaoxiao.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author xiaoxiao
 * @email xiaoxiao@gmail.com
 * @date 2021-02-28 23:27:53
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
