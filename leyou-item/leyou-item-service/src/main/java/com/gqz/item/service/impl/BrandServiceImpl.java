package com.gqz.item.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gqz.commons.PageResult;
import com.gqz.item.api.pojo.Brand;
import com.gqz.item.mapper.BrandMapper;
import com.gqz.item.service.BrandService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author gqz20
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {
    @Override
    public PageResult<Brand> queryBrandsByPage(String key, Integer page, Integer rows, String sortBy, Boolean desc) {
        boolean b = desc == null || desc;
        QueryWrapper<Brand> wrapper = Wrappers
                .query(new Brand())
                .like(StringUtils.isNotEmpty(key), "name", key)
                .or()
                .like(StringUtils.isNotEmpty(key), "letter", key)
                .orderBy(StringUtils.isNotEmpty(sortBy), !b, sortBy);
        Page<Brand> pages = this.page(new Page<>(page, rows), wrapper);

        PageResult<Brand> pageResult = new PageResult<Brand>()
                .setTotal(pages.getTotal())
                .setRows(pages.getRecords());
        return pageResult;
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void saveBrand(Brand brand, List<Long> cids) {
        boolean saved = this.save(brand);
        cids.forEach(cid -> {
            getBaseMapper().updateAssociationTable(cid, brand.getId());
        });
    }
}




