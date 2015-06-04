package com.yousoft.service.process;

import java.net.URL;

/**
 * 流程服务接口
 * @author jiangweiyang01
 * @version 1.0
 * @since 2015/06/01
 */
public interface ProcessService {
	
	/**
	 * 根据classpath下面部署的流程文件创建流程
	 * @param processDefinitionName 当前classpath下的流程定义文件
	 * @return 流程ID
	 * @throws Exception
	 */
	public String createProcessByClasspath(String processDefinitionName) throws Exception;
	
	/**
	 * 根据远程URL地址获取流程实例图进行流程部署
	 * @param remoteURL 远程URL
	 * @return 流程ID
	 * @throws Exception
	 */
	public String createProcessByRemoteUrl(URL remoteURL) throws Exception;
	
	/**
	 * 根据流程ID创建流程实例信息
	 * @param processId			流程ID
	 * @return			流程实例ID
	 * @throws Exception
	 */
	public int createProcessInstance(String processId) throws Exception;
	

}
