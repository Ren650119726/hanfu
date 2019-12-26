package com.hanfu.activity.center.dao;

import com.hanfu.activity.center.model.ActivityUserInfo;
import com.hanfu.activity.center.model.ActivityUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityUserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_user_info
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    long countByExample(ActivityUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_user_info
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    int deleteByExample(ActivityUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_user_info
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_user_info
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    int insert(ActivityUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_user_info
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    int insertSelective(ActivityUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_user_info
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    List<ActivityUserInfo> selectByExample(ActivityUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_user_info
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    ActivityUserInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_user_info
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    int updateByExampleSelective(@Param("record") ActivityUserInfo record, @Param("example") ActivityUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_user_info
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    int updateByExample(@Param("record") ActivityUserInfo record, @Param("example") ActivityUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_user_info
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    int updateByPrimaryKeySelective(ActivityUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_user_info
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    int updateByPrimaryKey(ActivityUserInfo record);
}