package com.xiaoxiao.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoxiao.gulimall.common.utils.PageUtils;
import com.xiaoxiao.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author xiaoxiao
 * @email xiaoxiao@gmail.com
 * @date 2021-02-28 23:30:00
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

