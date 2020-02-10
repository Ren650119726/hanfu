package com.hanfu.order.center.dao;

import com.hanfu.order.center.model.HfOrderGroupDetail;
import com.hanfu.order.center.model.HfOrderGroupDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HfOrderGroupDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_group_detail
     *
     * @mbg.generated Mon Feb 10 21:11:05 CST 2020
     */
    long countByExample(HfOrderGroupDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_group_detail
     *
     * @mbg.generated Mon Feb 10 21:11:05 CST 2020
     */
    int deleteByExample(HfOrderGroupDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_group_detail
     *
     * @mbg.generated Mon Feb 10 21:11:05 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_group_detail
     *
     * @mbg.generated Mon Feb 10 21:11:05 CST 2020
     */
    int insert(HfOrderGroupDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_group_detail
     *
     * @mbg.generated Mon Feb 10 21:11:05 CST 2020
     */
    int insertSelective(HfOrderGroupDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_group_detail
     *
     * @mbg.generated Mon Feb 10 21:11:05 CST 2020
     */
    List<HfOrderGroupDetail> selectByExample(HfOrderGroupDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_group_detail
     *
     * @mbg.generated Mon Feb 10 21:11:05 CST 2020
     */
    HfOrderGroupDetail selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_group_detail
     *
     * @mbg.generated Mon Feb 10 21:11:05 CST 2020
     */
    int updateByExampleSelective(@Param("record") HfOrderGroupDetail record, @Param("example") HfOrderGroupDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_group_detail
     *
     * @mbg.generated Mon Feb 10 21:11:05 CST 2020
     */
    int updateByExample(@Param("record") HfOrderGroupDetail record, @Param("example") HfOrderGroupDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_group_detail
     *
     * @mbg.generated Mon Feb 10 21:11:05 CST 2020
     */
    int updateByPrimaryKeySelective(HfOrderGroupDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_group_detail
     *
     * @mbg.generated Mon Feb 10 21:11:05 CST 2020
     */
    int updateByPrimaryKey(HfOrderGroupDetail record);
}