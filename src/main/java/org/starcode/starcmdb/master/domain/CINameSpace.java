package org.starcode.starcmdb.master.domain;

/**
 * 作者:angie_hawk7
 * 日期:2018/6/29 19:43
 * 描述:数据库定义
 */
public class CINameSpace {
    //数据库名称
    private String name;
    //数据库描述
    private String desc;
    //所属存储空间
    private String storespace;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getStorespace() {
        return storespace;
    }

    public void setStorespace(String storespace) {
        this.storespace = storespace;
    }
}
