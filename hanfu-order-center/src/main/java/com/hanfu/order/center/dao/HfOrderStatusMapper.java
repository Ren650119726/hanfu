package com.hanfu.order.center.dao;

import com.hanfu.order.center.model.HfOrderStatus;
import com.hanfu.order.center.model.HfOrderStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HfOrderStatusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_status
     *
     * @mbg.generated Wed Oct 30 06:29:10 CST 2019
     */
    long countByExample(HfOrderStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_status
     *
     * @mbg.generated Wed Oct 30 06:29:10 CST 2019
     */
    int deleteByExample(HfOrderStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_status
     *
     * @mbg.generated Wed Oct 30 06:29:10 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_status
     *
     * @mbg.generated Wed Oct 30 06:29:10 CST 2019
     */
    int insert(HfOrderStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_status
     *
     * @mbg.generated Wed Oct 30 06:29:10 CST 2019
     */
    int insertSelective(HfOrderStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_status
     *
     * @mbg.generated Wed Oct 30 06:29:10 CST 2019
     */
    List<HfOrderStatus> selectByExample(HfOrderStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_status
     *
     * @mbg.generated Wed Oct 30 06:29:10 CST 2019
     */
    HfOrderStatus selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_status
     *
     * @mbg.generated Wed Oct 30 06:29:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") HfOrderStatus record, @Param("example") HfOrderStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_status
     *
     * @mbg.generated Wed Oct 30 06:29:10 CST 2019
     */
    int updateByExample(@Param("record") HfOrderStatus record, @Param("example") HfOrderStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_status
     *
     * @mbg.generated Wed Oct 30 06:29:10 CST 2019
     */
    int updateByPrimaryKeySelective(HfOrderStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_status
     *
     * @mbg.generated Wed Oct 30 06:29:10 CST 2019
     */
    int updateByPrimaryKey(HfOrderStatus record);
}