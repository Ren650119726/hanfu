package com.hanfu.user.center.dao;

import com.hanfu.user.center.model.HfUserAddresse;
import com.hanfu.user.center.model.HfUserAddresseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HfUserAddresseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_address
     *
     * @mbg.generated Mon Oct 14 06:52:54 CST 2019
     */
    long countByExample(HfUserAddresseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_address
     *
     * @mbg.generated Mon Oct 14 06:52:54 CST 2019
     */
    int deleteByExample(HfUserAddresseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_address
     *
     * @mbg.generated Mon Oct 14 06:52:54 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_address
     *
     * @mbg.generated Mon Oct 14 06:52:54 CST 2019
     */
    int insert(HfUserAddresse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_address
     *
     * @mbg.generated Mon Oct 14 06:52:54 CST 2019
     */
    int insertSelective(HfUserAddresse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_address
     *
     * @mbg.generated Mon Oct 14 06:52:54 CST 2019
     */
    List<HfUserAddresse> selectByExample(HfUserAddresseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_address
     *
     * @mbg.generated Mon Oct 14 06:52:54 CST 2019
     */
    HfUserAddresse selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_address
     *
     * @mbg.generated Mon Oct 14 06:52:54 CST 2019
     */
    int updateByExampleSelective(@Param("record") HfUserAddresse record, @Param("example") HfUserAddresseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_address
     *
     * @mbg.generated Mon Oct 14 06:52:54 CST 2019
     */
    int updateByExample(@Param("record") HfUserAddresse record, @Param("example") HfUserAddresseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_address
     *
     * @mbg.generated Mon Oct 14 06:52:54 CST 2019
     */
    int updateByPrimaryKeySelective(HfUserAddresse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_address
     *
     * @mbg.generated Mon Oct 14 06:52:54 CST 2019
     */
    int updateByPrimaryKey(HfUserAddresse record);
}