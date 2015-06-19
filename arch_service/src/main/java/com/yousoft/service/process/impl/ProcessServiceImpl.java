package com.yousoft.service.process.impl;

import java.net.URL;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yousoft.service.process.ProcessService;

@Service
public class ProcessServiceImpl implements ProcessService {
	/** 日志定义对象. **/
	private static Logger logger = LoggerFactory
			.getLogger(ProcessServiceImpl.class);
	@Autowired
	private RepositoryService repositoryService;

	@Override
	public String createProcessByClasspath(String processDefinitionName)
			throws Exception {
		if (StringUtils.isNotEmpty(processDefinitionName)) {
			// 根据当前线栈获取Classpath下的流程文件.
			URL url = Thread.currentThread().getContextClassLoader()
					.getResource(processDefinitionName);
			if (url == null) {
				throw new Exception("文件 " + processDefinitionName + " 不存在");
			} else {
				logger.info("deploy process by : " + processDefinitionName);
				Deployment deployment = repositoryService.createDeployment()
						.addClasspathResource(processDefinitionName).deploy();
				if (deployment != null)
					return deployment.getId();
			}
		} else {
			throw new Exception("传入classpath下的流程定义文件不能为空");
		}
		return null;
	}

	@Override
	public String createProcessByRemoteUrl(URL remoteURL) throws Exception {
		return null;
	}

	@Override
	public int createProcessInstance(String processId) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
