package com.hanfu.product.center.dao;

import com.hanfu.product.center.model.HfGoodsSpec;
import com.hanfu.product.center.model.GoodsSpecExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GoodsSpecMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_goods_spec
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    long countByExample(GoodsSpecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_goods_spec
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    int deleteByExample(GoodsSpecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_goods_spec
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_goods_spec
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    int insert(HfGoodsSpec record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_goods_spec
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    int insertSelective(HfGoodsSpec record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_goods_spec
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    List<HfGoodsSpec> selectByExample(GoodsSpecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_goods_spec
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    HfGoodsSpec selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_goods_spec
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    int updateByExampleSelective(@Param("record") HfGoodsSpec record, @Param("example") GoodsSpecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_goods_spec
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    int updateByExample(@Param("record") HfGoodsSpec record, @Param("example") GoodsSpecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_goods_spec
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    int updateByPrimaryKeySelective(HfGoodsSpec record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_goods_spec
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    int updateByPrimaryKey(HfGoodsSpec record);
}