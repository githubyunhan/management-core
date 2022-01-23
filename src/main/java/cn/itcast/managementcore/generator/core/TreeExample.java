package cn.itcast.managementcore.generator.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TreeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TreeExample() {
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

        public Criteria andTreeIdIsNull() {
            addCriterion("treeId is null");
            return (Criteria) this;
        }

        public Criteria andTreeIdIsNotNull() {
            addCriterion("treeId is not null");
            return (Criteria) this;
        }

        public Criteria andTreeIdEqualTo(Integer value) {
            addCriterion("treeId =", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdNotEqualTo(Integer value) {
            addCriterion("treeId <>", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdGreaterThan(Integer value) {
            addCriterion("treeId >", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("treeId >=", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdLessThan(Integer value) {
            addCriterion("treeId <", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("treeId <=", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdIn(List<Integer> values) {
            addCriterion("treeId in", values, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdNotIn(List<Integer> values) {
            addCriterion("treeId not in", values, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdBetween(Integer value1, Integer value2) {
            addCriterion("treeId between", value1, value2, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("treeId not between", value1, value2, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeNameIsNull() {
            addCriterion("treeName is null");
            return (Criteria) this;
        }

        public Criteria andTreeNameIsNotNull() {
            addCriterion("treeName is not null");
            return (Criteria) this;
        }

        public Criteria andTreeNameEqualTo(String value) {
            addCriterion("treeName =", value, "treeName");
            return (Criteria) this;
        }

        public Criteria andTreeNameNotEqualTo(String value) {
            addCriterion("treeName <>", value, "treeName");
            return (Criteria) this;
        }

        public Criteria andTreeNameGreaterThan(String value) {
            addCriterion("treeName >", value, "treeName");
            return (Criteria) this;
        }

        public Criteria andTreeNameGreaterThanOrEqualTo(String value) {
            addCriterion("treeName >=", value, "treeName");
            return (Criteria) this;
        }

        public Criteria andTreeNameLessThan(String value) {
            addCriterion("treeName <", value, "treeName");
            return (Criteria) this;
        }

        public Criteria andTreeNameLessThanOrEqualTo(String value) {
            addCriterion("treeName <=", value, "treeName");
            return (Criteria) this;
        }

        public Criteria andTreeNameLike(String value) {
            addCriterion("treeName like", value, "treeName");
            return (Criteria) this;
        }

        public Criteria andTreeNameNotLike(String value) {
            addCriterion("treeName not like", value, "treeName");
            return (Criteria) this;
        }

        public Criteria andTreeNameIn(List<String> values) {
            addCriterion("treeName in", values, "treeName");
            return (Criteria) this;
        }

        public Criteria andTreeNameNotIn(List<String> values) {
            addCriterion("treeName not in", values, "treeName");
            return (Criteria) this;
        }

        public Criteria andTreeNameBetween(String value1, String value2) {
            addCriterion("treeName between", value1, value2, "treeName");
            return (Criteria) this;
        }

        public Criteria andTreeNameNotBetween(String value1, String value2) {
            addCriterion("treeName not between", value1, value2, "treeName");
            return (Criteria) this;
        }

        public Criteria andTreeCodeIsNull() {
            addCriterion("treeCode is null");
            return (Criteria) this;
        }

        public Criteria andTreeCodeIsNotNull() {
            addCriterion("treeCode is not null");
            return (Criteria) this;
        }

        public Criteria andTreeCodeEqualTo(String value) {
            addCriterion("treeCode =", value, "treeCode");
            return (Criteria) this;
        }

        public Criteria andTreeCodeNotEqualTo(String value) {
            addCriterion("treeCode <>", value, "treeCode");
            return (Criteria) this;
        }

        public Criteria andTreeCodeGreaterThan(String value) {
            addCriterion("treeCode >", value, "treeCode");
            return (Criteria) this;
        }

        public Criteria andTreeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("treeCode >=", value, "treeCode");
            return (Criteria) this;
        }

        public Criteria andTreeCodeLessThan(String value) {
            addCriterion("treeCode <", value, "treeCode");
            return (Criteria) this;
        }

        public Criteria andTreeCodeLessThanOrEqualTo(String value) {
            addCriterion("treeCode <=", value, "treeCode");
            return (Criteria) this;
        }

        public Criteria andTreeCodeLike(String value) {
            addCriterion("treeCode like", value, "treeCode");
            return (Criteria) this;
        }

        public Criteria andTreeCodeNotLike(String value) {
            addCriterion("treeCode not like", value, "treeCode");
            return (Criteria) this;
        }

        public Criteria andTreeCodeIn(List<String> values) {
            addCriterion("treeCode in", values, "treeCode");
            return (Criteria) this;
        }

        public Criteria andTreeCodeNotIn(List<String> values) {
            addCriterion("treeCode not in", values, "treeCode");
            return (Criteria) this;
        }

        public Criteria andTreeCodeBetween(String value1, String value2) {
            addCriterion("treeCode between", value1, value2, "treeCode");
            return (Criteria) this;
        }

        public Criteria andTreeCodeNotBetween(String value1, String value2) {
            addCriterion("treeCode not between", value1, value2, "treeCode");
            return (Criteria) this;
        }

        public Criteria andTreeStateIsNull() {
            addCriterion("treeState is null");
            return (Criteria) this;
        }

        public Criteria andTreeStateIsNotNull() {
            addCriterion("treeState is not null");
            return (Criteria) this;
        }

        public Criteria andTreeStateEqualTo(String value) {
            addCriterion("treeState =", value, "treeState");
            return (Criteria) this;
        }

        public Criteria andTreeStateNotEqualTo(String value) {
            addCriterion("treeState <>", value, "treeState");
            return (Criteria) this;
        }

        public Criteria andTreeStateGreaterThan(String value) {
            addCriterion("treeState >", value, "treeState");
            return (Criteria) this;
        }

        public Criteria andTreeStateGreaterThanOrEqualTo(String value) {
            addCriterion("treeState >=", value, "treeState");
            return (Criteria) this;
        }

        public Criteria andTreeStateLessThan(String value) {
            addCriterion("treeState <", value, "treeState");
            return (Criteria) this;
        }

        public Criteria andTreeStateLessThanOrEqualTo(String value) {
            addCriterion("treeState <=", value, "treeState");
            return (Criteria) this;
        }

        public Criteria andTreeStateLike(String value) {
            addCriterion("treeState like", value, "treeState");
            return (Criteria) this;
        }

        public Criteria andTreeStateNotLike(String value) {
            addCriterion("treeState not like", value, "treeState");
            return (Criteria) this;
        }

        public Criteria andTreeStateIn(List<String> values) {
            addCriterion("treeState in", values, "treeState");
            return (Criteria) this;
        }

        public Criteria andTreeStateNotIn(List<String> values) {
            addCriterion("treeState not in", values, "treeState");
            return (Criteria) this;
        }

        public Criteria andTreeStateBetween(String value1, String value2) {
            addCriterion("treeState between", value1, value2, "treeState");
            return (Criteria) this;
        }

        public Criteria andTreeStateNotBetween(String value1, String value2) {
            addCriterion("treeState not between", value1, value2, "treeState");
            return (Criteria) this;
        }

        public Criteria andTreeTypeIsNull() {
            addCriterion("treeType is null");
            return (Criteria) this;
        }

        public Criteria andTreeTypeIsNotNull() {
            addCriterion("treeType is not null");
            return (Criteria) this;
        }

        public Criteria andTreeTypeEqualTo(String value) {
            addCriterion("treeType =", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeNotEqualTo(String value) {
            addCriterion("treeType <>", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeGreaterThan(String value) {
            addCriterion("treeType >", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("treeType >=", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeLessThan(String value) {
            addCriterion("treeType <", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeLessThanOrEqualTo(String value) {
            addCriterion("treeType <=", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeLike(String value) {
            addCriterion("treeType like", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeNotLike(String value) {
            addCriterion("treeType not like", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeIn(List<String> values) {
            addCriterion("treeType in", values, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeNotIn(List<String> values) {
            addCriterion("treeType not in", values, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeBetween(String value1, String value2) {
            addCriterion("treeType between", value1, value2, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeNotBetween(String value1, String value2) {
            addCriterion("treeType not between", value1, value2, "treeType");
            return (Criteria) this;
        }

        public Criteria andParentTreeIdIsNull() {
            addCriterion("parentTreeId is null");
            return (Criteria) this;
        }

        public Criteria andParentTreeIdIsNotNull() {
            addCriterion("parentTreeId is not null");
            return (Criteria) this;
        }

        public Criteria andParentTreeIdEqualTo(Integer value) {
            addCriterion("parentTreeId =", value, "parentTreeId");
            return (Criteria) this;
        }

        public Criteria andParentTreeIdNotEqualTo(Integer value) {
            addCriterion("parentTreeId <>", value, "parentTreeId");
            return (Criteria) this;
        }

        public Criteria andParentTreeIdGreaterThan(Integer value) {
            addCriterion("parentTreeId >", value, "parentTreeId");
            return (Criteria) this;
        }

        public Criteria andParentTreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentTreeId >=", value, "parentTreeId");
            return (Criteria) this;
        }

        public Criteria andParentTreeIdLessThan(Integer value) {
            addCriterion("parentTreeId <", value, "parentTreeId");
            return (Criteria) this;
        }

        public Criteria andParentTreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("parentTreeId <=", value, "parentTreeId");
            return (Criteria) this;
        }

        public Criteria andParentTreeIdIn(List<Integer> values) {
            addCriterion("parentTreeId in", values, "parentTreeId");
            return (Criteria) this;
        }

        public Criteria andParentTreeIdNotIn(List<Integer> values) {
            addCriterion("parentTreeId not in", values, "parentTreeId");
            return (Criteria) this;
        }

        public Criteria andParentTreeIdBetween(Integer value1, Integer value2) {
            addCriterion("parentTreeId between", value1, value2, "parentTreeId");
            return (Criteria) this;
        }

        public Criteria andParentTreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parentTreeId not between", value1, value2, "parentTreeId");
            return (Criteria) this;
        }

        public Criteria andParentTreeNameIsNull() {
            addCriterion("parentTreeName is null");
            return (Criteria) this;
        }

        public Criteria andParentTreeNameIsNotNull() {
            addCriterion("parentTreeName is not null");
            return (Criteria) this;
        }

        public Criteria andParentTreeNameEqualTo(String value) {
            addCriterion("parentTreeName =", value, "parentTreeName");
            return (Criteria) this;
        }

        public Criteria andParentTreeNameNotEqualTo(String value) {
            addCriterion("parentTreeName <>", value, "parentTreeName");
            return (Criteria) this;
        }

        public Criteria andParentTreeNameGreaterThan(String value) {
            addCriterion("parentTreeName >", value, "parentTreeName");
            return (Criteria) this;
        }

        public Criteria andParentTreeNameGreaterThanOrEqualTo(String value) {
            addCriterion("parentTreeName >=", value, "parentTreeName");
            return (Criteria) this;
        }

        public Criteria andParentTreeNameLessThan(String value) {
            addCriterion("parentTreeName <", value, "parentTreeName");
            return (Criteria) this;
        }

        public Criteria andParentTreeNameLessThanOrEqualTo(String value) {
            addCriterion("parentTreeName <=", value, "parentTreeName");
            return (Criteria) this;
        }

        public Criteria andParentTreeNameLike(String value) {
            addCriterion("parentTreeName like", value, "parentTreeName");
            return (Criteria) this;
        }

        public Criteria andParentTreeNameNotLike(String value) {
            addCriterion("parentTreeName not like", value, "parentTreeName");
            return (Criteria) this;
        }

        public Criteria andParentTreeNameIn(List<String> values) {
            addCriterion("parentTreeName in", values, "parentTreeName");
            return (Criteria) this;
        }

        public Criteria andParentTreeNameNotIn(List<String> values) {
            addCriterion("parentTreeName not in", values, "parentTreeName");
            return (Criteria) this;
        }

        public Criteria andParentTreeNameBetween(String value1, String value2) {
            addCriterion("parentTreeName between", value1, value2, "parentTreeName");
            return (Criteria) this;
        }

        public Criteria andParentTreeNameNotBetween(String value1, String value2) {
            addCriterion("parentTreeName not between", value1, value2, "parentTreeName");
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