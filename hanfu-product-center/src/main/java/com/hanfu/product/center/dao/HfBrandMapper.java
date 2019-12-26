package com.hanfu.product.center.dao;

import com.hanfu.product.center.model.HfBrand;
import com.hanfu.product.center.model.HfBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HfBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_brand
     *
     * @mbg.generated Wed Oct 23 07:58:46 CST 2019
     */
    long countByExample(HfBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_brand
     *
     * @mbg.generated Wed Oct 23 07:58:46 CST 2019
     */
    int deleteByExample(HfBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_brand
     *
     * @mbg.generated Wed Oct 23 07:58:46 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_brand
     *
     * @mbg.generated Wed Oct 23 07:58:46 CST 2019
     */
    int insert(HfBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_brand
     *
     * @mbg.generated Wed Oct 23 07:58:46 CST 2019
     */
    int insertSelective(HfBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_brand
     *
     * @mbg.generated Wed Oct 23 07:58:46 CST 2019
     */
    List<HfBrand> selectByExample(HfBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_brand
     *
     * @mbg.generated Wed Oct 23 07:58:46 CST 2019
     */
    HfBrand selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_brand
     *
     * @mbg.generated Wed Oct 23 07:58:46 CST 2019
     */
    int updateByExampleSelective(@Param("record") HfBrand record, @Param("example") HfBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_brand
     *
     * @mbg.generated Wed Oct 23 07:58:46 CST 2019
     */
    int updateByExample(@Param("record") HfBrand record, @Param("example") HfBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_brand
     *
     * @mbg.generated Wed Oct 23 07:58:46 CST 2019
     */
    int updateByPrimaryKeySelective(HfBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_brand
     *
     * @mbg.generated Wed Oct 23 07:58:46 CST 2019
     */
    int updateByPrimaryKey(HfBrand record);
}