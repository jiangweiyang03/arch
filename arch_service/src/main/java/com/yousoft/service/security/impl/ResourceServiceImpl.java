package com.yousoft.service.security.impl;

import java.util.Collection;
import java.util.Map;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.stereotype.Service;

import com.yousoft.service.security.ResourceService;

@Service
public class ResourceServiceImpl implements ResourceService {

	@Override
	public Map<String, Collection<ConfigAttribute>> findResourceRoleMap()
			throws RuntimeException {
		return null;
	}

}
