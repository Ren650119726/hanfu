package com.hanfu.payment.center.dao;

import com.hanfu.payment.center.model.HfUserBrowseRecord;
import com.hanfu.payment.center.model.HfUserBrowseRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HfUserBrowseRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_browse_record
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
     */
    long countByExample(HfUserBrowseRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_browse_record
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
     */
    int deleteByExample(HfUserBrowseRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_browse_record
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_browse_record
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
     */
    int insert(HfUserBrowseRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_browse_record
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
     */
    int insertSelective(HfUserBrowseRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_browse_record
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
     */
    List<HfUserBrowseRecord> selectByExample(HfUserBrowseRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_browse_record
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
     */
    HfUserBrowseRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_browse_record
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
     */
    int updateByExampleSelective(@Param("record") HfUserBrowseRecord record, @Param("example") HfUserBrowseRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_browse_record
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
     */
    int updateByExample(@Param("record") HfUserBrowseRecord record, @Param("example") HfUserBrowseRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_browse_record
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
     */
    int updateByPrimaryKeySelective(HfUserBrowseRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_browse_record
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
     */
    int updateByPrimaryKey(HfUserBrowseRecord record);
}