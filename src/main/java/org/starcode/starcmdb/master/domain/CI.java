package org.starcode.starcmdb.master.domain;

import java.util.List;

/**
 * 作者:angie_hawk7
 * 日期:2018/6/29 19:43
 * 描述:对象类型定义
 */
public class CI {
    private String namespace;
    /**
     * 对象类型
     */
    private String ci;
    /**
     * 对象名称
     */
    private String name;
    /**
     * 对象继承路径
     */
    private String path;
    /**
     * 对象描述
     */
    private String description;
    /**
     * 对象维护责任人
     */
    private List<String> opsUsers;

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getOpsUsers() {
        return opsUsers;
    }

    public void setOpsUsers(List<String> opsUsers) {
        this.opsUsers = opsUsers;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
}
