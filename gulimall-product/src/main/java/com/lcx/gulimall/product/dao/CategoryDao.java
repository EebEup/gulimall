package com.lcx.gulimall.product.dao;

import com.lcx.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lcx
 * @email sunlightcs@gmail.com
 * @date 2022-01-25 20:08:19
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
