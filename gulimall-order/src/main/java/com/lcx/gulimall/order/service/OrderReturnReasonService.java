package com.lcx.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lcx.common.utils.PageUtils;
import com.lcx.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * ้่ดงๅๅ 
 *
 * @author lcx
 * @email 2251727682@qq.com
 * @date 2022-01-26 13:26:53
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

