package org.starcode.starcmdb.master.domain;

/**
 * 作者:angie_hawk7
 * 日期:2018/6/29 19:43
 * 描述:属性元数据定义
 */
public class CIAttrMeta {
    private String namespace;
    //对象类型
    private String ci;
    //对象属性
    private String attr;
    //元数据Key
    private String k;
    //元数据Value
    private String v;

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

    public String getK() {
        return k;
    }

    public void setK(String k) {
        this.k = k;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
}
