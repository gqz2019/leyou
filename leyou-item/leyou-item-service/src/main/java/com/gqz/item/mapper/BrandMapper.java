package com.gqz.item.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gqz.item.api.pojo.Brand;
import org.apache.ibatis.annotations.Param;

/**
 * @author gqz20
 * @Entity com.gqz.item.api.pojo.Brand
 */
public interface BrandMapper extends BaseMapper<Brand> {

    /**
     * Update association table(category_brand).
     *
     * @param cid the cid
     * @param bid the bid
     */
    void updateAssociationTable(@Param("cid") Long cid, @Param("bid") Long bid);
}




