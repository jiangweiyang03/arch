package com.yousoft.service.util.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yousoft.model.util.mail.MailConfig;
import com.yousoft.model.util.mail.MailReceive;
import com.yousoft.model.util.mail.ProtocolType;
import com.yousoft.service.util.MailService;

public class MailServiceImpl implements MailService {
	/**日志记录对象**/
	private static Logger logger = LoggerFactory.getLogger(MailServiceImpl.class);

	@Override
	public int sendMail(MailConfig mailConfig, MailReceive mailReceive) {
		if(mailConfig!=null&&mailReceive!=null){
			String protocolType = mailConfig.getProtocolType();//获取协议类型
			if(!StringUtils.isEmpty(protocolType)){
				//协议类型不为空处理
				if(ProtocolType.POP3.equals(protocolType)){
					//如果是POP3类型协议
				} else if(ProtocolType.SMTP.equals(protocolType)){
					//如果SMTP类型协议
				}
			} else {
				logger.warn("sendMail:传入的协议类型为啊");
				return MailService.EXCEPTION;
			}
		} else {
			logger.warn("sendMail:传入的参数为空");
		}
		return 0;
	}

	@Override
	public List<MailReceive> receiveMail(MailConfig mailConfig) {
		return null;
	}

}
