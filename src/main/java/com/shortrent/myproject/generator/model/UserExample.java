package com.shortrent.myproject.generator.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUsrIdIsNull() {
            addCriterion("usr_id is null");
            return (Criteria) this;
        }

        public Criteria andUsrIdIsNotNull() {
            addCriterion("usr_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsrIdEqualTo(Integer value) {
            addCriterion("usr_id =", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotEqualTo(Integer value) {
            addCriterion("usr_id <>", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdGreaterThan(Integer value) {
            addCriterion("usr_id >", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("usr_id >=", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdLessThan(Integer value) {
            addCriterion("usr_id <", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdLessThanOrEqualTo(Integer value) {
            addCriterion("usr_id <=", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdIn(List<Integer> values) {
            addCriterion("usr_id in", values, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotIn(List<Integer> values) {
            addCriterion("usr_id not in", values, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdBetween(Integer value1, Integer value2) {
            addCriterion("usr_id between", value1, value2, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("usr_id not between", value1, value2, "usrId");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(BigInteger value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(BigInteger value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(BigInteger value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(BigInteger value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(BigInteger value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(BigInteger value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<BigInteger> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<BigInteger> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(BigInteger value1, BigInteger value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(BigInteger value1, BigInteger value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordIsNull() {
            addCriterion("usr_password is null");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordIsNotNull() {
            addCriterion("usr_password is not null");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordEqualTo(String value) {
            addCriterion("usr_password =", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotEqualTo(String value) {
            addCriterion("usr_password <>", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordGreaterThan(String value) {
            addCriterion("usr_password >", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("usr_password >=", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordLessThan(String value) {
            addCriterion("usr_password <", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordLessThanOrEqualTo(String value) {
            addCriterion("usr_password <=", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordLike(String value) {
            addCriterion("usr_password like", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotLike(String value) {
            addCriterion("usr_password not like", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordIn(List<String> values) {
            addCriterion("usr_password in", values, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotIn(List<String> values) {
            addCriterion("usr_password not in", values, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordBetween(String value1, String value2) {
            addCriterion("usr_password between", value1, value2, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotBetween(String value1, String value2) {
            addCriterion("usr_password not between", value1, value2, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUserMailIsNull() {
            addCriterion("user_mail is null");
            return (Criteria) this;
        }

        public Criteria andUserMailIsNotNull() {
            addCriterion("user_mail is not null");
            return (Criteria) this;
        }

        public Criteria andUserMailEqualTo(String value) {
            addCriterion("user_mail =", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotEqualTo(String value) {
            addCriterion("user_mail <>", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailGreaterThan(String value) {
            addCriterion("user_mail >", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailGreaterThanOrEqualTo(String value) {
            addCriterion("user_mail >=", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailLessThan(String value) {
            addCriterion("user_mail <", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailLessThanOrEqualTo(String value) {
            addCriterion("user_mail <=", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailLike(String value) {
            addCriterion("user_mail like", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotLike(String value) {
            addCriterion("user_mail not like", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailIn(List<String> values) {
            addCriterion("user_mail in", values, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotIn(List<String> values) {
            addCriterion("user_mail not in", values, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailBetween(String value1, String value2) {
            addCriterion("user_mail between", value1, value2, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotBetween(String value1, String value2) {
            addCriterion("user_mail not between", value1, value2, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("user_sex like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("user_sex not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNull() {
            addCriterion("user_state is null");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNotNull() {
            addCriterion("user_state is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateEqualTo(String value) {
            addCriterion("user_state =", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotEqualTo(String value) {
            addCriterion("user_state <>", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThan(String value) {
            addCriterion("user_state >", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThanOrEqualTo(String value) {
            addCriterion("user_state >=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThan(String value) {
            addCriterion("user_state <", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThanOrEqualTo(String value) {
            addCriterion("user_state <=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLike(String value) {
            addCriterion("user_state like", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotLike(String value) {
            addCriterion("user_state not like", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateIn(List<String> values) {
            addCriterion("user_state in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotIn(List<String> values) {
            addCriterion("user_state not in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateBetween(String value1, String value2) {
            addCriterion("user_state between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotBetween(String value1, String value2) {
            addCriterion("user_state not between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNull() {
            addCriterion("user_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNotNull() {
            addCriterion("user_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthday =", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthday <>", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("user_birthday >", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthday >=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("user_birthday <", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthday <=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("user_birthday in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_birthday not in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_birthday between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_birthday not between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeIsNull() {
            addCriterion("user_certificate_type is null");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeIsNotNull() {
            addCriterion("user_certificate_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeEqualTo(String value) {
            addCriterion("user_certificate_type =", value, "userCertificateType");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeNotEqualTo(String value) {
            addCriterion("user_certificate_type <>", value, "userCertificateType");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeGreaterThan(String value) {
            addCriterion("user_certificate_type >", value, "userCertificateType");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_certificate_type >=", value, "userCertificateType");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeLessThan(String value) {
            addCriterion("user_certificate_type <", value, "userCertificateType");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeLessThanOrEqualTo(String value) {
            addCriterion("user_certificate_type <=", value, "userCertificateType");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeLike(String value) {
            addCriterion("user_certificate_type like", value, "userCertificateType");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeNotLike(String value) {
            addCriterion("user_certificate_type not like", value, "userCertificateType");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeIn(List<String> values) {
            addCriterion("user_certificate_type in", values, "userCertificateType");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeNotIn(List<String> values) {
            addCriterion("user_certificate_type not in", values, "userCertificateType");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeBetween(String value1, String value2) {
            addCriterion("user_certificate_type between", value1, value2, "userCertificateType");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeNotBetween(String value1, String value2) {
            addCriterion("user_certificate_type not between", value1, value2, "userCertificateType");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberIsNull() {
            addCriterion("user_id_number is null");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberIsNotNull() {
            addCriterion("user_id_number is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberEqualTo(Integer value) {
            addCriterion("user_id_number =", value, "userIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberNotEqualTo(Integer value) {
            addCriterion("user_id_number <>", value, "userIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberGreaterThan(Integer value) {
            addCriterion("user_id_number >", value, "userIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id_number >=", value, "userIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberLessThan(Integer value) {
            addCriterion("user_id_number <", value, "userIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberLessThanOrEqualTo(Integer value) {
            addCriterion("user_id_number <=", value, "userIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberIn(List<Integer> values) {
            addCriterion("user_id_number in", values, "userIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberNotIn(List<Integer> values) {
            addCriterion("user_id_number not in", values, "userIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberBetween(Integer value1, Integer value2) {
            addCriterion("user_id_number between", value1, value2, "userIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id_number not between", value1, value2, "userIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserEducationIsNull() {
            addCriterion("user_education is null");
            return (Criteria) this;
        }

        public Criteria andUserEducationIsNotNull() {
            addCriterion("user_education is not null");
            return (Criteria) this;
        }

        public Criteria andUserEducationEqualTo(String value) {
            addCriterion("user_education =", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationNotEqualTo(String value) {
            addCriterion("user_education <>", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationGreaterThan(String value) {
            addCriterion("user_education >", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationGreaterThanOrEqualTo(String value) {
            addCriterion("user_education >=", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationLessThan(String value) {
            addCriterion("user_education <", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationLessThanOrEqualTo(String value) {
            addCriterion("user_education <=", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationLike(String value) {
            addCriterion("user_education like", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationNotLike(String value) {
            addCriterion("user_education not like", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationIn(List<String> values) {
            addCriterion("user_education in", values, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationNotIn(List<String> values) {
            addCriterion("user_education not in", values, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationBetween(String value1, String value2) {
            addCriterion("user_education between", value1, value2, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationNotBetween(String value1, String value2) {
            addCriterion("user_education not between", value1, value2, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserWorkIsNull() {
            addCriterion("user_work is null");
            return (Criteria) this;
        }

        public Criteria andUserWorkIsNotNull() {
            addCriterion("user_work is not null");
            return (Criteria) this;
        }

        public Criteria andUserWorkEqualTo(String value) {
            addCriterion("user_work =", value, "userWork");
            return (Criteria) this;
        }

        public Criteria andUserWorkNotEqualTo(String value) {
            addCriterion("user_work <>", value, "userWork");
            return (Criteria) this;
        }

        public Criteria andUserWorkGreaterThan(String value) {
            addCriterion("user_work >", value, "userWork");
            return (Criteria) this;
        }

        public Criteria andUserWorkGreaterThanOrEqualTo(String value) {
            addCriterion("user_work >=", value, "userWork");
            return (Criteria) this;
        }

        public Criteria andUserWorkLessThan(String value) {
            addCriterion("user_work <", value, "userWork");
            return (Criteria) this;
        }

        public Criteria andUserWorkLessThanOrEqualTo(String value) {
            addCriterion("user_work <=", value, "userWork");
            return (Criteria) this;
        }

        public Criteria andUserWorkLike(String value) {
            addCriterion("user_work like", value, "userWork");
            return (Criteria) this;
        }

        public Criteria andUserWorkNotLike(String value) {
            addCriterion("user_work not like", value, "userWork");
            return (Criteria) this;
        }

        public Criteria andUserWorkIn(List<String> values) {
            addCriterion("user_work in", values, "userWork");
            return (Criteria) this;
        }

        public Criteria andUserWorkNotIn(List<String> values) {
            addCriterion("user_work not in", values, "userWork");
            return (Criteria) this;
        }

        public Criteria andUserWorkBetween(String value1, String value2) {
            addCriterion("user_work between", value1, value2, "userWork");
            return (Criteria) this;
        }

        public Criteria andUserWorkNotBetween(String value1, String value2) {
            addCriterion("user_work not between", value1, value2, "userWork");
            return (Criteria) this;
        }

        public Criteria andUserAreaIsNull() {
            addCriterion("user_area is null");
            return (Criteria) this;
        }

        public Criteria andUserAreaIsNotNull() {
            addCriterion("user_area is not null");
            return (Criteria) this;
        }

        public Criteria andUserAreaEqualTo(String value) {
            addCriterion("user_area =", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaNotEqualTo(String value) {
            addCriterion("user_area <>", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaGreaterThan(String value) {
            addCriterion("user_area >", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaGreaterThanOrEqualTo(String value) {
            addCriterion("user_area >=", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaLessThan(String value) {
            addCriterion("user_area <", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaLessThanOrEqualTo(String value) {
            addCriterion("user_area <=", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaLike(String value) {
            addCriterion("user_area like", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaNotLike(String value) {
            addCriterion("user_area not like", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaIn(List<String> values) {
            addCriterion("user_area in", values, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaNotIn(List<String> values) {
            addCriterion("user_area not in", values, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaBetween(String value1, String value2) {
            addCriterion("user_area between", value1, value2, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaNotBetween(String value1, String value2) {
            addCriterion("user_area not between", value1, value2, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserImageIsNull() {
            addCriterion("user_image is null");
            return (Criteria) this;
        }

        public Criteria andUserImageIsNotNull() {
            addCriterion("user_image is not null");
            return (Criteria) this;
        }

        public Criteria andUserImageEqualTo(String value) {
            addCriterion("user_image =", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageNotEqualTo(String value) {
            addCriterion("user_image <>", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageGreaterThan(String value) {
            addCriterion("user_image >", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageGreaterThanOrEqualTo(String value) {
            addCriterion("user_image >=", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageLessThan(String value) {
            addCriterion("user_image <", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageLessThanOrEqualTo(String value) {
            addCriterion("user_image <=", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageLike(String value) {
            addCriterion("user_image like", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageNotLike(String value) {
            addCriterion("user_image not like", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageIn(List<String> values) {
            addCriterion("user_image in", values, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageNotIn(List<String> values) {
            addCriterion("user_image not in", values, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageBetween(String value1, String value2) {
            addCriterion("user_image between", value1, value2, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageNotBetween(String value1, String value2) {
            addCriterion("user_image not between", value1, value2, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserFavoritesIsNull() {
            addCriterion("user_favorites is null");
            return (Criteria) this;
        }

        public Criteria andUserFavoritesIsNotNull() {
            addCriterion("user_favorites is not null");
            return (Criteria) this;
        }

        public Criteria andUserFavoritesEqualTo(String value) {
            addCriterion("user_favorites =", value, "userFavorites");
            return (Criteria) this;
        }

        public Criteria andUserFavoritesNotEqualTo(String value) {
            addCriterion("user_favorites <>", value, "userFavorites");
            return (Criteria) this;
        }

        public Criteria andUserFavoritesGreaterThan(String value) {
            addCriterion("user_favorites >", value, "userFavorites");
            return (Criteria) this;
        }

        public Criteria andUserFavoritesGreaterThanOrEqualTo(String value) {
            addCriterion("user_favorites >=", value, "userFavorites");
            return (Criteria) this;
        }

        public Criteria andUserFavoritesLessThan(String value) {
            addCriterion("user_favorites <", value, "userFavorites");
            return (Criteria) this;
        }

        public Criteria andUserFavoritesLessThanOrEqualTo(String value) {
            addCriterion("user_favorites <=", value, "userFavorites");
            return (Criteria) this;
        }

        public Criteria andUserFavoritesLike(String value) {
            addCriterion("user_favorites like", value, "userFavorites");
            return (Criteria) this;
        }

        public Criteria andUserFavoritesNotLike(String value) {
            addCriterion("user_favorites not like", value, "userFavorites");
            return (Criteria) this;
        }

        public Criteria andUserFavoritesIn(List<String> values) {
            addCriterion("user_favorites in", values, "userFavorites");
            return (Criteria) this;
        }

        public Criteria andUserFavoritesNotIn(List<String> values) {
            addCriterion("user_favorites not in", values, "userFavorites");
            return (Criteria) this;
        }

        public Criteria andUserFavoritesBetween(String value1, String value2) {
            addCriterion("user_favorites between", value1, value2, "userFavorites");
            return (Criteria) this;
        }

        public Criteria andUserFavoritesNotBetween(String value1, String value2) {
            addCriterion("user_favorites not between", value1, value2, "userFavorites");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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