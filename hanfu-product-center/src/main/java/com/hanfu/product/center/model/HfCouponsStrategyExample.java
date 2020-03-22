package com.hanfu.product.center.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HfCouponsStrategyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hf_coupons_strategy
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hf_coupons_strategy
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hf_coupons_strategy
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_coupons_strategy
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    public HfCouponsStrategyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_coupons_strategy
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_coupons_strategy
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_coupons_strategy
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_coupons_strategy
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_coupons_strategy
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_coupons_strategy
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_coupons_strategy
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_coupons_strategy
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_coupons_strategy
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_coupons_strategy
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hf_coupons_strategy
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andHfNameIsNull() {
            addCriterion("hf_name is null");
            return (Criteria) this;
        }

        public Criteria andHfNameIsNotNull() {
            addCriterion("hf_name is not null");
            return (Criteria) this;
        }

        public Criteria andHfNameEqualTo(String value) {
            addCriterion("hf_name =", value, "hfName");
            return (Criteria) this;
        }

        public Criteria andHfNameNotEqualTo(String value) {
            addCriterion("hf_name <>", value, "hfName");
            return (Criteria) this;
        }

        public Criteria andHfNameGreaterThan(String value) {
            addCriterion("hf_name >", value, "hfName");
            return (Criteria) this;
        }

        public Criteria andHfNameGreaterThanOrEqualTo(String value) {
            addCriterion("hf_name >=", value, "hfName");
            return (Criteria) this;
        }

        public Criteria andHfNameLessThan(String value) {
            addCriterion("hf_name <", value, "hfName");
            return (Criteria) this;
        }

        public Criteria andHfNameLessThanOrEqualTo(String value) {
            addCriterion("hf_name <=", value, "hfName");
            return (Criteria) this;
        }

        public Criteria andHfNameLike(String value) {
            addCriterion("hf_name like", value, "hfName");
            return (Criteria) this;
        }

        public Criteria andHfNameNotLike(String value) {
            addCriterion("hf_name not like", value, "hfName");
            return (Criteria) this;
        }

        public Criteria andHfNameIn(List<String> values) {
            addCriterion("hf_name in", values, "hfName");
            return (Criteria) this;
        }

        public Criteria andHfNameNotIn(List<String> values) {
            addCriterion("hf_name not in", values, "hfName");
            return (Criteria) this;
        }

        public Criteria andHfNameBetween(String value1, String value2) {
            addCriterion("hf_name between", value1, value2, "hfName");
            return (Criteria) this;
        }

        public Criteria andHfNameNotBetween(String value1, String value2) {
            addCriterion("hf_name not between", value1, value2, "hfName");
            return (Criteria) this;
        }

        public Criteria andHfDescIsNull() {
            addCriterion("hf_desc is null");
            return (Criteria) this;
        }

        public Criteria andHfDescIsNotNull() {
            addCriterion("hf_desc is not null");
            return (Criteria) this;
        }

        public Criteria andHfDescEqualTo(String value) {
            addCriterion("hf_desc =", value, "hfDesc");
            return (Criteria) this;
        }

        public Criteria andHfDescNotEqualTo(String value) {
            addCriterion("hf_desc <>", value, "hfDesc");
            return (Criteria) this;
        }

        public Criteria andHfDescGreaterThan(String value) {
            addCriterion("hf_desc >", value, "hfDesc");
            return (Criteria) this;
        }

        public Criteria andHfDescGreaterThanOrEqualTo(String value) {
            addCriterion("hf_desc >=", value, "hfDesc");
            return (Criteria) this;
        }

        public Criteria andHfDescLessThan(String value) {
            addCriterion("hf_desc <", value, "hfDesc");
            return (Criteria) this;
        }

        public Criteria andHfDescLessThanOrEqualTo(String value) {
            addCriterion("hf_desc <=", value, "hfDesc");
            return (Criteria) this;
        }

        public Criteria andHfDescLike(String value) {
            addCriterion("hf_desc like", value, "hfDesc");
            return (Criteria) this;
        }

        public Criteria andHfDescNotLike(String value) {
            addCriterion("hf_desc not like", value, "hfDesc");
            return (Criteria) this;
        }

        public Criteria andHfDescIn(List<String> values) {
            addCriterion("hf_desc in", values, "hfDesc");
            return (Criteria) this;
        }

        public Criteria andHfDescNotIn(List<String> values) {
            addCriterion("hf_desc not in", values, "hfDesc");
            return (Criteria) this;
        }

        public Criteria andHfDescBetween(String value1, String value2) {
            addCriterion("hf_desc between", value1, value2, "hfDesc");
            return (Criteria) this;
        }

        public Criteria andHfDescNotBetween(String value1, String value2) {
            addCriterion("hf_desc not between", value1, value2, "hfDesc");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeIsNull() {
            addCriterion("strategy_type is null");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeIsNotNull() {
            addCriterion("strategy_type is not null");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeEqualTo(String value) {
            addCriterion("strategy_type =", value, "strategyType");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeNotEqualTo(String value) {
            addCriterion("strategy_type <>", value, "strategyType");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeGreaterThan(String value) {
            addCriterion("strategy_type >", value, "strategyType");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("strategy_type >=", value, "strategyType");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeLessThan(String value) {
            addCriterion("strategy_type <", value, "strategyType");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeLessThanOrEqualTo(String value) {
            addCriterion("strategy_type <=", value, "strategyType");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeLike(String value) {
            addCriterion("strategy_type like", value, "strategyType");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeNotLike(String value) {
            addCriterion("strategy_type not like", value, "strategyType");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeIn(List<String> values) {
            addCriterion("strategy_type in", values, "strategyType");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeNotIn(List<String> values) {
            addCriterion("strategy_type not in", values, "strategyType");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeBetween(String value1, String value2) {
            addCriterion("strategy_type between", value1, value2, "strategyType");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeNotBetween(String value1, String value2) {
            addCriterion("strategy_type not between", value1, value2, "strategyType");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoIsNull() {
            addCriterion("strategy_info is null");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoIsNotNull() {
            addCriterion("strategy_info is not null");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoEqualTo(String value) {
            addCriterion("strategy_info =", value, "strategyInfo");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoNotEqualTo(String value) {
            addCriterion("strategy_info <>", value, "strategyInfo");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoGreaterThan(String value) {
            addCriterion("strategy_info >", value, "strategyInfo");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoGreaterThanOrEqualTo(String value) {
            addCriterion("strategy_info >=", value, "strategyInfo");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoLessThan(String value) {
            addCriterion("strategy_info <", value, "strategyInfo");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoLessThanOrEqualTo(String value) {
            addCriterion("strategy_info <=", value, "strategyInfo");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoLike(String value) {
            addCriterion("strategy_info like", value, "strategyInfo");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoNotLike(String value) {
            addCriterion("strategy_info not like", value, "strategyInfo");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoIn(List<String> values) {
            addCriterion("strategy_info in", values, "strategyInfo");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoNotIn(List<String> values) {
            addCriterion("strategy_info not in", values, "strategyInfo");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoBetween(String value1, String value2) {
            addCriterion("strategy_info between", value1, value2, "strategyInfo");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoNotBetween(String value1, String value2) {
            addCriterion("strategy_info not between", value1, value2, "strategyInfo");
            return (Criteria) this;
        }

        public Criteria andHfRemarkIsNull() {
            addCriterion("hf_remark is null");
            return (Criteria) this;
        }

        public Criteria andHfRemarkIsNotNull() {
            addCriterion("hf_remark is not null");
            return (Criteria) this;
        }

        public Criteria andHfRemarkEqualTo(String value) {
            addCriterion("hf_remark =", value, "hfRemark");
            return (Criteria) this;
        }

        public Criteria andHfRemarkNotEqualTo(String value) {
            addCriterion("hf_remark <>", value, "hfRemark");
            return (Criteria) this;
        }

        public Criteria andHfRemarkGreaterThan(String value) {
            addCriterion("hf_remark >", value, "hfRemark");
            return (Criteria) this;
        }

        public Criteria andHfRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("hf_remark >=", value, "hfRemark");
            return (Criteria) this;
        }

        public Criteria andHfRemarkLessThan(String value) {
            addCriterion("hf_remark <", value, "hfRemark");
            return (Criteria) this;
        }

        public Criteria andHfRemarkLessThanOrEqualTo(String value) {
            addCriterion("hf_remark <=", value, "hfRemark");
            return (Criteria) this;
        }

        public Criteria andHfRemarkLike(String value) {
            addCriterion("hf_remark like", value, "hfRemark");
            return (Criteria) this;
        }

        public Criteria andHfRemarkNotLike(String value) {
            addCriterion("hf_remark not like", value, "hfRemark");
            return (Criteria) this;
        }

        public Criteria andHfRemarkIn(List<String> values) {
            addCriterion("hf_remark in", values, "hfRemark");
            return (Criteria) this;
        }

        public Criteria andHfRemarkNotIn(List<String> values) {
            addCriterion("hf_remark not in", values, "hfRemark");
            return (Criteria) this;
        }

        public Criteria andHfRemarkBetween(String value1, String value2) {
            addCriterion("hf_remark between", value1, value2, "hfRemark");
            return (Criteria) this;
        }

        public Criteria andHfRemarkNotBetween(String value1, String value2) {
            addCriterion("hf_remark not between", value1, value2, "hfRemark");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateIsNull() {
            addCriterion("effective_date is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateIsNotNull() {
            addCriterion("effective_date is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateEqualTo(LocalDateTime value) {
            addCriterion("effective_date =", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateNotEqualTo(LocalDateTime value) {
            addCriterion("effective_date <>", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateGreaterThan(LocalDateTime value) {
            addCriterion("effective_date >", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("effective_date >=", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateLessThan(LocalDateTime value) {
            addCriterion("effective_date <", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("effective_date <=", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateIn(List<LocalDateTime> values) {
            addCriterion("effective_date in", values, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateNotIn(List<LocalDateTime> values) {
            addCriterion("effective_date not in", values, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("effective_date between", value1, value2, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("effective_date not between", value1, value2, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNull() {
            addCriterion("expire_date is null");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNotNull() {
            addCriterion("expire_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpireDateEqualTo(LocalDateTime value) {
            addCriterion("expire_date =", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotEqualTo(LocalDateTime value) {
            addCriterion("expire_date <>", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThan(LocalDateTime value) {
            addCriterion("expire_date >", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("expire_date >=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThan(LocalDateTime value) {
            addCriterion("expire_date <", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("expire_date <=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateIn(List<LocalDateTime> values) {
            addCriterion("expire_date in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotIn(List<LocalDateTime> values) {
            addCriterion("expire_date not in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("expire_date between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("expire_date not between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(LocalDateTime value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(LocalDateTime value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(LocalDateTime value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(LocalDateTime value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<LocalDateTime> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<LocalDateTime> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(LocalDateTime value) {
            addCriterion("modify_date =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(LocalDateTime value) {
            addCriterion("modify_date <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(LocalDateTime value) {
            addCriterion("modify_date >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("modify_date >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(LocalDateTime value) {
            addCriterion("modify_date <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("modify_date <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<LocalDateTime> values) {
            addCriterion("modify_date in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<LocalDateTime> values) {
            addCriterion("modify_date not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("modify_date between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("modify_date not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andIdDeletedIsNull() {
            addCriterion("id_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIdDeletedIsNotNull() {
            addCriterion("id_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIdDeletedEqualTo(Byte value) {
            addCriterion("id_deleted =", value, "idDeleted");
            return (Criteria) this;
        }

        public Criteria andIdDeletedNotEqualTo(Byte value) {
            addCriterion("id_deleted <>", value, "idDeleted");
            return (Criteria) this;
        }

        public Criteria andIdDeletedGreaterThan(Byte value) {
            addCriterion("id_deleted >", value, "idDeleted");
            return (Criteria) this;
        }

        public Criteria andIdDeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("id_deleted >=", value, "idDeleted");
            return (Criteria) this;
        }

        public Criteria andIdDeletedLessThan(Byte value) {
            addCriterion("id_deleted <", value, "idDeleted");
            return (Criteria) this;
        }

        public Criteria andIdDeletedLessThanOrEqualTo(Byte value) {
            addCriterion("id_deleted <=", value, "idDeleted");
            return (Criteria) this;
        }

        public Criteria andIdDeletedIn(List<Byte> values) {
            addCriterion("id_deleted in", values, "idDeleted");
            return (Criteria) this;
        }

        public Criteria andIdDeletedNotIn(List<Byte> values) {
            addCriterion("id_deleted not in", values, "idDeleted");
            return (Criteria) this;
        }

        public Criteria andIdDeletedBetween(Byte value1, Byte value2) {
            addCriterion("id_deleted between", value1, value2, "idDeleted");
            return (Criteria) this;
        }

        public Criteria andIdDeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("id_deleted not between", value1, value2, "idDeleted");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hf_coupons_strategy
     *
     * @mbg.generated do_not_delete_during_merge Sun Mar 22 17:13:44 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hf_coupons_strategy
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}