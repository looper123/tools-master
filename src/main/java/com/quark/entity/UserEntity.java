package com.quark.entity;


/**
 * Created by 311198 on 2016/12/1.
 */
public class UserEntity {
    /* 用户工号 */
    private String userCode;
    /* 用户名称 */
    private String empName;
    /* 组织机构id */
    private String orgId;
    /* 组织机构名称 */
    private String orgName;
    /* 组织机构层级 */
    private int orgLevel;
    /* 用户job类别名称 */
    private String jobCategoryName;
    /* 组织类型名称 */
    private String orgTypeName;
    /* 最终上级组织id */
    private String finId;
    /* 最终上级组织名称 */
    private String finName;
    /* 实际组织id */
    private String realOrgId;
    /* 实际组织名称 */
    private String realOrgName;
    /* 实际组织层级 */
    private int realOrgLevel;

    /*父组织名称*/
    private String parentOrgName;
    /*层级一组织名称*/
    private String levelOneOrgName;
    /*层级二组织名称*/
    private String levelTwoOrgName;
    /*层级三组织名称*/
    private String levelThreeOrgName;
    /*层级四组织名称*/
    private String levelFourOrgName;
    /*层级五组织名称*/
    private String levelFiveOrgName;
    /*层级六组织名称*/
    private String levelSixOrgName;

    public String getParentOrgName() {
        return parentOrgName;
    }

    public void setParentOrgName(String parentOrgName) {
        this.parentOrgName = parentOrgName;
    }

    public String getLevelOneOrgName() {
        return levelOneOrgName;
    }

    public void setLevelOneOrgName(String levelOneOrgName) {
        this.levelOneOrgName = levelOneOrgName;
    }

    public String getLevelTwoOrgName() {
        return levelTwoOrgName;
    }

    public void setLevelTwoOrgName(String levelTwoOrgName) {
        this.levelTwoOrgName = levelTwoOrgName;
    }

    public String getLevelThreeOrgName() {
        return levelThreeOrgName;
    }

    public void setLevelThreeOrgName(String levelThreeOrgName) {
        this.levelThreeOrgName = levelThreeOrgName;
    }

    public String getLevelFourOrgName() {
        return levelFourOrgName;
    }

    public void setLevelFourOrgName(String levelFourOrgName) {
        this.levelFourOrgName = levelFourOrgName;
    }

    public String getLevelFiveOrgName() {
        return levelFiveOrgName;
    }

    public void setLevelFiveOrgName(String levelFiveOrgName) {
        this.levelFiveOrgName = levelFiveOrgName;
    }

    public String getLevelSixOrgName() {
        return levelSixOrgName;
    }

    public void setLevelSixOrgName(String levelSixOrgName) {
        this.levelSixOrgName = levelSixOrgName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getJobCategoryName() {
        return jobCategoryName;
    }

    public void setJobCategoryName(String jobCategoryName) {
        this.jobCategoryName = jobCategoryName;
    }

    public String getOrgTypeName() {
        return orgTypeName;
    }

    public void setOrgTypeName(String orgTypeName) {
        this.orgTypeName = orgTypeName;
    }

    public String getFinName() {
        return finName;
    }

    public void setFinName(String finName) {
        this.finName = finName;
    }

    public String getRealOrgName() {
        return realOrgName;
    }

    public void setRealOrgName(String realOrgName) {
        this.realOrgName = realOrgName;
    }

    public int getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(int orgLevel) {
        this.orgLevel = orgLevel;
    }

    public int getRealOrgLevel() {
        return realOrgLevel;
    }

    public void setRealOrgLevel(int realOrgLevel) {
        this.realOrgLevel = realOrgLevel;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getFinId() {
        return finId;
    }

    public void setFinId(String finId) {
        this.finId = finId;
    }

    public String getRealOrgId() {
        return realOrgId;
    }

    public void setRealOrgId(String realOrgId) {
        this.realOrgId = realOrgId;
    }
}

