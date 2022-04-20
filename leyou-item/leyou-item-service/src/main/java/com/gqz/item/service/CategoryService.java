package com.gqz.item.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gqz.item.api.pojo.Category;

import java.util.List;

/**
 * @author gqz20
 */
public interface CategoryService extends IService<Category> {

    /**
     * Query categories by pid.
     *
     * @param pid the pid
     * @return the list
     */
    List<Category> queryCategoriesByPid(Long pid);
}
