package com.hanfu.user.center.dao;

import com.hanfu.user.center.model.HfLevelDescribe;
import com.hanfu.user.center.model.HfLevelDescribeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HfLevelDescribeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_level_describe
     *
     * @mbg.generated Tue Mar 31 11:53:11 CST 2020
     */
    long countByExample(HfLevelDescribeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_level_describe
     *
     * @mbg.generated Tue Mar 31 11:53:11 CST 2020
     */
    int deleteByExample(HfLevelDescribeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_level_describe
     *
     * @mbg.generated Tue Mar 31 11:53:11 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_level_describe
     *
     * @mbg.generated Tue Mar 31 11:53:11 CST 2020
     */
    int insert(HfLevelDescribe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_level_describe
     *
     * @mbg.generated Tue Mar 31 11:53:11 CST 2020
     */
    int insertSelective(HfLevelDescribe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_level_describe
     *
     * @mbg.generated Tue Mar 31 11:53:11 CST 2020
     */
    List<HfLevelDescribe> selectByExample(HfLevelDescribeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_level_describe
     *
     * @mbg.generated Tue Mar 31 11:53:11 CST 2020
     */
    HfLevelDescribe selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_level_describe
     *
     * @mbg.generated Tue Mar 31 11:53:11 CST 2020
     */
    int updateByExampleSelective(@Param("record") HfLevelDescribe record, @Param("example") HfLevelDescribeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_level_describe
     *
     * @mbg.generated Tue Mar 31 11:53:11 CST 2020
     */
    int updateByExample(@Param("record") HfLevelDescribe record, @Param("example") HfLevelDescribeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_level_describe
     *
     * @mbg.generated Tue Mar 31 11:53:11 CST 2020
     */
    int updateByPrimaryKeySelective(HfLevelDescribe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_level_describe
     *
     * @mbg.generated Tue Mar 31 11:53:11 CST 2020
     */
    int updateByPrimaryKey(HfLevelDescribe record);
}