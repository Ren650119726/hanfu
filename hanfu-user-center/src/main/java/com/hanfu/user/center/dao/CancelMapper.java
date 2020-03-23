package com.hanfu.user.center.dao;

import com.hanfu.user.center.model.Cancel;
import com.hanfu.user.center.model.CancelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CancelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cancel
     *
     * @mbg.generated Mon Mar 23 09:19:34 CST 2020
     */
    long countByExample(CancelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cancel
     *
     * @mbg.generated Mon Mar 23 09:19:34 CST 2020
     */
    int deleteByExample(CancelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cancel
     *
     * @mbg.generated Mon Mar 23 09:19:34 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cancel
     *
     * @mbg.generated Mon Mar 23 09:19:34 CST 2020
     */
    int insert(Cancel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cancel
     *
     * @mbg.generated Mon Mar 23 09:19:34 CST 2020
     */
    int insertSelective(Cancel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cancel
     *
     * @mbg.generated Mon Mar 23 09:19:34 CST 2020
     */
    List<Cancel> selectByExample(CancelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cancel
     *
     * @mbg.generated Mon Mar 23 09:19:34 CST 2020
     */
    Cancel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cancel
     *
     * @mbg.generated Mon Mar 23 09:19:34 CST 2020
     */
    int updateByExampleSelective(@Param("record") Cancel record, @Param("example") CancelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cancel
     *
     * @mbg.generated Mon Mar 23 09:19:34 CST 2020
     */
    int updateByExample(@Param("record") Cancel record, @Param("example") CancelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cancel
     *
     * @mbg.generated Mon Mar 23 09:19:34 CST 2020
     */
    int updateByPrimaryKeySelective(Cancel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cancel
     *
     * @mbg.generated Mon Mar 23 09:19:34 CST 2020
     */
    int updateByPrimaryKey(Cancel record);
}