package com.yousoft.service.security;

import java.util.List;

public interface UserService {

	/**
	 * 根据用户ID获取该用户的权限信息
	 * 
	 * @param userid
	 * @return
	 */
	public List<Integer> findRoleIDListByUserId(long userid);

}
