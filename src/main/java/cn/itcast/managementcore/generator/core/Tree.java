package cn.itcast.managementcore.generator.core;

import java.io.Serializable;
import java.util.Date;

/**
 * tree
 * @author 
 */
public class Tree implements Serializable {
    /**
     * 菜单流水Id
     */
    private Integer treeId;

    /**
     * 菜单名字
     */
    private String treeName;

    /**
     * 菜单编码
     */
    private String treeCode;

    /**
     * 菜单状态【1.可用；2.禁用】
     */
    private String treeState;

    /**
     * 菜单类型【1.菜单节点；2.按钮节点】
     */
    private String treeType;

    /**
     * 父节点编号
     */
    private Integer parentTreeId;

    /**
     * 父节点名称
     */
    private String parentTreeName;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 菜单流水完整路径（1.2.3）
     */
    private String fullPath;

    private static final long serialVersionUID = 1L;

    public Integer getTreeId() {
        return treeId;
    }

    public void setTreeId(Integer treeId) {
        this.treeId = treeId;
    }

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }

    public String getTreeCode() {
        return treeCode;
    }

    public void setTreeCode(String treeCode) {
        this.treeCode = treeCode;
    }

    public String getTreeState() {
        return treeState;
    }

    public void setTreeState(String treeState) {
        this.treeState = treeState;
    }

    public String getTreeType() {
        return treeType;
    }

    public void setTreeType(String treeType) {
        this.treeType = treeType;
    }

    public Integer getParentTreeId() {
        return parentTreeId;
    }

    public void setParentTreeId(Integer parentTreeId) {
        this.parentTreeId = parentTreeId;
    }

    public String getParentTreeName() {
        return parentTreeName;
    }

    public void setParentTreeName(String parentTreeName) {
        this.parentTreeName = parentTreeName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
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
        Tree other = (Tree) that;
        return (this.getTreeId() == null ? other.getTreeId() == null : this.getTreeId().equals(other.getTreeId()))
            && (this.getTreeName() == null ? other.getTreeName() == null : this.getTreeName().equals(other.getTreeName()))
            && (this.getTreeCode() == null ? other.getTreeCode() == null : this.getTreeCode().equals(other.getTreeCode()))
            && (this.getTreeState() == null ? other.getTreeState() == null : this.getTreeState().equals(other.getTreeState()))
            && (this.getTreeType() == null ? other.getTreeType() == null : this.getTreeType().equals(other.getTreeType()))
            && (this.getParentTreeId() == null ? other.getParentTreeId() == null : this.getParentTreeId().equals(other.getParentTreeId()))
            && (this.getParentTreeName() == null ? other.getParentTreeName() == null : this.getParentTreeName().equals(other.getParentTreeName()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getFullPath() == null ? other.getFullPath() == null : this.getFullPath().equals(other.getFullPath()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTreeId() == null) ? 0 : getTreeId().hashCode());
        result = prime * result + ((getTreeName() == null) ? 0 : getTreeName().hashCode());
        result = prime * result + ((getTreeCode() == null) ? 0 : getTreeCode().hashCode());
        result = prime * result + ((getTreeState() == null) ? 0 : getTreeState().hashCode());
        result = prime * result + ((getTreeType() == null) ? 0 : getTreeType().hashCode());
        result = prime * result + ((getParentTreeId() == null) ? 0 : getParentTreeId().hashCode());
        result = prime * result + ((getParentTreeName() == null) ? 0 : getParentTreeName().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getFullPath() == null) ? 0 : getFullPath().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", treeId=").append(treeId);
        sb.append(", treeName=").append(treeName);
        sb.append(", treeCode=").append(treeCode);
        sb.append(", treeState=").append(treeState);
        sb.append(", treeType=").append(treeType);
        sb.append(", parentTreeId=").append(parentTreeId);
        sb.append(", parentTreeName=").append(parentTreeName);
        sb.append(", createDate=").append(createDate);
        sb.append(", fullPath=").append(fullPath);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}