package com.hanfu.order.center.dao;

import com.hanfu.order.center.model.HfOrdersDetail;
import com.hanfu.order.center.model.HfOrdersDetailExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface HfOrdersDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_orders_detail
     *
     * @mbg.generated Wed Oct 30 06:29:10 CST 2019
     */
    long countByExample(HfOrdersDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_orders_detail
     *
     * @mbg.generated Wed Oct 30 06:29:10 CST 2019
     */
    int deleteByExample(HfOrdersDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_orders_detail
     *
     * @mbg.generated Wed Oct 30 06:29:10 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_orders_detail
     *
     * @mbg.generated Wed Oct 30 06:29:10 CST 2019
     */
    int insert(HfOrdersDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_orders_detail
     *
     * @mbg.generated Wed Oct 30 06:29:10 CST 2019
     */
    int insertSelective(HfOrdersDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_orders_detail
     *
     * @mbg.generated Wed Oct 30 06:29:10 CST 2019
     */
    List<HfOrdersDetail> selectByExample(HfOrdersDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_orders_detail
     *
     * @mbg.generated Wed Oct 30 06:29:10 CST 2019
     */
    HfOrdersDetail selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_orders_detail
     *
     * @mbg.generated Wed Oct 30 06:29:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") HfOrdersDetail record, @Param("example") HfOrdersDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_orders_detail
     *
     * @mbg.generated Wed Oct 30 06:29:10 CST 2019
     */
    int updateByExample(@Param("record") HfOrdersDetail record, @Param("example") HfOrdersDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_orders_detail
     *
     * @mbg.generated Wed Oct 30 06:29:10 CST 2019
     */
    int updateByPrimaryKeySelective(HfOrdersDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_orders_detail
     *
     * @mbg.generated Wed Oct 30 06:29:10 CST 2019
     */
    int updateByPrimaryKey(HfOrdersDetail record);
}