package com.xiaoxiao.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoxiao.gulimall.common.utils.PageUtils;
import com.xiaoxiao.gulimall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author xiaoxiao
 * @email xiaoxiao@gmail.com
 * @date 2021-02-28 23:30:00
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

