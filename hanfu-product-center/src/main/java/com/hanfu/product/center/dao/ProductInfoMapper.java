package com.hanfu.product.center.dao;

import com.hanfu.product.center.model.ProductInfo;
import com.hanfu.product.center.model.ProductInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Sat Oct 19 15:49:41 CST 2019
     */
    long countByExample(ProductInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Sat Oct 19 15:49:41 CST 2019
     */
    int deleteByExample(ProductInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Sat Oct 19 15:49:41 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Sat Oct 19 15:49:41 CST 2019
     */
    int insert(ProductInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Sat Oct 19 15:49:41 CST 2019
     */
    int insertSelective(ProductInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Sat Oct 19 15:49:41 CST 2019
     */
    List<ProductInfo> selectByExample(ProductInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Sat Oct 19 15:49:41 CST 2019
     */
    ProductInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Sat Oct 19 15:49:41 CST 2019
     */
    int updateByExampleSelective(@Param("record") ProductInfo record, @Param("example") ProductInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Sat Oct 19 15:49:41 CST 2019
     */
    int updateByExample(@Param("record") ProductInfo record, @Param("example") ProductInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Sat Oct 19 15:49:41 CST 2019
     */
    int updateByPrimaryKeySelective(ProductInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Sat Oct 19 15:49:41 CST 2019
     */
    int updateByPrimaryKey(ProductInfo record);
}