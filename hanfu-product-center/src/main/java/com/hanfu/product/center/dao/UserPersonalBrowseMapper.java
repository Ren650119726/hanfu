package com.hanfu.product.center.dao;

import com.hanfu.product.center.model.UserPersonalBrowse;
import com.hanfu.product.center.model.UserPersonalBrowseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPersonalBrowseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_personal_browse
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    long countByExample(UserPersonalBrowseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_personal_browse
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    int deleteByExample(UserPersonalBrowseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_personal_browse
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_personal_browse
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    int insert(UserPersonalBrowse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_personal_browse
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    int insertSelective(UserPersonalBrowse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_personal_browse
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    List<UserPersonalBrowse> selectByExample(UserPersonalBrowseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_personal_browse
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    UserPersonalBrowse selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_personal_browse
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    int updateByExampleSelective(@Param("record") UserPersonalBrowse record, @Param("example") UserPersonalBrowseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_personal_browse
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    int updateByExample(@Param("record") UserPersonalBrowse record, @Param("example") UserPersonalBrowseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_personal_browse
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    int updateByPrimaryKeySelective(UserPersonalBrowse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_personal_browse
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    int updateByPrimaryKey(UserPersonalBrowse record);
}