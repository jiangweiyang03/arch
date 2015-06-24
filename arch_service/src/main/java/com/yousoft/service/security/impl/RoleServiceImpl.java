package com.yousoft.service.security.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yousoft.client.security.TSysroleMapper;
import com.yousoft.client.security.TSysroleresourceMapper;
import com.yousoft.client.security.TSysuserroleMapper;
import com.yousoft.model.security.TSysrole;
import com.yousoft.model.security.TSysroleExample;
import com.yousoft.model.security.TSysroleresourceExample;
import com.yousoft.model.security.TSysuserroleExample;
import com.yousoft.service.security.RoleService;
import com.yousoft.service.util.ArchState;

@Service
public class RoleServiceImpl implements RoleService {
	/** 日志记录对象 **/
	private static Logger logger = LoggerFactory
			.getLogger(RoleServiceImpl.class);
	@Autowired
	private TSysroleMapper roleMapper;
	@Autowired
	private TSysuserroleMapper userRoleMapper;
	@Autowired
	private TSysroleresourceMapper roleResourceMapper;

	@Override
	public int addRole(TSysrole role, Long operatorCode) {
		if (role != null) {
			role.setCreatetime(new Date());
			role.setCreateuser(operatorCode);
			roleMapper.insertSelective(role);
			return ArchState.SUCCESS.getState();
		}
		return ArchState.ERROR.getState();
	}

	@Override
	public int modifyRole(TSysrole role, Long operatorCode) {
		if (role != null) {
			role.setCreateuser(operatorCode);
			role.setModifytime(new Date());
			roleMapper.updateByPrimaryKeySelective(role);
			return ArchState.SUCCESS.getState();
		}
		return ArchState.ERROR.getState();
	}

	@Override
	public int deleteRole(TSysrole role) {
		if (role != null && role.getRoleid() != null) {
			/** 关联查询是否有用户配置该角色 **/
			TSysuserroleExample userRoleExample = new TSysuserroleExample();
			TSysuserroleExample.Criteria criteria = userRoleExample
					.createCriteria();
			criteria.andRoleidEqualTo(role.getRoleid());
			int count = userRoleMapper.countByExample(userRoleExample);
			if (count > 0) {
				logger.warn("当前角色:" + role.getRolename() + "->"
						+ role.getRoleid() + "已经有人员配置");
				return ArchState.ERROR.getState();
			} else {
				//删除角色,角色与资源的绑定信息
				TSysroleExample example = new TSysroleExample();
				example.createCriteria().andRoleidEqualTo(role.getRoleid());
				roleMapper.deleteByExample(example);
				//删除角色资源关联信息
				TSysroleresourceExample roleresourceExample = new TSysroleresourceExample();
				roleresourceExample.createCriteria().andRoleidEqualTo(role.getRoleid());
				roleResourceMapper.deleteByExample(roleresourceExample);
			}
		}
		return ArchState.ERROR.getState();
	}

}
