package com.yousoft.model.util.mail;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 邮件配置处理类
 * 
 * @author jiangweiyang01
 */
public class MailConfig {
	
	private Logger logger = LoggerFactory.getLogger(MailConfig.class);//日志记录对象

	private String mailHost;// 邮件服务器地址
	
	private Integer mailPort;//邮件服务器端口号

	private String protocolType;// 协议值

	private String mailUser;// 邮箱用户名

	private String mailPass;// 邮箱密码

	private String mailSender;// 邮件发送人地址

	private Authenticator authenticator;// 邮件认证体系
	
	/**
	 * 构造邮箱基本信息参数对象
	 * @param mailHost邮箱主机
	 * @param mailPort邮箱端口
	 * @param protocolType协议类型
	 * @param mailUser邮箱用户名
	 * @param mailPass邮箱密码
	 * @param mailSender发件人地址
	 */
	public MailConfig(String mailHost, Integer mailPort, String protocolType, String mailUser,
			String mailPass, String mailSender) {
		super();
		if(!StringUtils.isEmpty(mailHost)){
			this.mailHost = mailHost;
			if(mailPort!=null){
				this.mailPort = mailPort;
				if(!StringUtils.isEmpty(protocolType)){
					this.protocolType = protocolType;
					if(!StringUtils.isEmpty(mailUser)){
						this.mailUser = mailUser;
						if(!StringUtils.isEmpty(mailPass)){
							this.mailPass = mailPass;
							if(!StringUtils.isEmpty(mailSender)){
								this.mailSender = mailSender;
								//构造用户认证对象
								final String userCode = this.mailUser;
								final String userPass = this.mailPass;
								this.authenticator = new Authenticator(){
									@Override
									protected PasswordAuthentication getPasswordAuthentication() {
										return new PasswordAuthentication(userCode,userPass);
									}
								};
							}
						} else {
							logger.error("mailPass没有传入值");
						}
					} else {
						logger.error("mailUser没有传入值");
					}
				} else {
					logger.error("protocolType没有传入值");
				}
			} else {
				logger.error("mailPort没有传入值");
			}
		} else {
			logger.error("mailHost没有传入值");
		}
	}

	public String getMailHost() {
		return mailHost;
	}

	public void setMailHost(String mailHost) {
		this.mailHost = mailHost;
	}
	
	public Integer getMailPort() {
		return mailPort;
	}

	public void setMailPort(Integer mailPort) {
		this.mailPort = mailPort;
	}

	public String getProtocolType() {
		return protocolType;
	}

	public void setProtocolType(String protocolType) {
		this.protocolType = protocolType;
	}

	public String getMailUser() {
		return mailUser;
	}

	public void setMailUser(String mailUser) {
		this.mailUser = mailUser;
	}

	public String getMailPass() {
		return mailPass;
	}

	public void setMailPass(String mailPass) {
		this.mailPass = mailPass;
	}

	public String getMailSender() {
		return mailSender;
	}

	public void setMailSender(String mailSender) {
		this.mailSender = mailSender;
	}

	public Authenticator getAuthenticator() {
		return authenticator;
	}

}
