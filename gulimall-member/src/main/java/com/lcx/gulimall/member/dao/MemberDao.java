package com.lcx.gulimall.member.dao;

import com.lcx.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lcx
 * @email 2251727682@qq.com
 * @date 2022-01-26 13:09:53
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
