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
     * @mbg.generated Wed Oct 23 07:58:46 CST 2019
     */
    long countByExample(hfPriceModeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Wed Oct 23 07:58:46 CST 2019
     */
    int deleteByExample(hfPriceModeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Wed Oct 23 07:58:46 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Wed Oct 23 07:58:46 CST 2019
     */
    int insert(hfPriceMode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Wed Oct 23 07:58:46 CST 2019
     */
    int insertSelective(hfPriceMode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Wed Oct 23 07:58:46 CST 2019
     */
    List<hfPriceMode> selectByExample(hfPriceModeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Wed Oct 23 07:58:46 CST 2019
     */
    hfPriceMode selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Wed Oct 23 07:58:46 CST 2019
     */
    int updateByExampleSelective(@Param("record") hfPriceMode record, @Param("example") hfPriceModeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Wed Oct 23 07:58:46 CST 2019
     */
    int updateByExample(@Param("record") hfPriceMode record, @Param("example") hfPriceModeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Wed Oct 23 07:58:46 CST 2019
     */
    int updateByPrimaryKeySelective(hfPriceMode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Wed Oct 23 07:58:46 CST 2019
     */
    int updateByPrimaryKey(hfPriceMode record);
}