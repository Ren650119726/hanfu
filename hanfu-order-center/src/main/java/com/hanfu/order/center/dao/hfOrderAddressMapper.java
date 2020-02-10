package com.hanfu.order.center.dao;

import com.hanfu.order.center.model.HfOrderAddress;
import com.hanfu.order.center.model.HfOrderAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HfOrderAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_address
     *
     * @mbg.generated Mon Feb 10 21:11:05 CST 2020
     */
    long countByExample(HfOrderAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_address
     *
     * @mbg.generated Mon Feb 10 21:11:05 CST 2020
     */
    int deleteByExample(HfOrderAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_address
     *
     * @mbg.generated Mon Feb 10 21:11:05 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_address
     *
     * @mbg.generated Mon Feb 10 21:11:05 CST 2020
     */
    int insert(HfOrderAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_address
     *
     * @mbg.generated Mon Feb 10 21:11:05 CST 2020
     */
    int insertSelective(HfOrderAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_address
     *
     * @mbg.generated Mon Feb 10 21:11:05 CST 2020
     */
    List<HfOrderAddress> selectByExample(HfOrderAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_address
     *
     * @mbg.generated Mon Feb 10 21:11:05 CST 2020
     */
    HfOrderAddress selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_address
     *
     * @mbg.generated Mon Feb 10 21:11:05 CST 2020
     */
    int updateByExampleSelective(@Param("record") HfOrderAddress record, @Param("example") HfOrderAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_address
     *
     * @mbg.generated Mon Feb 10 21:11:05 CST 2020
     */
    int updateByExample(@Param("record") HfOrderAddress record, @Param("example") HfOrderAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_address
     *
     * @mbg.generated Mon Feb 10 21:11:05 CST 2020
     */
    int updateByPrimaryKeySelective(HfOrderAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_address
     *
     * @mbg.generated Mon Feb 10 21:11:05 CST 2020
     */
    int updateByPrimaryKey(HfOrderAddress record);
}