package com.yousoft.service.security.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yousoft.client.security.TSysuserroleMapper;
import com.yousoft.model.security.TSysuserrole;
import com.yousoft.model.security.TSysuserroleExample;
import com.yousoft.service.security.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private TSysuserroleMapper userRoleMapper;

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
}
