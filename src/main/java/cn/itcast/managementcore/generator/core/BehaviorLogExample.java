package cn.itcast.managementcore.generator.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BehaviorLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public BehaviorLogExample() {
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

        public Criteria andBehaviorLogIdIsNull() {
            addCriterion("behaviorLogId is null");
            return (Criteria) this;
        }

        public Criteria andBehaviorLogIdIsNotNull() {
            addCriterion("behaviorLogId is not null");
            return (Criteria) this;
        }

        public Criteria andBehaviorLogIdEqualTo(Long value) {
            addCriterion("behaviorLogId =", value, "behaviorLogId");
            return (Criteria) this;
        }

        public Criteria andBehaviorLogIdNotEqualTo(Long value) {
            addCriterion("behaviorLogId <>", value, "behaviorLogId");
            return (Criteria) this;
        }

        public Criteria andBehaviorLogIdGreaterThan(Long value) {
            addCriterion("behaviorLogId >", value, "behaviorLogId");
            return (Criteria) this;
        }

        public Criteria andBehaviorLogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("behaviorLogId >=", value, "behaviorLogId");
            return (Criteria) this;
        }

        public Criteria andBehaviorLogIdLessThan(Long value) {
            addCriterion("behaviorLogId <", value, "behaviorLogId");
            return (Criteria) this;
        }

        public Criteria andBehaviorLogIdLessThanOrEqualTo(Long value) {
            addCriterion("behaviorLogId <=", value, "behaviorLogId");
            return (Criteria) this;
        }

        public Criteria andBehaviorLogIdIn(List<Long> values) {
            addCriterion("behaviorLogId in", values, "behaviorLogId");
            return (Criteria) this;
        }

        public Criteria andBehaviorLogIdNotIn(List<Long> values) {
            addCriterion("behaviorLogId not in", values, "behaviorLogId");
            return (Criteria) this;
        }

        public Criteria andBehaviorLogIdBetween(Long value1, Long value2) {
            addCriterion("behaviorLogId between", value1, value2, "behaviorLogId");
            return (Criteria) this;
        }

        public Criteria andBehaviorLogIdNotBetween(Long value1, Long value2) {
            addCriterion("behaviorLogId not between", value1, value2, "behaviorLogId");
            return (Criteria) this;
        }

        public Criteria andActionMethodIsNull() {
            addCriterion("actionMethod is null");
            return (Criteria) this;
        }

        public Criteria andActionMethodIsNotNull() {
            addCriterion("actionMethod is not null");
            return (Criteria) this;
        }

        public Criteria andActionMethodEqualTo(String value) {
            addCriterion("actionMethod =", value, "actionMethod");
            return (Criteria) this;
        }

        public Criteria andActionMethodNotEqualTo(String value) {
            addCriterion("actionMethod <>", value, "actionMethod");
            return (Criteria) this;
        }

        public Criteria andActionMethodGreaterThan(String value) {
            addCriterion("actionMethod >", value, "actionMethod");
            return (Criteria) this;
        }

        public Criteria andActionMethodGreaterThanOrEqualTo(String value) {
            addCriterion("actionMethod >=", value, "actionMethod");
            return (Criteria) this;
        }

        public Criteria andActionMethodLessThan(String value) {
            addCriterion("actionMethod <", value, "actionMethod");
            return (Criteria) this;
        }

        public Criteria andActionMethodLessThanOrEqualTo(String value) {
            addCriterion("actionMethod <=", value, "actionMethod");
            return (Criteria) this;
        }

        public Criteria andActionMethodLike(String value) {
            addCriterion("actionMethod like", value, "actionMethod");
            return (Criteria) this;
        }

        public Criteria andActionMethodNotLike(String value) {
            addCriterion("actionMethod not like", value, "actionMethod");
            return (Criteria) this;
        }

        public Criteria andActionMethodIn(List<String> values) {
            addCriterion("actionMethod in", values, "actionMethod");
            return (Criteria) this;
        }

        public Criteria andActionMethodNotIn(List<String> values) {
            addCriterion("actionMethod not in", values, "actionMethod");
            return (Criteria) this;
        }

        public Criteria andActionMethodBetween(String value1, String value2) {
            addCriterion("actionMethod between", value1, value2, "actionMethod");
            return (Criteria) this;
        }

        public Criteria andActionMethodNotBetween(String value1, String value2) {
            addCriterion("actionMethod not between", value1, value2, "actionMethod");
            return (Criteria) this;
        }

        public Criteria andActionDateIsNull() {
            addCriterion("actionDate is null");
            return (Criteria) this;
        }

        public Criteria andActionDateIsNotNull() {
            addCriterion("actionDate is not null");
            return (Criteria) this;
        }

        public Criteria andActionDateEqualTo(Date value) {
            addCriterion("actionDate =", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateNotEqualTo(Date value) {
            addCriterion("actionDate <>", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateGreaterThan(Date value) {
            addCriterion("actionDate >", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("actionDate >=", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateLessThan(Date value) {
            addCriterion("actionDate <", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateLessThanOrEqualTo(Date value) {
            addCriterion("actionDate <=", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateIn(List<Date> values) {
            addCriterion("actionDate in", values, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateNotIn(List<Date> values) {
            addCriterion("actionDate not in", values, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateBetween(Date value1, Date value2) {
            addCriterion("actionDate between", value1, value2, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateNotBetween(Date value1, Date value2) {
            addCriterion("actionDate not between", value1, value2, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionUserIsNull() {
            addCriterion("actionUser is null");
            return (Criteria) this;
        }

        public Criteria andActionUserIsNotNull() {
            addCriterion("actionUser is not null");
            return (Criteria) this;
        }

        public Criteria andActionUserEqualTo(String value) {
            addCriterion("actionUser =", value, "actionUser");
            return (Criteria) this;
        }

        public Criteria andActionUserNotEqualTo(String value) {
            addCriterion("actionUser <>", value, "actionUser");
            return (Criteria) this;
        }

        public Criteria andActionUserGreaterThan(String value) {
            addCriterion("actionUser >", value, "actionUser");
            return (Criteria) this;
        }

        public Criteria andActionUserGreaterThanOrEqualTo(String value) {
            addCriterion("actionUser >=", value, "actionUser");
            return (Criteria) this;
        }

        public Criteria andActionUserLessThan(String value) {
            addCriterion("actionUser <", value, "actionUser");
            return (Criteria) this;
        }

        public Criteria andActionUserLessThanOrEqualTo(String value) {
            addCriterion("actionUser <=", value, "actionUser");
            return (Criteria) this;
        }

        public Criteria andActionUserLike(String value) {
            addCriterion("actionUser like", value, "actionUser");
            return (Criteria) this;
        }

        public Criteria andActionUserNotLike(String value) {
            addCriterion("actionUser not like", value, "actionUser");
            return (Criteria) this;
        }

        public Criteria andActionUserIn(List<String> values) {
            addCriterion("actionUser in", values, "actionUser");
            return (Criteria) this;
        }

        public Criteria andActionUserNotIn(List<String> values) {
            addCriterion("actionUser not in", values, "actionUser");
            return (Criteria) this;
        }

        public Criteria andActionUserBetween(String value1, String value2) {
            addCriterion("actionUser between", value1, value2, "actionUser");
            return (Criteria) this;
        }

        public Criteria andActionUserNotBetween(String value1, String value2) {
            addCriterion("actionUser not between", value1, value2, "actionUser");
            return (Criteria) this;
        }

        public Criteria andActionUserIdIsNull() {
            addCriterion("actionUserId is null");
            return (Criteria) this;
        }

        public Criteria andActionUserIdIsNotNull() {
            addCriterion("actionUserId is not null");
            return (Criteria) this;
        }

        public Criteria andActionUserIdEqualTo(String value) {
            addCriterion("actionUserId =", value, "actionUserId");
            return (Criteria) this;
        }

        public Criteria andActionUserIdNotEqualTo(String value) {
            addCriterion("actionUserId <>", value, "actionUserId");
            return (Criteria) this;
        }

        public Criteria andActionUserIdGreaterThan(String value) {
            addCriterion("actionUserId >", value, "actionUserId");
            return (Criteria) this;
        }

        public Criteria andActionUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("actionUserId >=", value, "actionUserId");
            return (Criteria) this;
        }

        public Criteria andActionUserIdLessThan(String value) {
            addCriterion("actionUserId <", value, "actionUserId");
            return (Criteria) this;
        }

        public Criteria andActionUserIdLessThanOrEqualTo(String value) {
            addCriterion("actionUserId <=", value, "actionUserId");
            return (Criteria) this;
        }

        public Criteria andActionUserIdLike(String value) {
            addCriterion("actionUserId like", value, "actionUserId");
            return (Criteria) this;
        }

        public Criteria andActionUserIdNotLike(String value) {
            addCriterion("actionUserId not like", value, "actionUserId");
            return (Criteria) this;
        }

        public Criteria andActionUserIdIn(List<String> values) {
            addCriterion("actionUserId in", values, "actionUserId");
            return (Criteria) this;
        }

        public Criteria andActionUserIdNotIn(List<String> values) {
            addCriterion("actionUserId not in", values, "actionUserId");
            return (Criteria) this;
        }

        public Criteria andActionUserIdBetween(String value1, String value2) {
            addCriterion("actionUserId between", value1, value2, "actionUserId");
            return (Criteria) this;
        }

        public Criteria andActionUserIdNotBetween(String value1, String value2) {
            addCriterion("actionUserId not between", value1, value2, "actionUserId");
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