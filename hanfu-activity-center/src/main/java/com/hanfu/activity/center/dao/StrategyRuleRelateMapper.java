package com.hanfu.activity.center.dao;

import com.hanfu.activity.center.model.StrategyRuleRelate;
import com.hanfu.activity.center.model.StrategyRuleRelateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StrategyRuleRelateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strategy_rule_relate
     *
     * @mbg.generated Mon Nov 11 07:08:01 CST 2019
     */
    long countByExample(StrategyRuleRelateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strategy_rule_relate
     *
     * @mbg.generated Mon Nov 11 07:08:01 CST 2019
     */
    int deleteByExample(StrategyRuleRelateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strategy_rule_relate
     *
     * @mbg.generated Mon Nov 11 07:08:01 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strategy_rule_relate
     *
     * @mbg.generated Mon Nov 11 07:08:01 CST 2019
     */
    int insert(StrategyRuleRelate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strategy_rule_relate
     *
     * @mbg.generated Mon Nov 11 07:08:01 CST 2019
     */
    int insertSelective(StrategyRuleRelate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strategy_rule_relate
     *
     * @mbg.generated Mon Nov 11 07:08:01 CST 2019
     */
    List<StrategyRuleRelate> selectByExample(StrategyRuleRelateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strategy_rule_relate
     *
     * @mbg.generated Mon Nov 11 07:08:01 CST 2019
     */
    StrategyRuleRelate selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strategy_rule_relate
     *
     * @mbg.generated Mon Nov 11 07:08:01 CST 2019
     */
    int updateByExampleSelective(@Param("record") StrategyRuleRelate record, @Param("example") StrategyRuleRelateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strategy_rule_relate
     *
     * @mbg.generated Mon Nov 11 07:08:01 CST 2019
     */
    int updateByExample(@Param("record") StrategyRuleRelate record, @Param("example") StrategyRuleRelateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strategy_rule_relate
     *
     * @mbg.generated Mon Nov 11 07:08:01 CST 2019
     */
    int updateByPrimaryKeySelective(StrategyRuleRelate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strategy_rule_relate
     *
     * @mbg.generated Mon Nov 11 07:08:01 CST 2019
     */
    int updateByPrimaryKey(StrategyRuleRelate record);
}