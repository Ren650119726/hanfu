package com.hanfu.user.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class JurisdictionModule implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jurisdiction_module.id
     *
     * @mbg.generated Tue Jan 07 14:58:38 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jurisdiction_module. module_name
     *
     * @mbg.generated Tue Jan 07 14:58:38 CST 2020
     */
    private String moduleName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jurisdiction_module.create_time
     *
     * @mbg.generated Tue Jan 07 14:58:38 CST 2020
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jurisdiction_module.modify_time
     *
     * @mbg.generated Tue Jan 07 14:58:38 CST 2020
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jurisdiction_module.is_deleted
     *
     * @mbg.generated Tue Jan 07 14:58:38 CST 2020
     */
    private Short isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jurisdiction_module
     *
     * @mbg.generated Tue Jan 07 14:58:38 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jurisdiction_module.id
     *
     * @return the value of jurisdiction_module.id
     *
     * @mbg.generated Tue Jan 07 14:58:38 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jurisdiction_module.id
     *
     * @param id the value for jurisdiction_module.id
     *
     * @mbg.generated Tue Jan 07 14:58:38 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jurisdiction_module. module_name
     *
     * @return the value of jurisdiction_module. module_name
     *
     * @mbg.generated Tue Jan 07 14:58:38 CST 2020
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jurisdiction_module. module_name
     *
     * @param moduleName the value for jurisdiction_module. module_name
     *
     * @mbg.generated Tue Jan 07 14:58:38 CST 2020
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jurisdiction_module.create_time
     *
     * @return the value of jurisdiction_module.create_time
     *
     * @mbg.generated Tue Jan 07 14:58:38 CST 2020
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jurisdiction_module.create_time
     *
     * @param createTime the value for jurisdiction_module.create_time
     *
     * @mbg.generated Tue Jan 07 14:58:38 CST 2020
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jurisdiction_module.modify_time
     *
     * @return the value of jurisdiction_module.modify_time
     *
     * @mbg.generated Tue Jan 07 14:58:38 CST 2020
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jurisdiction_module.modify_time
     *
     * @param modifyTime the value for jurisdiction_module.modify_time
     *
     * @mbg.generated Tue Jan 07 14:58:38 CST 2020
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jurisdiction_module.is_deleted
     *
     * @return the value of jurisdiction_module.is_deleted
     *
     * @mbg.generated Tue Jan 07 14:58:38 CST 2020
     */
    public Short getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jurisdiction_module.is_deleted
     *
     * @param isDeleted the value for jurisdiction_module.is_deleted
     *
     * @mbg.generated Tue Jan 07 14:58:38 CST 2020
     */
    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jurisdiction_module
     *
     * @mbg.generated Tue Jan 07 14:58:38 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", moduleName=").append(moduleName);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}