package com.lcx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lcx.common.utils.PageUtils;
import com.lcx.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author lcx
 * @email sunlightcs@gmail.com
 * @date 2022-01-25 20:08:19
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

