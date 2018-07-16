package org.starcode.starcmdb.master.domain;

/**
 * 作者:angie_hawk7
 * 日期:2018/6/29 19:43
 * 描述:属性定义
 */
public class CIAttr {
    //租户
    private String namespace;
    //对象类型
    private String ci;
    //属性ID
    private String attr;
    //属性名称
    private String name;
    //数据类型
    private String dtype;
    //是否主键
    private String isPrimary;
    //是否可编辑
    private String isEditor;
    //描述
    private String desc;
    //校验正则表达式
    private String validateRegex;

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public String getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(String isPrimary) {
        this.isPrimary = isPrimary;
    }

    public String getIsEditor() {
        return isEditor;
    }

    public void setIsEditor(String isEditor) {
        this.isEditor = isEditor;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getValidateRegex() {
        return validateRegex;
    }

    public void setValidateRegex(String validateRegex) {
        this.validateRegex = validateRegex;
    }
}
