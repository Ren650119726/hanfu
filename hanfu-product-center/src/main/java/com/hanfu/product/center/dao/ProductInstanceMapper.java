package com.hanfu.product.center.dao;

import com.hanfu.product.center.model.ProductInstance;
import com.hanfu.product.center.model.ProductInstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductInstanceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_instance
     *
     * @mbg.generated Sat Feb 08 09:57:50 CST 2020
     */
    long countByExample(ProductInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_instance
     *
     * @mbg.generated Sat Feb 08 09:57:50 CST 2020
     */
    int deleteByExample(ProductInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_instance
     *
     * @mbg.generated Sat Feb 08 09:57:50 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_instance
     *
     * @mbg.generated Sat Feb 08 09:57:50 CST 2020
     */
    int insert(ProductInstance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_instance
     *
     * @mbg.generated Sat Feb 08 09:57:50 CST 2020
     */
    int insertSelective(ProductInstance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_instance
     *
     * @mbg.generated Sat Feb 08 09:57:50 CST 2020
     */
    List<ProductInstance> selectByExample(ProductInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_instance
     *
     * @mbg.generated Sat Feb 08 09:57:50 CST 2020
     */
    ProductInstance selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_instance
     *
     * @mbg.generated Sat Feb 08 09:57:50 CST 2020
     */
    int updateByExampleSelective(@Param("record") ProductInstance record, @Param("example") ProductInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_instance
     *
     * @mbg.generated Sat Feb 08 09:57:50 CST 2020
     */
    int updateByExample(@Param("record") ProductInstance record, @Param("example") ProductInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_instance
     *
     * @mbg.generated Sat Feb 08 09:57:50 CST 2020
     */
    int updateByPrimaryKeySelective(ProductInstance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_instance
     *
     * @mbg.generated Sat Feb 08 09:57:50 CST 2020
     */
    int updateByPrimaryKey(ProductInstance record);
}