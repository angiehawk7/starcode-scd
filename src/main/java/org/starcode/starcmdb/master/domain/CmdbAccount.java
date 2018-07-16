package org.starcode.starcmdb.master.domain;

/**
 * 作者:angie_hawk7
 * 日期:2018/6/29 19:43
 * 描述:CMDB账号定义
 */
public class CmdbAccount {
    //namespace
    private String namespace;
    //用户名
    private String user;
    //密码
    private String pwd;
    //角色
    private String role;

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
