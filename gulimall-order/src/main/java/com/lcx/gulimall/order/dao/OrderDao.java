package com.lcx.gulimall.order.dao;

import com.lcx.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lcx
 * @email 2251727682@qq.com
 * @date 2022-01-26 13:26:53
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
