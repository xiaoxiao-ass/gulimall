package com.xiaoxiao.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoxiao.gulimall.common.utils.PageUtils;
import com.xiaoxiao.gulimall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author xiaoxiao
 * @email xiaoxiao@gmail.com
 * @date 2021-02-28 23:33:24
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

