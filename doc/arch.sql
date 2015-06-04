DROP DATABASE IF EXISTS ARCH;
CREATE DATABASE ARCH;

USE ARCH;

-- 部门信息表
DROP TABLE IF EXISTS T_SYSDEPART;
CREATE TABLE T_SYSDEPART(
	DEPTID INT NOT NULL COMMENT '部门ID',
	DEPTNAME VARCHAR(500) NOT NULL COMMENT '部门名称',
	UPPERDEPTID BIGINT NOT NULL DEFAULT 0 COMMENT '上级部门ID',
	DEPTPATH VARCHAR(500) NOT NULL DEFAULT '0' COMMENT '部门上下级路径',
	COLUMN1 VARCHAR(200) DEFAULT NULL COMMENT '预留字段1',
	COLUMN2 VARCHAR(200) DEFAULT NULL COMMENT '预留字段2',
	COLUMN3 VARCHAR(200) DEFAULT NULL COMMENT '预留字段3',
	COLUMN4 VARCHAR(200) DEFAULT NULL COMMENT '预留字段4',
	COLUMN5 VARCHAR(200) DEFAULT NULL COMMENT '预留字段5',
	CREATEUSER BIGINT NOT NULL COMMENT '创建者ID',
	CREATETIME TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',
	UPDATERCODE BIGINT DEFAULT NULL COMMENT '更新者ID',
	MODIFYTIME TIMESTAMP COMMENT '记录更新时间',
	VALID TINYINT DEFAULT 0 COMMENT '有效状态 0有效 1无效',
	PRIMARY KEY(DEPTID),
	KEY `SYSDEPART_DEPTID_IDX`(DEPTID),
	KEY `SYSDEPART_UPPERDEPTID_IDX`(UPPERDEPTID)
)ENGINE=INNODB DEFAULT CHARSET=UTF8;

-- 系统用户信息表
DROP TABLE IF EXISTS T_SYSUSER;
CREATE TABLE T_SYSUSER(
	USERID BIGINT NOT NULL COMMENT '用户ID',
	USERCODE VARCHAR(100) DEFAULT NULL COMMENT '用户代码',
	USERNAME VARCHAR(100) NOT NULL COMMENT '用户姓名',
	DEPARTID INT NOT NULL COMMENT '部门ID',
	EMAIL VARCHAR(100) DEFAULT NULL COMMENT '邮件地址',
	PHONENUMBER CHAR(20) DEFAULT NULL COMMENT '手机号码',
	COLUMN1 VARCHAR(200) DEFAULT NULL COMMENT '预留字段1',
	COLUMN2 VARCHAR(200) DEFAULT NULL COMMENT '预留字段2',
	COLUMN3 VARCHAR(200) DEFAULT NULL COMMENT '预留字段3',
	COLUMN4 VARCHAR(200) DEFAULT NULL COMMENT '预留字段4',
	COLUMN5 VARCHAR(200) DEFAULT NULL COMMENT '预留字段5',
	CREATEUSER BIGINT NOT NULL COMMENT '创建者ID',
	CREATETIME TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',
	UPDATERCODE BIGINT DEFAULT NULL COMMENT '更新者ID',
	MODIFYTIME TIMESTAMP COMMENT '记录更新时间',
	VALID TINYINT DEFAULT 0 COMMENT '有效状态 0有效 1无效',
	PRIMARY KEY(USERID),
	KEY `SYSUSER_DEPARTID_IDX`(DEPARTID),
	KEY `SYSUSER_USERCODE_IDX`(USERCODE)
)ENGINE=INNODB DEFAULT CHARSET=UTF8;

-- 系统用户验证信息表
DROP TABLE IF EXISTS T_SYSUSERAUTH;
CREATE TABLE T_SYSUSERAUTH(
	AUID BIGINT NOT NULL COMMENT '验证自增ID',
	USERID BIGINT NOT NULL COMMENT '用户ID',
	LOGINCODE VARCHAR(100) UNIQUE DEFAULT NULL COMMENT '登录代码',
	PASSWORD VARCHAR(255) DEFAULT NULL COMMENT '用户登录密码(DES加密)',
	STATUS TINYINT DEFAULT 0 COMMENT '帐号状态 0正常 1账号锁定 2账号过期 3异常登录',
	COLUMN1 VARCHAR(200) DEFAULT NULL COMMENT '预留字段1',
	COLUMN2 VARCHAR(200) DEFAULT NULL COMMENT '预留字段2',
	COLUMN3 VARCHAR(200) DEFAULT NULL COMMENT '预留字段3',
	COLUMN4 VARCHAR(200) DEFAULT NULL COMMENT '预留字段4',
	COLUMN5 VARCHAR(200) DEFAULT NULL COMMENT '预留字段5',
	CREATEUSER BIGINT NOT NULL COMMENT '创建者ID',
	CREATETIME TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',
	UPDATERCODE BIGINT DEFAULT NULL COMMENT '更新者ID',
	MODIFYTIME TIMESTAMP COMMENT '记录更新时间',
	VALID TINYINT DEFAULT 0 COMMENT '有效状态 0有效 1无效',
	PRIMARY KEY(AUID),
	KEY `SYSUSERAUTH_USERID_IDX`(USERID),
	KEY `SYSUSERAUTH_LOGINCODE_IDX`(LOGINCODE)
)ENGINE=INNODB DEFAULT CHARSET=UTF8;

