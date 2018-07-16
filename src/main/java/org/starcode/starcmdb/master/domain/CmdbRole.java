package org.starcode.starcmdb.master.domain;

import java.util.Set;

/**
 * 作者:angie_hawk7
 * 日期:2018/6/29 20:02
 * 描述:CMDB角色
 */
public class CmdbRole {
    //角色名称
    private String rolename;
    //角色描述
    private String descripion;
    //权限
    private Set<String> authoritys;

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getDescripion() {
        return descripion;
    }

    public void setDescripion(String descripion) {
        this.descripion = descripion;
    }

    public Set<String> getAuthoritys() {
        return authoritys;
    }

    public void setAuthoritys(Set<String> authoritys) {
        this.authoritys = authoritys;
    }
}
