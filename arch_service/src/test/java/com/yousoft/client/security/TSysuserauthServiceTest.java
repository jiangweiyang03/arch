package com.yousoft.client.security;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.yousoft.model.security.view.SecurityUser;
import com.yousoft.service.security.AuthService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:arch-spring.xml"})
public class TSysuserauthServiceTest {
	
	@Autowired
	private AuthService authService;
	
	@Test
	public void testAuth(){
		try{
			SecurityUser user = authService.findSecurityUserByLoginCode("picc");
			Assert.isNull(user);
		} catch (Exception ex){
			ex.printStackTrace();
		}
	}

}
