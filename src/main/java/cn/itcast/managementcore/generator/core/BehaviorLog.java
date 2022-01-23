package cn.itcast.managementcore.generator.core;

import java.io.Serializable;
import java.util.Date;

/**
 * behavior_log
 * @author 
 */
public class BehaviorLog implements Serializable {
    /**
     * 行为日志流水ID
     */
    private Long behaviorLogId;

    /**
     * 响应方法
     */
    private String actionMethod;

    /**
     * 请求时间
     */
    private Date actionDate;

    /**
     * 请求人
     */
    private String actionUser;

    /**
     * 请求人Id
     */
    private String actionUserId;

    private static final long serialVersionUID = 1L;

    public Long getBehaviorLogId() {
        return behaviorLogId;
    }

    public void setBehaviorLogId(Long behaviorLogId) {
        this.behaviorLogId = behaviorLogId;
    }

    public String getActionMethod() {
        return actionMethod;
    }

    public void setActionMethod(String actionMethod) {
        this.actionMethod = actionMethod;
    }

    public Date getActionDate() {
        return actionDate;
    }

    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }

    public String getActionUser() {
        return actionUser;
    }

    public void setActionUser(String actionUser) {
        this.actionUser = actionUser;
    }

    public String getActionUserId() {
        return actionUserId;
    }

    public void setActionUserId(String actionUserId) {
        this.actionUserId = actionUserId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BehaviorLog other = (BehaviorLog) that;
        return (this.getBehaviorLogId() == null ? other.getBehaviorLogId() == null : this.getBehaviorLogId().equals(other.getBehaviorLogId()))
            && (this.getActionMethod() == null ? other.getActionMethod() == null : this.getActionMethod().equals(other.getActionMethod()))
            && (this.getActionDate() == null ? other.getActionDate() == null : this.getActionDate().equals(other.getActionDate()))
            && (this.getActionUser() == null ? other.getActionUser() == null : this.getActionUser().equals(other.getActionUser()))
            && (this.getActionUserId() == null ? other.getActionUserId() == null : this.getActionUserId().equals(other.getActionUserId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBehaviorLogId() == null) ? 0 : getBehaviorLogId().hashCode());
        result = prime * result + ((getActionMethod() == null) ? 0 : getActionMethod().hashCode());
        result = prime * result + ((getActionDate() == null) ? 0 : getActionDate().hashCode());
        result = prime * result + ((getActionUser() == null) ? 0 : getActionUser().hashCode());
        result = prime * result + ((getActionUserId() == null) ? 0 : getActionUserId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", behaviorLogId=").append(behaviorLogId);
        sb.append(", actionMethod=").append(actionMethod);
        sb.append(", actionDate=").append(actionDate);
        sb.append(", actionUser=").append(actionUser);
        sb.append(", actionUserId=").append(actionUserId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}