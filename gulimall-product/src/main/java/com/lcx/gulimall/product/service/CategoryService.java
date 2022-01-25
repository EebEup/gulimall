package com.lcx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lcx.common.utils.PageUtils;
import com.lcx.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author lcx
 * @email sunlightcs@gmail.com
 * @date 2022-01-25 20:08:19
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

