package com.gqz.item.api.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系
 *
 * @TableName tb_category
 */
@TableName(value = "tb_category")
@Data
public class Category implements Serializable {
    /**
     * 类目id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 类目名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 父类目id,顶级类目填0
     */
    @TableField(value = "parent_id")
    private Long parent_id;

    /**
     * 是否为父节点，0为否，1为是
     */
    @TableField(value = "is_parent")
    private Integer is_parent;

    /**
     * 排序指数，越小越靠前
     */
    @TableField(value = "sort")
    private Integer sort;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}