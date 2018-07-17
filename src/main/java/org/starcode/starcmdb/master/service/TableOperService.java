package org.starcode.starcmdb.master.service;

/**
 * 作者:angie_hawk7
 * 日期:2018/6/29 20:27
 * 描述:数据库管理操作
 * 1：表空间创建，删除
 * 2：数据库创建，删除
 * 3：数据库账号创建，删除
 * 4：数据表创建，删除
 * 5：cmdb元数据表增删改查。
 */
public class TableOperService {
    private static final String CREATE_DB_SQL="create database school with owner=president template=template0 encoding='UTF8' lc_collate='C' lc_ctype='C' tablespace=tbs_test connection limit = 100;";

    /**
     * 创建数据库
     * @param dbname
     * @param limit
     * @param space
     * @param owner
     */
    public void createDB(String dbname,int limit,String space,String owner){

    }
}