-- 系统角色信息表
DROP TABLE IF EXISTS T_SYSROLE;
CREATE TABLE T_SYSROLE(
	ROLEID INT NOT NULL COMMENT '角色自增ID',
	ROLENAME VARCHAR(100) NOT NULL COMMENT '角色名称',
	COLUMN1 VARCHAR(200) DEFAULT NULL COMMENT '预留字段1',
	COLUMN2 VARCHAR(200) DEFAULT NULL COMMENT '预留字段2',
	COLUMN3 VARCHAR(200) DEFAULT NULL COMMENT '预留字段3',
	CREATEUSER BIGINT NOT NULL COMMENT '创建者ID',
	CREATETIME TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',
	UPDATERCODE BIGINT DEFAULT NULL COMMENT '更新者ID',
	MODIFYTIME TIMESTAMP COMMENT '记录更新时间',
	VALID TINYINT DEFAULT 0 COMMENT '有效状态 0有效 1无效',
	PRIMARY KEY(ROLEID),
	KEY `SYSROLE_ROLENAME_IDX`(ROLENAME)
)ENGINE=INNODB DEFAULT CHARSET=UTF8;

-- 用户角色关联信息表
DROP TABLE IF EXISTS T_SYSUSERROLE;
CREATE TABLE T_SYSUSERROLE(
	URID INT NOT NULL COMMENT '用户角色自增ID',
	USERID BIGINT NOT NULL COMMENT '用户ID',
	ROLEID INT NOT NULL COMMENT '角色ID',
	COLUMN1 VARCHAR(200) DEFAULT NULL COMMENT '预留字段1',
	COLUMN2 VARCHAR(200) DEFAULT NULL COMMENT '预留字段2',
	COLUMN3 VARCHAR(200) DEFAULT NULL COMMENT '预留字段3',
	CREATEUSER BIGINT NOT NULL COMMENT '创建者ID',
	CREATETIME TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',
	UPDATERCODE BIGINT DEFAULT NULL COMMENT '更新者ID',
	MODIFYTIME TIMESTAMP COMMENT '记录更新时间',
	VALID TINYINT DEFAULT 0 COMMENT '有效状态 0有效 1无效',
	PRIMARY KEY(URID),
	KEY `SYSUSERROLE_USERID_IDX`(USERID),
	KEY `SYSUSERROLE_ROLEID_IDX`(ROLEID)
)ENGINE=INNODB DEFAULT CHARSET=UTF8;

-- 系统访问资源信息表
DROP TABLE IF EXISTS T_SYSRESOURCES;
CREATE TABLE T_SYSRESOURCES(
	RESID INT NOT NULL COMMENT '资源ID',
	RESNAME VARCHAR(100) NOT NULL COMMENT '资源名称',
	RESURL VARCHAR(500) DEFAULT NULL COMMENT '访问资源URL',
	COLUMN1 VARCHAR(200) DEFAULT NULL COMMENT '预留字段1',
	COLUMN2 VARCHAR(200) DEFAULT NULL COMMENT '预留字段2',
	COLUMN3 VARCHAR(200) DEFAULT NULL COMMENT '预留字段3',
	CREATEUSER BIGINT NOT NULL COMMENT '创建者ID',
	CREATETIME TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',
	UPDATERCODE BIGINT DEFAULT NULL COMMENT '更新者ID',
	MODIFYTIME TIMESTAMP COMMENT '记录更新时间',
	VALID TINYINT DEFAULT 0 COMMENT '有效状态 0有效 1无效',
	PRIMARY KEY(RESID),
	KEY `SYSRESOURCES_RESNAME_IDX`(RESNAME)
)ENGINE=INNODB DEFAULT CHARSET=UTF8;

-- 系统角色资源关联信息表
DROP TABLE IF EXISTS T_SYSROLERESOURCE;
CREATE TABLE T_SYSROLERESOURCE(
	ROLERESID INT NOT NULL COMMENT '角色资源ID',
	ROLEID INT NOT NULL COMMENT '角色ID',
	RESID INT NOT NULL COMMENT '资源ID',
	AUTHORITY INT NOT NULL COMMENT '授权类型:0只读 1编辑 2删除';
	CREATEUSER BIGINT NOT NULL COMMENT '创建者ID',
	CREATETIME TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',
	UPDATERCODE BIGINT DEFAULT NULL COMMENT '更新者ID',
	MODIFYTIME TIMESTAMP COMMENT '记录更新时间',
	VALID TINYINT DEFAULT 0 COMMENT '有效状态 0有效 1无效',
	PRIMARY KEY(ROLERESID),
	KEY `SYSROLERESOURCE_ROLEID_IDX`(ROLEID),
	KEY `SYSROLERESOURCE_RESID_IDX`(RESID)
)ENGINE=INNODB DEFAULT CHARSET=UTF8;



	








	