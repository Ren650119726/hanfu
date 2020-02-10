package com.hanfu.product.center.dao;

import com.hanfu.product.center.model.HfPrice;
import com.hanfu.product.center.model.HfPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HfPriceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    long countByExample(HfPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    int deleteByExample(HfPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    int insert(HfPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    int insertSelective(HfPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    List<HfPrice> selectByExample(HfPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    HfPrice selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    int updateByExampleSelective(@Param("record") HfPrice record, @Param("example") HfPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    int updateByExample(@Param("record") HfPrice record, @Param("example") HfPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    int updateByPrimaryKeySelective(HfPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    int updateByPrimaryKey(HfPrice record);
}