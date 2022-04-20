package com.gqz.item.api.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 品牌表，一个品牌下有多个商品（spu），一对多关系
 *
 * @author gqz20
 * @TableName tb_brand
 */
@TableName(value = "tb_brand")
@Data
public class Brand implements Serializable {
    /**
     * 品牌id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 品牌名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 品牌图片地址
     */
    @TableField(value = "image")
    private String image;

    /**
     * 品牌的首字母
     */
    @TableField(value = "letter")
    private String letter;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}