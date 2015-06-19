package com.yousoft.service.security.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.activiti.engine.IdentityService;
import org.activiti.engine.impl.persistence.entity.UserEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yousoft.client.security.TSysuserMapper;
import com.yousoft.client.security.TSysuserauthMapper;
import com.yousoft.client.security.TSysuserroleMapper;
import com.yousoft.model.security.TSysuser;
import com.yousoft.model.security.TSysuserExample;
import com.yousoft.model.security.TSysuserExample.Criteria;
import com.yousoft.model.security.TSysuserauth;
import com.yousoft.model.security.TSysuserrole;
import com.yousoft.model.security.TSysuserroleExample;
import com.yousoft.service.security.UserService;
import com.yousoft.service.util.ArchState;
import com.yousoft.service.util.EncryptUtil;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private TSysuserroleMapper userRoleMapper;
	@Autowired
	private TSysuserMapper userMapper;
	@Autowired
	private TSysuserauthMapper userAuthMapper;
	@Autowired
	private IdentityService identityService;

	@Override
	public List<Integer> findRoleIDListByUserId(long userid) {
		TSysuserroleExample example = new TSysuserroleExample();
		example.createCriteria().andUseridEqualTo(userid);
		List<TSysuserrole> userRoleList = userRoleMapper
				.selectByExample(example);
		if (userRoleList != null && userRoleList.size() > 0) {
			List<Integer> roleIdList = new ArrayList<Integer>();
			for (TSysuserrole userRole : userRoleList) {
				roleIdList.add(userRole.getRoleid());
			}
			return roleIdList;
		}
		return null;
	}

	@Override
	public int addUser(TSysuser sysUser, List<Integer> roleIdList,
			String loginCode, Long operatorCode) {
		if (sysUser != null && roleIdList != null && roleIdList.size() > 0
				&& StringUtils.isNotEmpty(loginCode)) {
			// 1.往t_sysuser表中添加用户信息
			userMapper.insertSelective(sysUser);
			// 2.往t_sysauth表中添加用户密码相关信息
			EncryptUtil encryptUtil = new EncryptUtil();
			TSysuserauth userAuth = new TSysuserauth();
			userAuth.setUserid(sysUser.getUserid());
			// 默认密码1111
			userAuth.setLogincode(loginCode);
			userAuth.setPassword(encryptUtil.encode("1111"));
			userAuth.setCreatetime(new Date());
			userAuth.setCreateuser(operatorCode);
			userAuthMapper.insertSelective(userAuth);
			// 3.往流程表中添加用户基本信息
			UserEntity userEntity = new UserEntity();
			// 当前用户ID.
			userEntity.setId(sysUser.getUserid().toString());
			userEntity.setEmail(sysUser.getEmail());
			userEntity.setLastName(sysUser.getUsername());
			identityService.saveUser(userEntity);
			// 4.配置角色信息
			TSysuserrole userRole = null;
			for (Integer roleId : roleIdList) {
				userRole = new TSysuserrole();
				userRole.setUserid(sysUser.getUserid());
				userRole.setRoleid(roleId);
				userRole.setCreatetime(new Date());
				userRole.setModifytime(new Date());
				userRoleMapper.insertSelective(userRole);
			}
			return ArchState.SUCCESS.getState();
		} else {
			return ArchState.ERROR.getState();
		}
	}

	@Override
	public TSysuser findUserByUserId(long userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public List<TSysuser> findUserByMethodAndValue(String method, String value) {
		TSysuserExample sysUserExample = new TSysuserExample();
		Criteria criteria = sysUserExample.createCriteria();
		if (UserService.DEPART.equals(method)) {
			criteria.andDepartidEqualTo(Integer.valueOf(value));
			return userMapper.selectByExample(sysUserExample);
		} else if (UserService.USERNAME.equals(method)) {
			if (value.indexOf("*") != -1 || value.indexOf("%") != -1) {
				criteria.andUsernameLike(value.concat("%"));
			} else {
				criteria.andUsernameEqualTo(value);
			}
		} else if (UserService.USERID.equals(method)) {
			criteria.andUseridEqualTo(Long.valueOf(value));
		}
		return userMapper.selectByExample(sysUserExample);
	}

}
