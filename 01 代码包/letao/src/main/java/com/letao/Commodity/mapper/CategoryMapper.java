package com.letao.Commodity.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.letao.Commodity.entity.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 菜品及套餐分类 Mapper 接口
 * </p>
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}
