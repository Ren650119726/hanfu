package com.hanfu.product.center.dao;

import com.hanfu.product.center.model.StoneInfo;
import com.hanfu.product.center.model.StoneInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoneInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stone_info
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    long countByExample(StoneInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stone_info
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    int deleteByExample(StoneInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stone_info
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stone_info
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    int insert(StoneInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stone_info
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    int insertSelective(StoneInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stone_info
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    List<StoneInfo> selectByExample(StoneInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stone_info
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    StoneInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stone_info
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    int updateByExampleSelective(@Param("record") StoneInfo record, @Param("example") StoneInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stone_info
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    int updateByExample(@Param("record") StoneInfo record, @Param("example") StoneInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stone_info
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    int updateByPrimaryKeySelective(StoneInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stone_info
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    int updateByPrimaryKey(StoneInfo record);
}