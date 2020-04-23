package team.bishe.wms.bean;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_w_goods_info
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_w_goods_info
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_w_goods_info
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_w_goods_info
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
     */
    public GoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_w_goods_info
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_w_goods_info
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_w_goods_info
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_w_goods_info
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_w_goods_info
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_w_goods_info
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_w_goods_info
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_w_goods_info
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
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
     * This method corresponds to the database table t_w_goods_info
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_w_goods_info
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_w_goods_info
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
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

        public Criteria andGoodIdIsNull() {
            addCriterion("good_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNotNull() {
            addCriterion("good_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodIdEqualTo(String value) {
            addCriterion("good_id =", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotEqualTo(String value) {
            addCriterion("good_id <>", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThan(String value) {
            addCriterion("good_id >", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThanOrEqualTo(String value) {
            addCriterion("good_id >=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThan(String value) {
            addCriterion("good_id <", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThanOrEqualTo(String value) {
            addCriterion("good_id <=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLike(String value) {
            addCriterion("good_id like", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotLike(String value) {
            addCriterion("good_id not like", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIn(List<String> values) {
            addCriterion("good_id in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotIn(List<String> values) {
            addCriterion("good_id not in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdBetween(String value1, String value2) {
            addCriterion("good_id between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotBetween(String value1, String value2) {
            addCriterion("good_id not between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodUserIdIsNull() {
            addCriterion("good_user_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodUserIdIsNotNull() {
            addCriterion("good_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodUserIdEqualTo(String value) {
            addCriterion("good_user_id =", value, "goodUserId");
            return (Criteria) this;
        }

        public Criteria andGoodUserIdNotEqualTo(String value) {
            addCriterion("good_user_id <>", value, "goodUserId");
            return (Criteria) this;
        }

        public Criteria andGoodUserIdGreaterThan(String value) {
            addCriterion("good_user_id >", value, "goodUserId");
            return (Criteria) this;
        }

        public Criteria andGoodUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("good_user_id >=", value, "goodUserId");
            return (Criteria) this;
        }

        public Criteria andGoodUserIdLessThan(String value) {
            addCriterion("good_user_id <", value, "goodUserId");
            return (Criteria) this;
        }

        public Criteria andGoodUserIdLessThanOrEqualTo(String value) {
            addCriterion("good_user_id <=", value, "goodUserId");
            return (Criteria) this;
        }

        public Criteria andGoodUserIdLike(String value) {
            addCriterion("good_user_id like", value, "goodUserId");
            return (Criteria) this;
        }

        public Criteria andGoodUserIdNotLike(String value) {
            addCriterion("good_user_id not like", value, "goodUserId");
            return (Criteria) this;
        }

        public Criteria andGoodUserIdIn(List<String> values) {
            addCriterion("good_user_id in", values, "goodUserId");
            return (Criteria) this;
        }

        public Criteria andGoodUserIdNotIn(List<String> values) {
            addCriterion("good_user_id not in", values, "goodUserId");
            return (Criteria) this;
        }

        public Criteria andGoodUserIdBetween(String value1, String value2) {
            addCriterion("good_user_id between", value1, value2, "goodUserId");
            return (Criteria) this;
        }

        public Criteria andGoodUserIdNotBetween(String value1, String value2) {
            addCriterion("good_user_id not between", value1, value2, "goodUserId");
            return (Criteria) this;
        }

        public Criteria andGoodNmIsNull() {
            addCriterion("good_nm is null");
            return (Criteria) this;
        }

        public Criteria andGoodNmIsNotNull() {
            addCriterion("good_nm is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNmEqualTo(String value) {
            addCriterion("good_nm =", value, "goodNm");
            return (Criteria) this;
        }

        public Criteria andGoodNmNotEqualTo(String value) {
            addCriterion("good_nm <>", value, "goodNm");
            return (Criteria) this;
        }

        public Criteria andGoodNmGreaterThan(String value) {
            addCriterion("good_nm >", value, "goodNm");
            return (Criteria) this;
        }

        public Criteria andGoodNmGreaterThanOrEqualTo(String value) {
            addCriterion("good_nm >=", value, "goodNm");
            return (Criteria) this;
        }

        public Criteria andGoodNmLessThan(String value) {
            addCriterion("good_nm <", value, "goodNm");
            return (Criteria) this;
        }

        public Criteria andGoodNmLessThanOrEqualTo(String value) {
            addCriterion("good_nm <=", value, "goodNm");
            return (Criteria) this;
        }

        public Criteria andGoodNmLike(String value) {
            addCriterion("good_nm like", value, "goodNm");
            return (Criteria) this;
        }

        public Criteria andGoodNmNotLike(String value) {
            addCriterion("good_nm not like", value, "goodNm");
            return (Criteria) this;
        }

        public Criteria andGoodNmIn(List<String> values) {
            addCriterion("good_nm in", values, "goodNm");
            return (Criteria) this;
        }

        public Criteria andGoodNmNotIn(List<String> values) {
            addCriterion("good_nm not in", values, "goodNm");
            return (Criteria) this;
        }

        public Criteria andGoodNmBetween(String value1, String value2) {
            addCriterion("good_nm between", value1, value2, "goodNm");
            return (Criteria) this;
        }

        public Criteria andGoodNmNotBetween(String value1, String value2) {
            addCriterion("good_nm not between", value1, value2, "goodNm");
            return (Criteria) this;
        }

        public Criteria andGoodUnitIsNull() {
            addCriterion("good_unit is null");
            return (Criteria) this;
        }

        public Criteria andGoodUnitIsNotNull() {
            addCriterion("good_unit is not null");
            return (Criteria) this;
        }

        public Criteria andGoodUnitEqualTo(String value) {
            addCriterion("good_unit =", value, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitNotEqualTo(String value) {
            addCriterion("good_unit <>", value, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitGreaterThan(String value) {
            addCriterion("good_unit >", value, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitGreaterThanOrEqualTo(String value) {
            addCriterion("good_unit >=", value, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitLessThan(String value) {
            addCriterion("good_unit <", value, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitLessThanOrEqualTo(String value) {
            addCriterion("good_unit <=", value, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitLike(String value) {
            addCriterion("good_unit like", value, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitNotLike(String value) {
            addCriterion("good_unit not like", value, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitIn(List<String> values) {
            addCriterion("good_unit in", values, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitNotIn(List<String> values) {
            addCriterion("good_unit not in", values, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitBetween(String value1, String value2) {
            addCriterion("good_unit between", value1, value2, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitNotBetween(String value1, String value2) {
            addCriterion("good_unit not between", value1, value2, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodSpecIsNull() {
            addCriterion("good_spec is null");
            return (Criteria) this;
        }

        public Criteria andGoodSpecIsNotNull() {
            addCriterion("good_spec is not null");
            return (Criteria) this;
        }

        public Criteria andGoodSpecEqualTo(String value) {
            addCriterion("good_spec =", value, "goodSpec");
            return (Criteria) this;
        }

        public Criteria andGoodSpecNotEqualTo(String value) {
            addCriterion("good_spec <>", value, "goodSpec");
            return (Criteria) this;
        }

        public Criteria andGoodSpecGreaterThan(String value) {
            addCriterion("good_spec >", value, "goodSpec");
            return (Criteria) this;
        }

        public Criteria andGoodSpecGreaterThanOrEqualTo(String value) {
            addCriterion("good_spec >=", value, "goodSpec");
            return (Criteria) this;
        }

        public Criteria andGoodSpecLessThan(String value) {
            addCriterion("good_spec <", value, "goodSpec");
            return (Criteria) this;
        }

        public Criteria andGoodSpecLessThanOrEqualTo(String value) {
            addCriterion("good_spec <=", value, "goodSpec");
            return (Criteria) this;
        }

        public Criteria andGoodSpecLike(String value) {
            addCriterion("good_spec like", value, "goodSpec");
            return (Criteria) this;
        }

        public Criteria andGoodSpecNotLike(String value) {
            addCriterion("good_spec not like", value, "goodSpec");
            return (Criteria) this;
        }

        public Criteria andGoodSpecIn(List<String> values) {
            addCriterion("good_spec in", values, "goodSpec");
            return (Criteria) this;
        }

        public Criteria andGoodSpecNotIn(List<String> values) {
            addCriterion("good_spec not in", values, "goodSpec");
            return (Criteria) this;
        }

        public Criteria andGoodSpecBetween(String value1, String value2) {
            addCriterion("good_spec between", value1, value2, "goodSpec");
            return (Criteria) this;
        }

        public Criteria andGoodSpecNotBetween(String value1, String value2) {
            addCriterion("good_spec not between", value1, value2, "goodSpec");
            return (Criteria) this;
        }

        public Criteria andGoodUserIsNull() {
            addCriterion("good_user is null");
            return (Criteria) this;
        }

        public Criteria andGoodUserIsNotNull() {
            addCriterion("good_user is not null");
            return (Criteria) this;
        }

        public Criteria andGoodUserEqualTo(String value) {
            addCriterion("good_user =", value, "goodUser");
            return (Criteria) this;
        }

        public Criteria andGoodUserNotEqualTo(String value) {
            addCriterion("good_user <>", value, "goodUser");
            return (Criteria) this;
        }

        public Criteria andGoodUserGreaterThan(String value) {
            addCriterion("good_user >", value, "goodUser");
            return (Criteria) this;
        }

        public Criteria andGoodUserGreaterThanOrEqualTo(String value) {
            addCriterion("good_user >=", value, "goodUser");
            return (Criteria) this;
        }

        public Criteria andGoodUserLessThan(String value) {
            addCriterion("good_user <", value, "goodUser");
            return (Criteria) this;
        }

        public Criteria andGoodUserLessThanOrEqualTo(String value) {
            addCriterion("good_user <=", value, "goodUser");
            return (Criteria) this;
        }

        public Criteria andGoodUserLike(String value) {
            addCriterion("good_user like", value, "goodUser");
            return (Criteria) this;
        }

        public Criteria andGoodUserNotLike(String value) {
            addCriterion("good_user not like", value, "goodUser");
            return (Criteria) this;
        }

        public Criteria andGoodUserIn(List<String> values) {
            addCriterion("good_user in", values, "goodUser");
            return (Criteria) this;
        }

        public Criteria andGoodUserNotIn(List<String> values) {
            addCriterion("good_user not in", values, "goodUser");
            return (Criteria) this;
        }

        public Criteria andGoodUserBetween(String value1, String value2) {
            addCriterion("good_user between", value1, value2, "goodUser");
            return (Criteria) this;
        }

        public Criteria andGoodUserNotBetween(String value1, String value2) {
            addCriterion("good_user not between", value1, value2, "goodUser");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andDateProductIsNull() {
            addCriterion("date_product is null");
            return (Criteria) this;
        }

        public Criteria andDateProductIsNotNull() {
            addCriterion("date_product is not null");
            return (Criteria) this;
        }

        public Criteria andDateProductEqualTo(String value) {
            addCriterion("date_product =", value, "dateProduct");
            return (Criteria) this;
        }

        public Criteria andDateProductNotEqualTo(String value) {
            addCriterion("date_product <>", value, "dateProduct");
            return (Criteria) this;
        }

        public Criteria andDateProductGreaterThan(String value) {
            addCriterion("date_product >", value, "dateProduct");
            return (Criteria) this;
        }

        public Criteria andDateProductGreaterThanOrEqualTo(String value) {
            addCriterion("date_product >=", value, "dateProduct");
            return (Criteria) this;
        }

        public Criteria andDateProductLessThan(String value) {
            addCriterion("date_product <", value, "dateProduct");
            return (Criteria) this;
        }

        public Criteria andDateProductLessThanOrEqualTo(String value) {
            addCriterion("date_product <=", value, "dateProduct");
            return (Criteria) this;
        }

        public Criteria andDateProductLike(String value) {
            addCriterion("date_product like", value, "dateProduct");
            return (Criteria) this;
        }

        public Criteria andDateProductNotLike(String value) {
            addCriterion("date_product not like", value, "dateProduct");
            return (Criteria) this;
        }

        public Criteria andDateProductIn(List<String> values) {
            addCriterion("date_product in", values, "dateProduct");
            return (Criteria) this;
        }

        public Criteria andDateProductNotIn(List<String> values) {
            addCriterion("date_product not in", values, "dateProduct");
            return (Criteria) this;
        }

        public Criteria andDateProductBetween(String value1, String value2) {
            addCriterion("date_product between", value1, value2, "dateProduct");
            return (Criteria) this;
        }

        public Criteria andDateProductNotBetween(String value1, String value2) {
            addCriterion("date_product not between", value1, value2, "dateProduct");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Integer value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Integer value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Integer value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Integer value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Integer value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Integer> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Integer> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Integer value1, Integer value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Integer value1, Integer value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_w_goods_info
     *
     * @mbggenerated do_not_delete_during_merge Wed Apr 22 16:55:10 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_w_goods_info
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
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