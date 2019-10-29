package com.hanfu.order.center.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HfOrdersExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hf_orders
     *
     * @mbg.generated Wed Oct 30 06:11:45 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hf_orders
     *
     * @mbg.generated Wed Oct 30 06:11:45 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hf_orders
     *
     * @mbg.generated Wed Oct 30 06:11:45 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_orders
     *
     * @mbg.generated Wed Oct 30 06:11:45 CST 2019
     */
    public HfOrdersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_orders
     *
     * @mbg.generated Wed Oct 30 06:11:45 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_orders
     *
     * @mbg.generated Wed Oct 30 06:11:45 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_orders
     *
     * @mbg.generated Wed Oct 30 06:11:45 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_orders
     *
     * @mbg.generated Wed Oct 30 06:11:45 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_orders
     *
     * @mbg.generated Wed Oct 30 06:11:45 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_orders
     *
     * @mbg.generated Wed Oct 30 06:11:45 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_orders
     *
     * @mbg.generated Wed Oct 30 06:11:45 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_orders
     *
     * @mbg.generated Wed Oct 30 06:11:45 CST 2019
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
     * This method corresponds to the database table hf_orders
     *
     * @mbg.generated Wed Oct 30 06:11:45 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_orders
     *
     * @mbg.generated Wed Oct 30 06:11:45 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hf_orders
     *
     * @mbg.generated Wed Oct 30 06:11:45 CST 2019
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

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Integer value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Integer value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Integer value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Integer value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Integer> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Integer> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Integer value1, Integer value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("order_type like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("order_type not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andPayMethodTypeIsNull() {
            addCriterion("pay_method_type is null");
            return (Criteria) this;
        }

        public Criteria andPayMethodTypeIsNotNull() {
            addCriterion("pay_method_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayMethodTypeEqualTo(Integer value) {
            addCriterion("pay_method_type =", value, "payMethodType");
            return (Criteria) this;
        }

        public Criteria andPayMethodTypeNotEqualTo(Integer value) {
            addCriterion("pay_method_type <>", value, "payMethodType");
            return (Criteria) this;
        }

        public Criteria andPayMethodTypeGreaterThan(Integer value) {
            addCriterion("pay_method_type >", value, "payMethodType");
            return (Criteria) this;
        }

        public Criteria andPayMethodTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_method_type >=", value, "payMethodType");
            return (Criteria) this;
        }

        public Criteria andPayMethodTypeLessThan(Integer value) {
            addCriterion("pay_method_type <", value, "payMethodType");
            return (Criteria) this;
        }

        public Criteria andPayMethodTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_method_type <=", value, "payMethodType");
            return (Criteria) this;
        }

        public Criteria andPayMethodTypeIn(List<Integer> values) {
            addCriterion("pay_method_type in", values, "payMethodType");
            return (Criteria) this;
        }

        public Criteria andPayMethodTypeNotIn(List<Integer> values) {
            addCriterion("pay_method_type not in", values, "payMethodType");
            return (Criteria) this;
        }

        public Criteria andPayMethodTypeBetween(Integer value1, Integer value2) {
            addCriterion("pay_method_type between", value1, value2, "payMethodType");
            return (Criteria) this;
        }

        public Criteria andPayMethodTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_method_type not between", value1, value2, "payMethodType");
            return (Criteria) this;
        }

        public Criteria andHfMemoIsNull() {
            addCriterion("hf_memo is null");
            return (Criteria) this;
        }

        public Criteria andHfMemoIsNotNull() {
            addCriterion("hf_memo is not null");
            return (Criteria) this;
        }

        public Criteria andHfMemoEqualTo(String value) {
            addCriterion("hf_memo =", value, "hfMemo");
            return (Criteria) this;
        }

        public Criteria andHfMemoNotEqualTo(String value) {
            addCriterion("hf_memo <>", value, "hfMemo");
            return (Criteria) this;
        }

        public Criteria andHfMemoGreaterThan(String value) {
            addCriterion("hf_memo >", value, "hfMemo");
            return (Criteria) this;
        }

        public Criteria andHfMemoGreaterThanOrEqualTo(String value) {
            addCriterion("hf_memo >=", value, "hfMemo");
            return (Criteria) this;
        }

        public Criteria andHfMemoLessThan(String value) {
            addCriterion("hf_memo <", value, "hfMemo");
            return (Criteria) this;
        }

        public Criteria andHfMemoLessThanOrEqualTo(String value) {
            addCriterion("hf_memo <=", value, "hfMemo");
            return (Criteria) this;
        }

        public Criteria andHfMemoLike(String value) {
            addCriterion("hf_memo like", value, "hfMemo");
            return (Criteria) this;
        }

        public Criteria andHfMemoNotLike(String value) {
            addCriterion("hf_memo not like", value, "hfMemo");
            return (Criteria) this;
        }

        public Criteria andHfMemoIn(List<String> values) {
            addCriterion("hf_memo in", values, "hfMemo");
            return (Criteria) this;
        }

        public Criteria andHfMemoNotIn(List<String> values) {
            addCriterion("hf_memo not in", values, "hfMemo");
            return (Criteria) this;
        }

        public Criteria andHfMemoBetween(String value1, String value2) {
            addCriterion("hf_memo between", value1, value2, "hfMemo");
            return (Criteria) this;
        }

        public Criteria andHfMemoNotBetween(String value1, String value2) {
            addCriterion("hf_memo not between", value1, value2, "hfMemo");
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

        public Criteria andPayMethodNameIsNull() {
            addCriterion("pay_method_name is null");
            return (Criteria) this;
        }

        public Criteria andPayMethodNameIsNotNull() {
            addCriterion("pay_method_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayMethodNameEqualTo(String value) {
            addCriterion("pay_method_name =", value, "payMethodName");
            return (Criteria) this;
        }

        public Criteria andPayMethodNameNotEqualTo(String value) {
            addCriterion("pay_method_name <>", value, "payMethodName");
            return (Criteria) this;
        }

        public Criteria andPayMethodNameGreaterThan(String value) {
            addCriterion("pay_method_name >", value, "payMethodName");
            return (Criteria) this;
        }

        public Criteria andPayMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("pay_method_name >=", value, "payMethodName");
            return (Criteria) this;
        }

        public Criteria andPayMethodNameLessThan(String value) {
            addCriterion("pay_method_name <", value, "payMethodName");
            return (Criteria) this;
        }

        public Criteria andPayMethodNameLessThanOrEqualTo(String value) {
            addCriterion("pay_method_name <=", value, "payMethodName");
            return (Criteria) this;
        }

        public Criteria andPayMethodNameLike(String value) {
            addCriterion("pay_method_name like", value, "payMethodName");
            return (Criteria) this;
        }

        public Criteria andPayMethodNameNotLike(String value) {
            addCriterion("pay_method_name not like", value, "payMethodName");
            return (Criteria) this;
        }

        public Criteria andPayMethodNameIn(List<String> values) {
            addCriterion("pay_method_name in", values, "payMethodName");
            return (Criteria) this;
        }

        public Criteria andPayMethodNameNotIn(List<String> values) {
            addCriterion("pay_method_name not in", values, "payMethodName");
            return (Criteria) this;
        }

        public Criteria andPayMethodNameBetween(String value1, String value2) {
            addCriterion("pay_method_name between", value1, value2, "payMethodName");
            return (Criteria) this;
        }

        public Criteria andPayMethodNameNotBetween(String value1, String value2) {
            addCriterion("pay_method_name not between", value1, value2, "payMethodName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(LocalDateTime value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(LocalDateTime value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(LocalDateTime value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<LocalDateTime> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(LocalDateTime value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(LocalDateTime value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(LocalDateTime value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(LocalDateTime value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<LocalDateTime> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<LocalDateTime> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifierIsNull() {
            addCriterion("last_modifier is null");
            return (Criteria) this;
        }

        public Criteria andLastModifierIsNotNull() {
            addCriterion("last_modifier is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifierEqualTo(String value) {
            addCriterion("last_modifier =", value, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierNotEqualTo(String value) {
            addCriterion("last_modifier <>", value, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierGreaterThan(String value) {
            addCriterion("last_modifier >", value, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierGreaterThanOrEqualTo(String value) {
            addCriterion("last_modifier >=", value, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierLessThan(String value) {
            addCriterion("last_modifier <", value, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierLessThanOrEqualTo(String value) {
            addCriterion("last_modifier <=", value, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierLike(String value) {
            addCriterion("last_modifier like", value, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierNotLike(String value) {
            addCriterion("last_modifier not like", value, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierIn(List<String> values) {
            addCriterion("last_modifier in", values, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierNotIn(List<String> values) {
            addCriterion("last_modifier not in", values, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierBetween(String value1, String value2) {
            addCriterion("last_modifier between", value1, value2, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierNotBetween(String value1, String value2) {
            addCriterion("last_modifier not between", value1, value2, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Short value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Short value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Short value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Short value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Short value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Short value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Short> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Short> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Short value1, Short value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Short value1, Short value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hf_orders
     *
     * @mbg.generated do_not_delete_during_merge Wed Oct 30 06:11:45 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hf_orders
     *
     * @mbg.generated Wed Oct 30 06:11:45 CST 2019
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