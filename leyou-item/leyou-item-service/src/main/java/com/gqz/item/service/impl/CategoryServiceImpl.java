package com.gqz.item.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gqz.item.api.pojo.Category;
import com.gqz.item.mapper.CategoryMapper;
import com.gqz.item.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gqz20
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    @Override
    public List<Category> queryCategoriesByPid(Long pid) {
        List<Category> categoryList = this.list(Wrappers
                .lambdaQuery(Category.class)
                .select(field -> true)
                .eq(pid != null, Category::getParent_id, pid));
        return categoryList;
    }
}




