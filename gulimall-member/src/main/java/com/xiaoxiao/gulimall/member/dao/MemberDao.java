package com.xiaoxiao.gulimall.member.dao;

import com.xiaoxiao.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xiaoxiao
 * @email xiaoxiao@gmail.com
 * @date 2021-02-28 23:31:47
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
