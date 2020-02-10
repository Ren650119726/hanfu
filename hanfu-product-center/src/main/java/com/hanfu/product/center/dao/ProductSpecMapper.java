package com.hanfu.product.center.dao;

import com.hanfu.product.center.model.ProductSpec;
import com.hanfu.product.center.model.ProductSpecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSpecMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_spec
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    long countByExample(ProductSpecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_spec
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    int deleteByExample(ProductSpecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_spec
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_spec
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    int insert(ProductSpec record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_spec
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    int insertSelective(ProductSpec record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_spec
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    List<ProductSpec> selectByExample(ProductSpecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_spec
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    ProductSpec selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_spec
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    int updateByExampleSelective(@Param("record") ProductSpec record, @Param("example") ProductSpecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_spec
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    int updateByExample(@Param("record") ProductSpec record, @Param("example") ProductSpecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_spec
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    int updateByPrimaryKeySelective(ProductSpec record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_spec
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    int updateByPrimaryKey(ProductSpec record);
}