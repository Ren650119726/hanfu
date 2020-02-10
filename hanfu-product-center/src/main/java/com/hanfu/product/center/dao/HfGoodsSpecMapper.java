package com.hanfu.product.center.dao;

import com.hanfu.product.center.model.HfGoodsSpec;
import com.hanfu.product.center.model.HfGoodsSpecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HfGoodsSpecMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_goods_spec
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    long countByExample(HfGoodsSpecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_goods_spec
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    int deleteByExample(HfGoodsSpecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_goods_spec
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_goods_spec
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    int insert(HfGoodsSpec record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_goods_spec
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    int insertSelective(HfGoodsSpec record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_goods_spec
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    List<HfGoodsSpec> selectByExample(HfGoodsSpecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_goods_spec
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    HfGoodsSpec selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_goods_spec
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    int updateByExampleSelective(@Param("record") HfGoodsSpec record, @Param("example") HfGoodsSpecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_goods_spec
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    int updateByExample(@Param("record") HfGoodsSpec record, @Param("example") HfGoodsSpecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_goods_spec
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    int updateByPrimaryKeySelective(HfGoodsSpec record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_goods_spec
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    int updateByPrimaryKey(HfGoodsSpec record);
}