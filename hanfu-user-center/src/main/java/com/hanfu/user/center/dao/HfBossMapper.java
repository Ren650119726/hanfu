package com.hanfu.user.center.dao;

import com.hanfu.user.center.model.HfBoss;
import com.hanfu.user.center.model.HfBossExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HfBossMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_boss
     *
     * @mbg.generated Sun Mar 29 16:53:53 CST 2020
     */
    long countByExample(HfBossExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_boss
     *
     * @mbg.generated Sun Mar 29 16:53:53 CST 2020
     */
    int deleteByExample(HfBossExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_boss
     *
     * @mbg.generated Sun Mar 29 16:53:53 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_boss
     *
     * @mbg.generated Sun Mar 29 16:53:53 CST 2020
     */
    int insert(HfBoss record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_boss
     *
     * @mbg.generated Sun Mar 29 16:53:53 CST 2020
     */
    int insertSelective(HfBoss record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_boss
     *
     * @mbg.generated Sun Mar 29 16:53:53 CST 2020
     */
    List<HfBoss> selectByExample(HfBossExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_boss
     *
     * @mbg.generated Sun Mar 29 16:53:53 CST 2020
     */
    HfBoss selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_boss
     *
     * @mbg.generated Sun Mar 29 16:53:53 CST 2020
     */
    int updateByExampleSelective(@Param("record") HfBoss record, @Param("example") HfBossExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_boss
     *
     * @mbg.generated Sun Mar 29 16:53:53 CST 2020
     */
    int updateByExample(@Param("record") HfBoss record, @Param("example") HfBossExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_boss
     *
     * @mbg.generated Sun Mar 29 16:53:53 CST 2020
     */
    int updateByPrimaryKeySelective(HfBoss record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_boss
     *
     * @mbg.generated Sun Mar 29 16:53:53 CST 2020
     */
    int updateByPrimaryKey(HfBoss record);
}