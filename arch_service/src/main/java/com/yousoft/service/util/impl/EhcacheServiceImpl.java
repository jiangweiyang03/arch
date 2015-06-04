package com.yousoft.service.util.impl;

import org.springframework.stereotype.Service;

import com.yousoft.service.util.CacheService;

@Service
public class EhcacheServiceImpl implements CacheService {

	/**构造函数,用于初始化ehcache缓存容器**/
	public EhcacheServiceImpl() {
		
	}

	@Override
	public void putCacheValue(String key, Object value) throws RuntimeException {

	}

	@Override
	public Object getCacheValue(String key) throws RuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void emptyCache() throws RuntimeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void loadBasicCache() throws RuntimeException {
		// TODO Auto-generated method stub

	}

}
