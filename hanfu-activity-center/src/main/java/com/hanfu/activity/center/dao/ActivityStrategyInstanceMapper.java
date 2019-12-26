package com.hanfu.activity.center.dao;

import com.hanfu.activity.center.model.ActivityStrategyInstance;
import com.hanfu.activity.center.model.ActivityStrategyInstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityStrategyInstanceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_strategy_instance
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    long countByExample(ActivityStrategyInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_strategy_instance
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    int deleteByExample(ActivityStrategyInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_strategy_instance
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_strategy_instance
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    int insert(ActivityStrategyInstance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_strategy_instance
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    int insertSelective(ActivityStrategyInstance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_strategy_instance
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    List<ActivityStrategyInstance> selectByExample(ActivityStrategyInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_strategy_instance
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    ActivityStrategyInstance selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_strategy_instance
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    int updateByExampleSelective(@Param("record") ActivityStrategyInstance record, @Param("example") ActivityStrategyInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_strategy_instance
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    int updateByExample(@Param("record") ActivityStrategyInstance record, @Param("example") ActivityStrategyInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_strategy_instance
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    int updateByPrimaryKeySelective(ActivityStrategyInstance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_strategy_instance
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    int updateByPrimaryKey(ActivityStrategyInstance record);
}