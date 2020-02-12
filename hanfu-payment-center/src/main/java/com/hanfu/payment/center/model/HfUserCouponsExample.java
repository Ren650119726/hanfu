package com.hanfu.payment.center.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HfUserCouponsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hf_user_coupons
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hf_user_coupons
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hf_user_coupons
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_coupons
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
     */
    public HfUserCouponsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_coupons
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_coupons
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_coupons
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_coupons
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_coupons
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_coupons
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_coupons
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_coupons
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
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
     * This method corresponds to the database table hf_user_coupons
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_coupons
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hf_user_coupons
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andHfStatusIsNull() {
            addCriterion("hf_status is null");
            return (Criteria) this;
        }

        public Criteria andHfStatusIsNotNull() {
            addCriterion("hf_status is not null");
            return (Criteria) this;
        }

        public Criteria andHfStatusEqualTo(String value) {
            addCriterion("hf_status =", value, "hfStatus");
            return (Criteria) this;
        }

        public Criteria andHfStatusNotEqualTo(String value) {
            addCriterion("hf_status <>", value, "hfStatus");
            return (Criteria) this;
        }

        public Criteria andHfStatusGreaterThan(String value) {
            addCriterion("hf_status >", value, "hfStatus");
            return (Criteria) this;
        }

        public Criteria andHfStatusGreaterThanOrEqualTo(String value) {
            addCriterion("hf_status >=", value, "hfStatus");
            return (Criteria) this;
        }

        public Criteria andHfStatusLessThan(String value) {
            addCriterion("hf_status <", value, "hfStatus");
            return (Criteria) this;
        }

        public Criteria andHfStatusLessThanOrEqualTo(String value) {
            addCriterion("hf_status <=", value, "hfStatus");
            return (Criteria) this;
        }

        public Criteria andHfStatusLike(String value) {
            addCriterion("hf_status like", value, "hfStatus");
            return (Criteria) this;
        }

        public Criteria andHfStatusNotLike(String value) {
            addCriterion("hf_status not like", value, "hfStatus");
            return (Criteria) this;
        }

        public Criteria andHfStatusIn(List<String> values) {
            addCriterion("hf_status in", values, "hfStatus");
            return (Criteria) this;
        }

        public Criteria andHfStatusNotIn(List<String> values) {
            addCriterion("hf_status not in", values, "hfStatus");
            return (Criteria) this;
        }

        public Criteria andHfStatusBetween(String value1, String value2) {
            addCriterion("hf_status between", value1, value2, "hfStatus");
            return (Criteria) this;
        }

        public Criteria andHfStatusNotBetween(String value1, String value2) {
            addCriterion("hf_status not between", value1, value2, "hfStatus");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeIsNull() {
            addCriterion("coupons_type is null");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeIsNotNull() {
            addCriterion("coupons_type is not null");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeEqualTo(String value) {
            addCriterion("coupons_type =", value, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeNotEqualTo(String value) {
            addCriterion("coupons_type <>", value, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeGreaterThan(String value) {
            addCriterion("coupons_type >", value, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("coupons_type >=", value, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeLessThan(String value) {
            addCriterion("coupons_type <", value, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeLessThanOrEqualTo(String value) {
            addCriterion("coupons_type <=", value, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeLike(String value) {
            addCriterion("coupons_type like", value, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeNotLike(String value) {
            addCriterion("coupons_type not like", value, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeIn(List<String> values) {
            addCriterion("coupons_type in", values, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeNotIn(List<String> values) {
            addCriterion("coupons_type not in", values, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeBetween(String value1, String value2) {
            addCriterion("coupons_type between", value1, value2, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeNotBetween(String value1, String value2) {
            addCriterion("coupons_type not between", value1, value2, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsInfoIsNull() {
            addCriterion("coupons_info is null");
            return (Criteria) this;
        }

        public Criteria andCouponsInfoIsNotNull() {
            addCriterion("coupons_info is not null");
            return (Criteria) this;
        }

        public Criteria andCouponsInfoEqualTo(String value) {
            addCriterion("coupons_info =", value, "couponsInfo");
            return (Criteria) this;
        }

        public Criteria andCouponsInfoNotEqualTo(String value) {
            addCriterion("coupons_info <>", value, "couponsInfo");
            return (Criteria) this;
        }

        public Criteria andCouponsInfoGreaterThan(String value) {
            addCriterion("coupons_info >", value, "couponsInfo");
            return (Criteria) this;
        }

        public Criteria andCouponsInfoGreaterThanOrEqualTo(String value) {
            addCriterion("coupons_info >=", value, "couponsInfo");
            return (Criteria) this;
        }

        public Criteria andCouponsInfoLessThan(String value) {
            addCriterion("coupons_info <", value, "couponsInfo");
            return (Criteria) this;
        }

        public Criteria andCouponsInfoLessThanOrEqualTo(String value) {
            addCriterion("coupons_info <=", value, "couponsInfo");
            return (Criteria) this;
        }

        public Criteria andCouponsInfoLike(String value) {
            addCriterion("coupons_info like", value, "couponsInfo");
            return (Criteria) this;
        }

        public Criteria andCouponsInfoNotLike(String value) {
            addCriterion("coupons_info not like", value, "couponsInfo");
            return (Criteria) this;
        }

        public Criteria andCouponsInfoIn(List<String> values) {
            addCriterion("coupons_info in", values, "couponsInfo");
            return (Criteria) this;
        }

        public Criteria andCouponsInfoNotIn(List<String> values) {
            addCriterion("coupons_info not in", values, "couponsInfo");
            return (Criteria) this;
        }

        public Criteria andCouponsInfoBetween(String value1, String value2) {
            addCriterion("coupons_info between", value1, value2, "couponsInfo");
            return (Criteria) this;
        }

        public Criteria andCouponsInfoNotBetween(String value1, String value2) {
            addCriterion("coupons_info not between", value1, value2, "couponsInfo");
            return (Criteria) this;
        }

        public Criteria andCouponsStrategyIdIsNull() {
            addCriterion("coupons_strategy_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponsStrategyIdIsNotNull() {
            addCriterion("coupons_strategy_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponsStrategyIdEqualTo(Integer value) {
            addCriterion("coupons_strategy_id =", value, "couponsStrategyId");
            return (Criteria) this;
        }

        public Criteria andCouponsStrategyIdNotEqualTo(Integer value) {
            addCriterion("coupons_strategy_id <>", value, "couponsStrategyId");
            return (Criteria) this;
        }

        public Criteria andCouponsStrategyIdGreaterThan(Integer value) {
            addCriterion("coupons_strategy_id >", value, "couponsStrategyId");
            return (Criteria) this;
        }

        public Criteria andCouponsStrategyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupons_strategy_id >=", value, "couponsStrategyId");
            return (Criteria) this;
        }

        public Criteria andCouponsStrategyIdLessThan(Integer value) {
            addCriterion("coupons_strategy_id <", value, "couponsStrategyId");
            return (Criteria) this;
        }

        public Criteria andCouponsStrategyIdLessThanOrEqualTo(Integer value) {
            addCriterion("coupons_strategy_id <=", value, "couponsStrategyId");
            return (Criteria) this;
        }

        public Criteria andCouponsStrategyIdIn(List<Integer> values) {
            addCriterion("coupons_strategy_id in", values, "couponsStrategyId");
            return (Criteria) this;
        }

        public Criteria andCouponsStrategyIdNotIn(List<Integer> values) {
            addCriterion("coupons_strategy_id not in", values, "couponsStrategyId");
            return (Criteria) this;
        }

        public Criteria andCouponsStrategyIdBetween(Integer value1, Integer value2) {
            addCriterion("coupons_strategy_id between", value1, value2, "couponsStrategyId");
            return (Criteria) this;
        }

        public Criteria andCouponsStrategyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coupons_strategy_id not between", value1, value2, "couponsStrategyId");
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
     * This class corresponds to the database table hf_user_coupons
     *
     * @mbg.generated do_not_delete_during_merge Mon Feb 10 20:33:43 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hf_user_coupons
     *
     * @mbg.generated Mon Feb 10 20:33:43 CST 2020
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