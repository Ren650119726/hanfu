package com.hanfu.product.center.dao;

import com.hanfu.product.center.model.hfPriceMode;
import com.hanfu.product.center.model.hfPriceModeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface hfPriceModeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Sat Feb 08 09:57:50 CST 2020
     */
    long countByExample(hfPriceModeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Sat Feb 08 09:57:50 CST 2020
     */
    int deleteByExample(hfPriceModeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Sat Feb 08 09:57:50 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Sat Feb 08 09:57:50 CST 2020
     */
    int insert(hfPriceMode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Sat Feb 08 09:57:50 CST 2020
     */
    int insertSelective(hfPriceMode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Sat Feb 08 09:57:50 CST 2020
     */
    List<hfPriceMode> selectByExample(hfPriceModeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Sat Feb 08 09:57:50 CST 2020
     */
    hfPriceMode selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Sat Feb 08 09:57:50 CST 2020
     */
    int updateByExampleSelective(@Param("record") hfPriceMode record, @Param("example") hfPriceModeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Sat Feb 08 09:57:50 CST 2020
     */
    int updateByExample(@Param("record") hfPriceMode record, @Param("example") hfPriceModeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Sat Feb 08 09:57:50 CST 2020
     */
    int updateByPrimaryKeySelective(hfPriceMode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Sat Feb 08 09:57:50 CST 2020
     */
    int updateByPrimaryKey(hfPriceMode record);
}