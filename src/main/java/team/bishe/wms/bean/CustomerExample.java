package team.bishe.wms.bean;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
     */
    public CustomerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
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
     * This method corresponds to the database table customer
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
     * This method corresponds to the database table customer
     *
     * @mbggenerated Wed Apr 22 16:55:10 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
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
     * This class corresponds to the database table customer
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

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderIsNull() {
            addCriterion("customer_gender is null");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderIsNotNull() {
            addCriterion("customer_gender is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderEqualTo(String value) {
            addCriterion("customer_gender =", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderNotEqualTo(String value) {
            addCriterion("customer_gender <>", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderGreaterThan(String value) {
            addCriterion("customer_gender >", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderGreaterThanOrEqualTo(String value) {
            addCriterion("customer_gender >=", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderLessThan(String value) {
            addCriterion("customer_gender <", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderLessThanOrEqualTo(String value) {
            addCriterion("customer_gender <=", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderLike(String value) {
            addCriterion("customer_gender like", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderNotLike(String value) {
            addCriterion("customer_gender not like", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderIn(List<String> values) {
            addCriterion("customer_gender in", values, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderNotIn(List<String> values) {
            addCriterion("customer_gender not in", values, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderBetween(String value1, String value2) {
            addCriterion("customer_gender between", value1, value2, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderNotBetween(String value1, String value2) {
            addCriterion("customer_gender not between", value1, value2, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerIcidIsNull() {
            addCriterion("customer_icId is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIcidIsNotNull() {
            addCriterion("customer_icId is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIcidEqualTo(Integer value) {
            addCriterion("customer_icId =", value, "customerIcid");
            return (Criteria) this;
        }

        public Criteria andCustomerIcidNotEqualTo(Integer value) {
            addCriterion("customer_icId <>", value, "customerIcid");
            return (Criteria) this;
        }

        public Criteria andCustomerIcidGreaterThan(Integer value) {
            addCriterion("customer_icId >", value, "customerIcid");
            return (Criteria) this;
        }

        public Criteria andCustomerIcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_icId >=", value, "customerIcid");
            return (Criteria) this;
        }

        public Criteria andCustomerIcidLessThan(Integer value) {
            addCriterion("customer_icId <", value, "customerIcid");
            return (Criteria) this;
        }

        public Criteria andCustomerIcidLessThanOrEqualTo(Integer value) {
            addCriterion("customer_icId <=", value, "customerIcid");
            return (Criteria) this;
        }

        public Criteria andCustomerIcidIn(List<Integer> values) {
            addCriterion("customer_icId in", values, "customerIcid");
            return (Criteria) this;
        }

        public Criteria andCustomerIcidNotIn(List<Integer> values) {
            addCriterion("customer_icId not in", values, "customerIcid");
            return (Criteria) this;
        }

        public Criteria andCustomerIcidBetween(Integer value1, Integer value2) {
            addCriterion("customer_icId between", value1, value2, "customerIcid");
            return (Criteria) this;
        }

        public Criteria andCustomerIcidNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_icId not between", value1, value2, "customerIcid");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumberIsNull() {
            addCriterion("customer_telNumber is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumberIsNotNull() {
            addCriterion("customer_telNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumberEqualTo(Integer value) {
            addCriterion("customer_telNumber =", value, "customerTelnumber");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumberNotEqualTo(Integer value) {
            addCriterion("customer_telNumber <>", value, "customerTelnumber");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumberGreaterThan(Integer value) {
            addCriterion("customer_telNumber >", value, "customerTelnumber");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_telNumber >=", value, "customerTelnumber");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumberLessThan(Integer value) {
            addCriterion("customer_telNumber <", value, "customerTelnumber");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumberLessThanOrEqualTo(Integer value) {
            addCriterion("customer_telNumber <=", value, "customerTelnumber");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumberIn(List<Integer> values) {
            addCriterion("customer_telNumber in", values, "customerTelnumber");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumberNotIn(List<Integer> values) {
            addCriterion("customer_telNumber not in", values, "customerTelnumber");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumberBetween(Integer value1, Integer value2) {
            addCriterion("customer_telNumber between", value1, value2, "customerTelnumber");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_telNumber not between", value1, value2, "customerTelnumber");
            return (Criteria) this;
        }

        public Criteria andCustomerPhonenumberIsNull() {
            addCriterion("customer_phoneNumber is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhonenumberIsNotNull() {
            addCriterion("customer_phoneNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhonenumberEqualTo(Integer value) {
            addCriterion("customer_phoneNumber =", value, "customerPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCustomerPhonenumberNotEqualTo(Integer value) {
            addCriterion("customer_phoneNumber <>", value, "customerPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCustomerPhonenumberGreaterThan(Integer value) {
            addCriterion("customer_phoneNumber >", value, "customerPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCustomerPhonenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_phoneNumber >=", value, "customerPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCustomerPhonenumberLessThan(Integer value) {
            addCriterion("customer_phoneNumber <", value, "customerPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCustomerPhonenumberLessThanOrEqualTo(Integer value) {
            addCriterion("customer_phoneNumber <=", value, "customerPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCustomerPhonenumberIn(List<Integer> values) {
            addCriterion("customer_phoneNumber in", values, "customerPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCustomerPhonenumberNotIn(List<Integer> values) {
            addCriterion("customer_phoneNumber not in", values, "customerPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCustomerPhonenumberBetween(Integer value1, Integer value2) {
            addCriterion("customer_phoneNumber between", value1, value2, "customerPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCustomerPhonenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_phoneNumber not between", value1, value2, "customerPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIsNull() {
            addCriterion("customer_email is null");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIsNotNull() {
            addCriterion("customer_email is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailEqualTo(String value) {
            addCriterion("customer_email =", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotEqualTo(String value) {
            addCriterion("customer_email <>", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailGreaterThan(String value) {
            addCriterion("customer_email >", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("customer_email >=", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLessThan(String value) {
            addCriterion("customer_email <", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLessThanOrEqualTo(String value) {
            addCriterion("customer_email <=", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLike(String value) {
            addCriterion("customer_email like", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotLike(String value) {
            addCriterion("customer_email not like", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIn(List<String> values) {
            addCriterion("customer_email in", values, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotIn(List<String> values) {
            addCriterion("customer_email not in", values, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailBetween(String value1, String value2) {
            addCriterion("customer_email between", value1, value2, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotBetween(String value1, String value2) {
            addCriterion("customer_email not between", value1, value2, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIsNull() {
            addCriterion("customer_address is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIsNotNull() {
            addCriterion("customer_address is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressEqualTo(String value) {
            addCriterion("customer_address =", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotEqualTo(String value) {
            addCriterion("customer_address <>", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressGreaterThan(String value) {
            addCriterion("customer_address >", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("customer_address >=", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLessThan(String value) {
            addCriterion("customer_address <", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLessThanOrEqualTo(String value) {
            addCriterion("customer_address <=", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLike(String value) {
            addCriterion("customer_address like", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotLike(String value) {
            addCriterion("customer_address not like", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIn(List<String> values) {
            addCriterion("customer_address in", values, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotIn(List<String> values) {
            addCriterion("customer_address not in", values, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressBetween(String value1, String value2) {
            addCriterion("customer_address between", value1, value2, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotBetween(String value1, String value2) {
            addCriterion("customer_address not between", value1, value2, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerTipsIsNull() {
            addCriterion("customer_tips is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTipsIsNotNull() {
            addCriterion("customer_tips is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTipsEqualTo(String value) {
            addCriterion("customer_tips =", value, "customerTips");
            return (Criteria) this;
        }

        public Criteria andCustomerTipsNotEqualTo(String value) {
            addCriterion("customer_tips <>", value, "customerTips");
            return (Criteria) this;
        }

        public Criteria andCustomerTipsGreaterThan(String value) {
            addCriterion("customer_tips >", value, "customerTips");
            return (Criteria) this;
        }

        public Criteria andCustomerTipsGreaterThanOrEqualTo(String value) {
            addCriterion("customer_tips >=", value, "customerTips");
            return (Criteria) this;
        }

        public Criteria andCustomerTipsLessThan(String value) {
            addCriterion("customer_tips <", value, "customerTips");
            return (Criteria) this;
        }

        public Criteria andCustomerTipsLessThanOrEqualTo(String value) {
            addCriterion("customer_tips <=", value, "customerTips");
            return (Criteria) this;
        }

        public Criteria andCustomerTipsLike(String value) {
            addCriterion("customer_tips like", value, "customerTips");
            return (Criteria) this;
        }

        public Criteria andCustomerTipsNotLike(String value) {
            addCriterion("customer_tips not like", value, "customerTips");
            return (Criteria) this;
        }

        public Criteria andCustomerTipsIn(List<String> values) {
            addCriterion("customer_tips in", values, "customerTips");
            return (Criteria) this;
        }

        public Criteria andCustomerTipsNotIn(List<String> values) {
            addCriterion("customer_tips not in", values, "customerTips");
            return (Criteria) this;
        }

        public Criteria andCustomerTipsBetween(String value1, String value2) {
            addCriterion("customer_tips between", value1, value2, "customerTips");
            return (Criteria) this;
        }

        public Criteria andCustomerTipsNotBetween(String value1, String value2) {
            addCriterion("customer_tips not between", value1, value2, "customerTips");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIsNull() {
            addCriterion("customer_status is null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIsNotNull() {
            addCriterion("customer_status is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusEqualTo(String value) {
            addCriterion("customer_status =", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotEqualTo(String value) {
            addCriterion("customer_status <>", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusGreaterThan(String value) {
            addCriterion("customer_status >", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusGreaterThanOrEqualTo(String value) {
            addCriterion("customer_status >=", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLessThan(String value) {
            addCriterion("customer_status <", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLessThanOrEqualTo(String value) {
            addCriterion("customer_status <=", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLike(String value) {
            addCriterion("customer_status like", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotLike(String value) {
            addCriterion("customer_status not like", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIn(List<String> values) {
            addCriterion("customer_status in", values, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotIn(List<String> values) {
            addCriterion("customer_status not in", values, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusBetween(String value1, String value2) {
            addCriterion("customer_status between", value1, value2, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotBetween(String value1, String value2) {
            addCriterion("customer_status not between", value1, value2, "customerStatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table customer
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
     * This class corresponds to the database table customer
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