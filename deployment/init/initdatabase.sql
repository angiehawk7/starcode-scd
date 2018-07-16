--设置执行路径
set search_path to public;
--创建对象类型表
DROP TABLE IF EXISTS "meta_ci";
create table "meta_ci"(
 "ns" varchar(128) not null,
 "ci" varchar(128) not null,
 "name" varchar(128) null,
 "desc" varchar(256) null,
 "type" smallint null,
 "path" varchar(2048),
  constraint meta_ci_pkey PRIMARY KEY (ns, ci)
);
comment on column meta_ci.ns is 'namespace';
comment on column meta_ci.ci is '对象类型';
comment on column meta_ci.name is '对象类型显示名称';
comment on column meta_ci.desc is '对象类型描述';
comment on column meta_ci.type is '类别:虚拟还是实体';
comment on column meta_ci.path is '继承路径';

--创建对象属性表
DROP TABLE IF EXISTS "meta_ci_attr";
create table "meta_ci_attr"(
"ns" varchar(128) not null,
"ci" varchar(128) not null,
"attr" varchar(128) not null,
"dtype" varchar(64) null,
"name" varchar(128) not null,
"is_primary" smallint,
"is_editor" smallint,
"desc" varchar(256) null,
"validate" varchar(4096),
constraint meta_ci_attr_pkey PRIMARY KEY (ns, ci,attr)
);
comment on column meta_ci_attr.ns is 'namespace';
comment on column meta_ci_attr.ci is '对象类型';
comment on column meta_ci_attr.attr is '属性';
comment on column meta_ci_attr.dtype is '属性数据类型';
comment on column meta_ci_attr.name is '属性显示名称';
comment on column meta_ci_attr.is_primary is '是否主键';
comment on column meta_ci_attr.is_editor is '是否可编辑';
comment on column meta_ci_attr.desc is '描述';
comment on column meta_ci_attr.validate is '校验规则';
--创建对象属性元数据表
DROP TABLE IF EXISTS "meta_ci_attr_value";
create table "meta_ci_attr_value"(
"ns" varchar(128) not null,
"ci" varchar(128) not null,
"attr" varchar(128) not null,
"k" varchar(64) not null,
"v" varchar(128) not null,
constraint meta_ci_attr_value_pkey PRIMARY KEY (ns, ci,attr,k)
);
comment on column meta_ci_attr_value.ns is 'namespace';
comment on column meta_ci_attr_value.ci is '对象类型';
comment on column meta_ci_attr_value.attr is '属性';
comment on column meta_ci_attr_value.k is '元数据K';
comment on column meta_ci_attr_value.v is '元数据V';

--创建数据库账号表

--创建表空间
