package com.hanfu.product.center.dao;

import com.hanfu.product.center.model.HfActivityCount;
import com.hanfu.product.center.model.HfActivityCountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HfActivityCountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_activity_count
     *
     * @mbg.generated Fri Mar 27 12:09:16 CST 2020
     */
    long countByExample(HfActivityCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_activity_count
     *
     * @mbg.generated Fri Mar 27 12:09:16 CST 2020
     */
    int deleteByExample(HfActivityCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_activity_count
     *
     * @mbg.generated Fri Mar 27 12:09:16 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_activity_count
     *
     * @mbg.generated Fri Mar 27 12:09:16 CST 2020
     */
    int insert(HfActivityCount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_activity_count
     *
     * @mbg.generated Fri Mar 27 12:09:16 CST 2020
     */
    int insertSelective(HfActivityCount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_activity_count
     *
     * @mbg.generated Fri Mar 27 12:09:16 CST 2020
     */
    List<HfActivityCount> selectByExample(HfActivityCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_activity_count
     *
     * @mbg.generated Fri Mar 27 12:09:16 CST 2020
     */
    HfActivityCount selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_activity_count
     *
     * @mbg.generated Fri Mar 27 12:09:16 CST 2020
     */
    int updateByExampleSelective(@Param("record") HfActivityCount record, @Param("example") HfActivityCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_activity_count
     *
     * @mbg.generated Fri Mar 27 12:09:16 CST 2020
     */
    int updateByExample(@Param("record") HfActivityCount record, @Param("example") HfActivityCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_activity_count
     *
     * @mbg.generated Fri Mar 27 12:09:16 CST 2020
     */
    int updateByPrimaryKeySelective(HfActivityCount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_activity_count
     *
     * @mbg.generated Fri Mar 27 12:09:16 CST 2020
     */
    int updateByPrimaryKey(HfActivityCount record);
}