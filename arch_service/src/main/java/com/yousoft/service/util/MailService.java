package com.yousoft.service.util;

import java.util.List;

import com.yousoft.model.util.mail.MailConfig;
import com.yousoft.model.util.mail.MailReceive;

/**
 * 邮件服务处理接口
 * @author jiangweiyang01
 * @since 2015/05/24
 */
public interface MailService {
	
	public static int SUCCESS = 0;
	public static int FAILURE = 1;
	public static int EXCEPTION = 2;
	
	/**
	 * 发送邮件
	 * @param mailConfig 当前发送邮件人的用户邮件信息
	 * @param mailReceive 邮件收件人的相关信息
	 * @return 邮件发送状态
	 */
	public int sendMail(MailConfig mailConfig, MailReceive mailReceive);
	
	/**
	 * 从远程服务器中获取邮件信息
	 * @param mailConfig 当前邮件用户的邮箱配置信息
	 * @return
	 */
	public List<MailReceive> receiveMail(MailConfig mailConfig);
	
	
	

}
