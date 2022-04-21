package com.gqz.item.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gqz.commons.PageResult;
import com.gqz.item.api.pojo.Brand;

import java.util.List;

/**
 * @author gqz20
 */
public interface BrandService extends IService<Brand> {

    /**
     * Query brands by page.
     *
     * @param key    the key
     * @param page   the page
     * @param rows   the rows
     * @param sortBy the sort by
     * @param desc   the desc
     * @return the page result
     */
    PageResult<Brand> queryBrandsByPage(String key, Integer page, Integer rows, String sortBy, Boolean desc);

    /**
     * Save brand.
     *
     * @param brand the brand
     * @param cids  the cids
     */
    void saveBrand(Brand brand, List<Long> cids);
}
