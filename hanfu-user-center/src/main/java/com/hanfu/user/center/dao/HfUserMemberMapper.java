package com.hanfu.user.center.dao;

import com.hanfu.user.center.model.HfUserMember;
import com.hanfu.user.center.model.HfUserMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HfUserMemberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_member
     *
     * @mbg.generated Wed Mar 25 13:31:32 CST 2020
     */
    long countByExample(HfUserMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_member
     *
     * @mbg.generated Wed Mar 25 13:31:32 CST 2020
     */
    int deleteByExample(HfUserMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_member
     *
     * @mbg.generated Wed Mar 25 13:31:32 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_member
     *
     * @mbg.generated Wed Mar 25 13:31:32 CST 2020
     */
    int insert(HfUserMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_member
     *
     * @mbg.generated Wed Mar 25 13:31:32 CST 2020
     */
    int insertSelective(HfUserMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_member
     *
     * @mbg.generated Wed Mar 25 13:31:32 CST 2020
     */
    List<HfUserMember> selectByExample(HfUserMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_member
     *
     * @mbg.generated Wed Mar 25 13:31:32 CST 2020
     */
    HfUserMember selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_member
     *
     * @mbg.generated Wed Mar 25 13:31:32 CST 2020
     */
    int updateByExampleSelective(@Param("record") HfUserMember record, @Param("example") HfUserMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_member
     *
     * @mbg.generated Wed Mar 25 13:31:32 CST 2020
     */
    int updateByExample(@Param("record") HfUserMember record, @Param("example") HfUserMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_member
     *
     * @mbg.generated Wed Mar 25 13:31:32 CST 2020
     */
    int updateByPrimaryKeySelective(HfUserMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_member
     *
     * @mbg.generated Wed Mar 25 13:31:32 CST 2020
     */
    int updateByPrimaryKey(HfUserMember record);
}