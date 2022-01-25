package com.lcx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lcx.common.utils.PageUtils;
import com.lcx.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author lcx
 * @email sunlightcs@gmail.com
 * @date 2022-01-25 20:08:19
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

