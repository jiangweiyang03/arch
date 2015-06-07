package com.yousoft.service.security.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.yousoft.model.security.view.SecurityUser;
import com.yousoft.service.security.AuthService;

public class ArchUserDetailServiceImpl implements UserDetailsService {
	/**日志记录对象**/
	private static Logger logger = LoggerFactory.getLogger(ArchUserDetailServiceImpl.class);

	@Autowired
	private AuthService authService;
	

	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		logger.info("loadUserByUserName,username:"+username);
		if (StringUtils.isNotEmpty(username)) {
			// 传入的username不能Null
			SecurityUser securityUser = null;
			try{
			securityUser = authService
					.findSecurityUserByLoginCode(username);// 根据登录code查询用户信息对象
			}catch(Exception ex){
				ex.printStackTrace();
			}
			if (securityUser == null) {
				// 没有查询到满足条件的数据
				throw new UsernameNotFoundException(username);
			} else {
				int valid = securityUser.getValid();
				if (valid == 1) {
					// 无效..
					throw new UsernameNotFoundException("当前登录帐号无效,请联系系统管理员");
				} else {
					int status = securityUser.getStatus();// 获取帐号当前状态
					StringBuffer buffer = new StringBuffer();
					switch (status) {
					case 1:
						buffer.append("当前登录账号被锁定,请联系管理员进行恢复");break;
					case 2:
						buffer.append("当前登录账号已过期,请联系管理员进行恢复");break;
					case 3:
						buffer.append("当前登录账号涉嫌异常登录,请联系管理员进行恢复");break;
					}
					if(buffer.length()>0){
						throw new UsernameNotFoundException(buffer.toString());
					} else {
						Collection<GrantedAuthority> grantedAuths = obtionGrantedAuthorities(securityUser.getUserId());  
				        boolean enables = true;  
				        boolean accountNonExpired = true;  
				        boolean credentialsNonExpired = true;  
				        boolean accountNonLocked = true;  
				        User userdetail = new User(String.valueOf(securityUser.getUserId()), securityUser.getUserPass(),  
				                enables, accountNonExpired, credentialsNonExpired,
				                accountNonLocked, grantedAuths);  
				        return userdetail;  
					}
				}
			}
		}
		return null;
	}
	
	
	/**
	 * 根据用户ID查询
	 * @param userId
	 * @return
	 */
	private Collection<GrantedAuthority> obtionGrantedAuthorities(int userId) {
		return new ArrayList<GrantedAuthority>();
	}

}
