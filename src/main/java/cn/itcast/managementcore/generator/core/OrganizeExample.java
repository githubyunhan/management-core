package cn.itcast.managementcore.generator.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public OrganizeExample() {
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

        public Criteria andOrgIdIsNull() {
            addCriterion("orgId is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("orgId is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Integer value) {
            addCriterion("orgId =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Integer value) {
            addCriterion("orgId <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Integer value) {
            addCriterion("orgId >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orgId >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Integer value) {
            addCriterion("orgId <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("orgId <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Integer> values) {
            addCriterion("orgId in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Integer> values) {
            addCriterion("orgId not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("orgId between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orgId not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("orgName is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("orgName is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("orgName =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("orgName <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("orgName >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("orgName >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("orgName <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("orgName <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("orgName like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("orgName not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("orgName in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("orgName not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("orgName between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("orgName not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("orgCode is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("orgCode is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("orgCode =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("orgCode <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("orgCode >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("orgCode >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("orgCode <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("orgCode <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("orgCode like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("orgCode not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("orgCode in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("orgCode not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("orgCode between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("orgCode not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andParentOrgIdIsNull() {
            addCriterion("parentOrgId is null");
            return (Criteria) this;
        }

        public Criteria andParentOrgIdIsNotNull() {
            addCriterion("parentOrgId is not null");
            return (Criteria) this;
        }

        public Criteria andParentOrgIdEqualTo(Integer value) {
            addCriterion("parentOrgId =", value, "parentOrgId");
            return (Criteria) this;
        }

        public Criteria andParentOrgIdNotEqualTo(Integer value) {
            addCriterion("parentOrgId <>", value, "parentOrgId");
            return (Criteria) this;
        }

        public Criteria andParentOrgIdGreaterThan(Integer value) {
            addCriterion("parentOrgId >", value, "parentOrgId");
            return (Criteria) this;
        }

        public Criteria andParentOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentOrgId >=", value, "parentOrgId");
            return (Criteria) this;
        }

        public Criteria andParentOrgIdLessThan(Integer value) {
            addCriterion("parentOrgId <", value, "parentOrgId");
            return (Criteria) this;
        }

        public Criteria andParentOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("parentOrgId <=", value, "parentOrgId");
            return (Criteria) this;
        }

        public Criteria andParentOrgIdIn(List<Integer> values) {
            addCriterion("parentOrgId in", values, "parentOrgId");
            return (Criteria) this;
        }

        public Criteria andParentOrgIdNotIn(List<Integer> values) {
            addCriterion("parentOrgId not in", values, "parentOrgId");
            return (Criteria) this;
        }

        public Criteria andParentOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("parentOrgId between", value1, value2, "parentOrgId");
            return (Criteria) this;
        }

        public Criteria andParentOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parentOrgId not between", value1, value2, "parentOrgId");
            return (Criteria) this;
        }

        public Criteria andParentOrgNameIsNull() {
            addCriterion("parentOrgName is null");
            return (Criteria) this;
        }

        public Criteria andParentOrgNameIsNotNull() {
            addCriterion("parentOrgName is not null");
            return (Criteria) this;
        }

        public Criteria andParentOrgNameEqualTo(String value) {
            addCriterion("parentOrgName =", value, "parentOrgName");
            return (Criteria) this;
        }

        public Criteria andParentOrgNameNotEqualTo(String value) {
            addCriterion("parentOrgName <>", value, "parentOrgName");
            return (Criteria) this;
        }

        public Criteria andParentOrgNameGreaterThan(String value) {
            addCriterion("parentOrgName >", value, "parentOrgName");
            return (Criteria) this;
        }

        public Criteria andParentOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("parentOrgName >=", value, "parentOrgName");
            return (Criteria) this;
        }

        public Criteria andParentOrgNameLessThan(String value) {
            addCriterion("parentOrgName <", value, "parentOrgName");
            return (Criteria) this;
        }

        public Criteria andParentOrgNameLessThanOrEqualTo(String value) {
            addCriterion("parentOrgName <=", value, "parentOrgName");
            return (Criteria) this;
        }

        public Criteria andParentOrgNameLike(String value) {
            addCriterion("parentOrgName like", value, "parentOrgName");
            return (Criteria) this;
        }

        public Criteria andParentOrgNameNotLike(String value) {
            addCriterion("parentOrgName not like", value, "parentOrgName");
            return (Criteria) this;
        }

        public Criteria andParentOrgNameIn(List<String> values) {
            addCriterion("parentOrgName in", values, "parentOrgName");
            return (Criteria) this;
        }

        public Criteria andParentOrgNameNotIn(List<String> values) {
            addCriterion("parentOrgName not in", values, "parentOrgName");
            return (Criteria) this;
        }

        public Criteria andParentOrgNameBetween(String value1, String value2) {
            addCriterion("parentOrgName between", value1, value2, "parentOrgName");
            return (Criteria) this;
        }

        public Criteria andParentOrgNameNotBetween(String value1, String value2) {
            addCriterion("parentOrgName not between", value1, value2, "parentOrgName");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("createDate =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("createDate <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("createDate >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("createDate >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("createDate <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("createDate <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("createDate in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("createDate not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("createDate between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("createDate not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andFullPathIsNull() {
            addCriterion("fullPath is null");
            return (Criteria) this;
        }

        public Criteria andFullPathIsNotNull() {
            addCriterion("fullPath is not null");
            return (Criteria) this;
        }

        public Criteria andFullPathEqualTo(String value) {
            addCriterion("fullPath =", value, "fullPath");
            return (Criteria) this;
        }

        public Criteria andFullPathNotEqualTo(String value) {
            addCriterion("fullPath <>", value, "fullPath");
            return (Criteria) this;
        }

        public Criteria andFullPathGreaterThan(String value) {
            addCriterion("fullPath >", value, "fullPath");
            return (Criteria) this;
        }

        public Criteria andFullPathGreaterThanOrEqualTo(String value) {
            addCriterion("fullPath >=", value, "fullPath");
            return (Criteria) this;
        }

        public Criteria andFullPathLessThan(String value) {
            addCriterion("fullPath <", value, "fullPath");
            return (Criteria) this;
        }

        public Criteria andFullPathLessThanOrEqualTo(String value) {
            addCriterion("fullPath <=", value, "fullPath");
            return (Criteria) this;
        }

        public Criteria andFullPathLike(String value) {
            addCriterion("fullPath like", value, "fullPath");
            return (Criteria) this;
        }

        public Criteria andFullPathNotLike(String value) {
            addCriterion("fullPath not like", value, "fullPath");
            return (Criteria) this;
        }

        public Criteria andFullPathIn(List<String> values) {
            addCriterion("fullPath in", values, "fullPath");
            return (Criteria) this;
        }

        public Criteria andFullPathNotIn(List<String> values) {
            addCriterion("fullPath not in", values, "fullPath");
            return (Criteria) this;
        }

        public Criteria andFullPathBetween(String value1, String value2) {
            addCriterion("fullPath between", value1, value2, "fullPath");
            return (Criteria) this;
        }

        public Criteria andFullPathNotBetween(String value1, String value2) {
            addCriterion("fullPath not between", value1, value2, "fullPath");
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