package com.hanfu.activity.center.dao;

import com.hanfu.activity.center.model.ActivityVoteRecords;
import com.hanfu.activity.center.model.ActivityVoteRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityVoteRecordsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_vote_records
     *
     * @mbg.generated Thu Nov 21 07:22:10 CST 2019
     */
    long countByExample(ActivityVoteRecordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_vote_records
     *
     * @mbg.generated Thu Nov 21 07:22:10 CST 2019
     */
    int deleteByExample(ActivityVoteRecordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_vote_records
     *
     * @mbg.generated Thu Nov 21 07:22:10 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_vote_records
     *
     * @mbg.generated Thu Nov 21 07:22:10 CST 2019
     */
    int insert(ActivityVoteRecords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_vote_records
     *
     * @mbg.generated Thu Nov 21 07:22:10 CST 2019
     */
    int insertSelective(ActivityVoteRecords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_vote_records
     *
     * @mbg.generated Thu Nov 21 07:22:10 CST 2019
     */
    List<ActivityVoteRecords> selectByExample(ActivityVoteRecordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_vote_records
     *
     * @mbg.generated Thu Nov 21 07:22:10 CST 2019
     */
    ActivityVoteRecords selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_vote_records
     *
     * @mbg.generated Thu Nov 21 07:22:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") ActivityVoteRecords record, @Param("example") ActivityVoteRecordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_vote_records
     *
     * @mbg.generated Thu Nov 21 07:22:10 CST 2019
     */
    int updateByExample(@Param("record") ActivityVoteRecords record, @Param("example") ActivityVoteRecordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_vote_records
     *
     * @mbg.generated Thu Nov 21 07:22:10 CST 2019
     */
    int updateByPrimaryKeySelective(ActivityVoteRecords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_vote_records
     *
     * @mbg.generated Thu Nov 21 07:22:10 CST 2019
     */
    int updateByPrimaryKey(ActivityVoteRecords record);
}