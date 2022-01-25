package com.lcx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lcx.common.utils.PageUtils;
import com.lcx.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author lcx
 * @email sunlightcs@gmail.com
 * @date 2022-01-25 20:08:19
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

