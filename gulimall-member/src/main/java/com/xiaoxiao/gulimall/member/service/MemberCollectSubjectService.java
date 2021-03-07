package com.xiaoxiao.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoxiao.gulimall.common.utils.PageUtils;
import com.xiaoxiao.gulimall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author xiaoxiao
 * @email xiaoxiao@gmail.com
 * @date 2021-02-28 23:31:47
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

