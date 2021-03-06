package com.yousoft.model.security;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSysmenuExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_sysmenu
     *
     * @mbggenerated Fri Jun 19 18:03:33 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_sysmenu
     *
     * @mbggenerated Fri Jun 19 18:03:33 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_sysmenu
     *
     * @mbggenerated Fri Jun 19 18:03:33 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysmenu
     *
     * @mbggenerated Fri Jun 19 18:03:33 CST 2015
     */
    public TSysmenuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysmenu
     *
     * @mbggenerated Fri Jun 19 18:03:33 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysmenu
     *
     * @mbggenerated Fri Jun 19 18:03:33 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysmenu
     *
     * @mbggenerated Fri Jun 19 18:03:33 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysmenu
     *
     * @mbggenerated Fri Jun 19 18:03:33 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysmenu
     *
     * @mbggenerated Fri Jun 19 18:03:33 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysmenu
     *
     * @mbggenerated Fri Jun 19 18:03:33 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysmenu
     *
     * @mbggenerated Fri Jun 19 18:03:33 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysmenu
     *
     * @mbggenerated Fri Jun 19 18:03:33 CST 2015
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
     * This method corresponds to the database table t_sysmenu
     *
     * @mbggenerated Fri Jun 19 18:03:33 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysmenu
     *
     * @mbggenerated Fri Jun 19 18:03:33 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_sysmenu
     *
     * @mbggenerated Fri Jun 19 18:03:33 CST 2015
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

        public Criteria andMenuidIsNull() {
            addCriterion("MENUID is null");
            return (Criteria) this;
        }

        public Criteria andMenuidIsNotNull() {
            addCriterion("MENUID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuidEqualTo(Integer value) {
            addCriterion("MENUID =", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotEqualTo(Integer value) {
            addCriterion("MENUID <>", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThan(Integer value) {
            addCriterion("MENUID >", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MENUID >=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThan(Integer value) {
            addCriterion("MENUID <", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThanOrEqualTo(Integer value) {
            addCriterion("MENUID <=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidIn(List<Integer> values) {
            addCriterion("MENUID in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotIn(List<Integer> values) {
            addCriterion("MENUID not in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidBetween(Integer value1, Integer value2) {
            addCriterion("MENUID between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("MENUID not between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNull() {
            addCriterion("MENUNAME is null");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNotNull() {
            addCriterion("MENUNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMenunameEqualTo(String value) {
            addCriterion("MENUNAME =", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotEqualTo(String value) {
            addCriterion("MENUNAME <>", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThan(String value) {
            addCriterion("MENUNAME >", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThanOrEqualTo(String value) {
            addCriterion("MENUNAME >=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThan(String value) {
            addCriterion("MENUNAME <", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThanOrEqualTo(String value) {
            addCriterion("MENUNAME <=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLike(String value) {
            addCriterion("MENUNAME like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotLike(String value) {
            addCriterion("MENUNAME not like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameIn(List<String> values) {
            addCriterion("MENUNAME in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotIn(List<String> values) {
            addCriterion("MENUNAME not in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameBetween(String value1, String value2) {
            addCriterion("MENUNAME between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotBetween(String value1, String value2) {
            addCriterion("MENUNAME not between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenuurlIsNull() {
            addCriterion("MENUURL is null");
            return (Criteria) this;
        }

        public Criteria andMenuurlIsNotNull() {
            addCriterion("MENUURL is not null");
            return (Criteria) this;
        }

        public Criteria andMenuurlEqualTo(String value) {
            addCriterion("MENUURL =", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotEqualTo(String value) {
            addCriterion("MENUURL <>", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlGreaterThan(String value) {
            addCriterion("MENUURL >", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlGreaterThanOrEqualTo(String value) {
            addCriterion("MENUURL >=", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLessThan(String value) {
            addCriterion("MENUURL <", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLessThanOrEqualTo(String value) {
            addCriterion("MENUURL <=", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLike(String value) {
            addCriterion("MENUURL like", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotLike(String value) {
            addCriterion("MENUURL not like", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlIn(List<String> values) {
            addCriterion("MENUURL in", values, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotIn(List<String> values) {
            addCriterion("MENUURL not in", values, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlBetween(String value1, String value2) {
            addCriterion("MENUURL between", value1, value2, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotBetween(String value1, String value2) {
            addCriterion("MENUURL not between", value1, value2, "menuurl");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("ICON is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("ICON is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("ICON =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("ICON <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("ICON >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("ICON >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("ICON <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("ICON <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("ICON like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("ICON not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("ICON in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("ICON not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("ICON between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("ICON not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andUppermenuidIsNull() {
            addCriterion("UPPERMENUID is null");
            return (Criteria) this;
        }

        public Criteria andUppermenuidIsNotNull() {
            addCriterion("UPPERMENUID is not null");
            return (Criteria) this;
        }

        public Criteria andUppermenuidEqualTo(Integer value) {
            addCriterion("UPPERMENUID =", value, "uppermenuid");
            return (Criteria) this;
        }

        public Criteria andUppermenuidNotEqualTo(Integer value) {
            addCriterion("UPPERMENUID <>", value, "uppermenuid");
            return (Criteria) this;
        }

        public Criteria andUppermenuidGreaterThan(Integer value) {
            addCriterion("UPPERMENUID >", value, "uppermenuid");
            return (Criteria) this;
        }

        public Criteria andUppermenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPPERMENUID >=", value, "uppermenuid");
            return (Criteria) this;
        }

        public Criteria andUppermenuidLessThan(Integer value) {
            addCriterion("UPPERMENUID <", value, "uppermenuid");
            return (Criteria) this;
        }

        public Criteria andUppermenuidLessThanOrEqualTo(Integer value) {
            addCriterion("UPPERMENUID <=", value, "uppermenuid");
            return (Criteria) this;
        }

        public Criteria andUppermenuidIn(List<Integer> values) {
            addCriterion("UPPERMENUID in", values, "uppermenuid");
            return (Criteria) this;
        }

        public Criteria andUppermenuidNotIn(List<Integer> values) {
            addCriterion("UPPERMENUID not in", values, "uppermenuid");
            return (Criteria) this;
        }

        public Criteria andUppermenuidBetween(Integer value1, Integer value2) {
            addCriterion("UPPERMENUID between", value1, value2, "uppermenuid");
            return (Criteria) this;
        }

        public Criteria andUppermenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("UPPERMENUID not between", value1, value2, "uppermenuid");
            return (Criteria) this;
        }

        public Criteria andMenuidxIsNull() {
            addCriterion("MENUIDX is null");
            return (Criteria) this;
        }

        public Criteria andMenuidxIsNotNull() {
            addCriterion("MENUIDX is not null");
            return (Criteria) this;
        }

        public Criteria andMenuidxEqualTo(Integer value) {
            addCriterion("MENUIDX =", value, "menuidx");
            return (Criteria) this;
        }

        public Criteria andMenuidxNotEqualTo(Integer value) {
            addCriterion("MENUIDX <>", value, "menuidx");
            return (Criteria) this;
        }

        public Criteria andMenuidxGreaterThan(Integer value) {
            addCriterion("MENUIDX >", value, "menuidx");
            return (Criteria) this;
        }

        public Criteria andMenuidxGreaterThanOrEqualTo(Integer value) {
            addCriterion("MENUIDX >=", value, "menuidx");
            return (Criteria) this;
        }

        public Criteria andMenuidxLessThan(Integer value) {
            addCriterion("MENUIDX <", value, "menuidx");
            return (Criteria) this;
        }

        public Criteria andMenuidxLessThanOrEqualTo(Integer value) {
            addCriterion("MENUIDX <=", value, "menuidx");
            return (Criteria) this;
        }

        public Criteria andMenuidxIn(List<Integer> values) {
            addCriterion("MENUIDX in", values, "menuidx");
            return (Criteria) this;
        }

        public Criteria andMenuidxNotIn(List<Integer> values) {
            addCriterion("MENUIDX not in", values, "menuidx");
            return (Criteria) this;
        }

        public Criteria andMenuidxBetween(Integer value1, Integer value2) {
            addCriterion("MENUIDX between", value1, value2, "menuidx");
            return (Criteria) this;
        }

        public Criteria andMenuidxNotBetween(Integer value1, Integer value2) {
            addCriterion("MENUIDX not between", value1, value2, "menuidx");
            return (Criteria) this;
        }

        public Criteria andColumn1IsNull() {
            addCriterion("COLUMN1 is null");
            return (Criteria) this;
        }

        public Criteria andColumn1IsNotNull() {
            addCriterion("COLUMN1 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn1EqualTo(String value) {
            addCriterion("COLUMN1 =", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotEqualTo(String value) {
            addCriterion("COLUMN1 <>", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1GreaterThan(String value) {
            addCriterion("COLUMN1 >", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1GreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN1 >=", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1LessThan(String value) {
            addCriterion("COLUMN1 <", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1LessThanOrEqualTo(String value) {
            addCriterion("COLUMN1 <=", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1Like(String value) {
            addCriterion("COLUMN1 like", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotLike(String value) {
            addCriterion("COLUMN1 not like", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1In(List<String> values) {
            addCriterion("COLUMN1 in", values, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotIn(List<String> values) {
            addCriterion("COLUMN1 not in", values, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1Between(String value1, String value2) {
            addCriterion("COLUMN1 between", value1, value2, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotBetween(String value1, String value2) {
            addCriterion("COLUMN1 not between", value1, value2, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn2IsNull() {
            addCriterion("COLUMN2 is null");
            return (Criteria) this;
        }

        public Criteria andColumn2IsNotNull() {
            addCriterion("COLUMN2 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn2EqualTo(String value) {
            addCriterion("COLUMN2 =", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotEqualTo(String value) {
            addCriterion("COLUMN2 <>", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2GreaterThan(String value) {
            addCriterion("COLUMN2 >", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2GreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN2 >=", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2LessThan(String value) {
            addCriterion("COLUMN2 <", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2LessThanOrEqualTo(String value) {
            addCriterion("COLUMN2 <=", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2Like(String value) {
            addCriterion("COLUMN2 like", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotLike(String value) {
            addCriterion("COLUMN2 not like", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2In(List<String> values) {
            addCriterion("COLUMN2 in", values, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotIn(List<String> values) {
            addCriterion("COLUMN2 not in", values, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2Between(String value1, String value2) {
            addCriterion("COLUMN2 between", value1, value2, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotBetween(String value1, String value2) {
            addCriterion("COLUMN2 not between", value1, value2, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn3IsNull() {
            addCriterion("COLUMN3 is null");
            return (Criteria) this;
        }

        public Criteria andColumn3IsNotNull() {
            addCriterion("COLUMN3 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn3EqualTo(String value) {
            addCriterion("COLUMN3 =", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3NotEqualTo(String value) {
            addCriterion("COLUMN3 <>", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3GreaterThan(String value) {
            addCriterion("COLUMN3 >", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3GreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN3 >=", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3LessThan(String value) {
            addCriterion("COLUMN3 <", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3LessThanOrEqualTo(String value) {
            addCriterion("COLUMN3 <=", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3Like(String value) {
            addCriterion("COLUMN3 like", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3NotLike(String value) {
            addCriterion("COLUMN3 not like", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3In(List<String> values) {
            addCriterion("COLUMN3 in", values, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3NotIn(List<String> values) {
            addCriterion("COLUMN3 not in", values, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3Between(String value1, String value2) {
            addCriterion("COLUMN3 between", value1, value2, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3NotBetween(String value1, String value2) {
            addCriterion("COLUMN3 not between", value1, value2, "column3");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNull() {
            addCriterion("CREATEUSER is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNotNull() {
            addCriterion("CREATEUSER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserEqualTo(Long value) {
            addCriterion("CREATEUSER =", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotEqualTo(Long value) {
            addCriterion("CREATEUSER <>", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThan(Long value) {
            addCriterion("CREATEUSER >", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATEUSER >=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThan(Long value) {
            addCriterion("CREATEUSER <", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThanOrEqualTo(Long value) {
            addCriterion("CREATEUSER <=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserIn(List<Long> values) {
            addCriterion("CREATEUSER in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotIn(List<Long> values) {
            addCriterion("CREATEUSER not in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserBetween(Long value1, Long value2) {
            addCriterion("CREATEUSER between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotBetween(Long value1, Long value2) {
            addCriterion("CREATEUSER not between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatercodeIsNull() {
            addCriterion("UPDATERCODE is null");
            return (Criteria) this;
        }

        public Criteria andUpdatercodeIsNotNull() {
            addCriterion("UPDATERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatercodeEqualTo(Long value) {
            addCriterion("UPDATERCODE =", value, "updatercode");
            return (Criteria) this;
        }

        public Criteria andUpdatercodeNotEqualTo(Long value) {
            addCriterion("UPDATERCODE <>", value, "updatercode");
            return (Criteria) this;
        }

        public Criteria andUpdatercodeGreaterThan(Long value) {
            addCriterion("UPDATERCODE >", value, "updatercode");
            return (Criteria) this;
        }

        public Criteria andUpdatercodeGreaterThanOrEqualTo(Long value) {
            addCriterion("UPDATERCODE >=", value, "updatercode");
            return (Criteria) this;
        }

        public Criteria andUpdatercodeLessThan(Long value) {
            addCriterion("UPDATERCODE <", value, "updatercode");
            return (Criteria) this;
        }

        public Criteria andUpdatercodeLessThanOrEqualTo(Long value) {
            addCriterion("UPDATERCODE <=", value, "updatercode");
            return (Criteria) this;
        }

        public Criteria andUpdatercodeIn(List<Long> values) {
            addCriterion("UPDATERCODE in", values, "updatercode");
            return (Criteria) this;
        }

        public Criteria andUpdatercodeNotIn(List<Long> values) {
            addCriterion("UPDATERCODE not in", values, "updatercode");
            return (Criteria) this;
        }

        public Criteria andUpdatercodeBetween(Long value1, Long value2) {
            addCriterion("UPDATERCODE between", value1, value2, "updatercode");
            return (Criteria) this;
        }

        public Criteria andUpdatercodeNotBetween(Long value1, Long value2) {
            addCriterion("UPDATERCODE not between", value1, value2, "updatercode");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("MODIFYTIME is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("MODIFYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(Date value) {
            addCriterion("MODIFYTIME =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(Date value) {
            addCriterion("MODIFYTIME <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(Date value) {
            addCriterion("MODIFYTIME >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFYTIME >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(Date value) {
            addCriterion("MODIFYTIME <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFYTIME <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<Date> values) {
            addCriterion("MODIFYTIME in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<Date> values) {
            addCriterion("MODIFYTIME not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(Date value1, Date value2) {
            addCriterion("MODIFYTIME between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFYTIME not between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("VALID is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("VALID is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(Byte value) {
            addCriterion("VALID =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(Byte value) {
            addCriterion("VALID <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(Byte value) {
            addCriterion("VALID >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(Byte value) {
            addCriterion("VALID >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(Byte value) {
            addCriterion("VALID <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(Byte value) {
            addCriterion("VALID <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<Byte> values) {
            addCriterion("VALID in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<Byte> values) {
            addCriterion("VALID not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(Byte value1, Byte value2) {
            addCriterion("VALID between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(Byte value1, Byte value2) {
            addCriterion("VALID not between", value1, value2, "valid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_sysmenu
     *
     * @mbggenerated do_not_delete_during_merge Fri Jun 19 18:03:33 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_sysmenu
     *
     * @mbggenerated Fri Jun 19 18:03:33 CST 2015
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