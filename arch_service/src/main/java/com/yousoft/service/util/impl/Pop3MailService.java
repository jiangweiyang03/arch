package com.yousoft.service.util.impl;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.InternetAddress;
import javax.mail.search.FromTerm;
import javax.mail.search.SearchTerm;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yousoft.model.util.mail.MailConfig;
import com.yousoft.model.util.mail.MailReceive;
import com.yousoft.service.util.MailService;

public class Pop3MailService implements MailService {

	private static Logger logger = LoggerFactory
			.getLogger(Pop3MailService.class);
	
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

	@Override
	public int sendMail(MailConfig mailConfig, MailReceive mailReceive) {
		return 0;
	}

	@Override
	public List<MailReceive> receiveMail(MailConfig mailConfig) {
		if (mailConfig != null) {
			try {
				// 准备连接服务器的会话信息
				Properties props = new Properties();
				props.setProperty("mail.store.protocol", "pop3"); // 协议
				props.setProperty("mail.pop3.port",
						String.valueOf(mailConfig.getMailPort())); // 端口
				props.setProperty("mail.pop3.host", mailConfig.getMailHost()); // pop3服务器
				// 创建Session实例对象
				Session session = Session.getInstance(props);
				Store store = session.getStore("pop3");
				store.connect(mailConfig.getMailUser(),
						mailConfig.getMailPass());// 连接登录邮箱
				// 获得收件箱
				Folder folder = store.getFolder("INBOX");
				folder.open(Folder.READ_WRITE); // 打开收件箱
				SearchTerm searchTerm = new FromTerm(new InternetAddress("customer_service@jd.com"));
				Message[] messageArray = folder.search(searchTerm);
				for(Message message : messageArray){
					System.out.println(message.getSubject()+"\t"+format.format(message.getSentDate()));
				}
				// 释放资源
				folder.close(true);
				store.close();

				return null;
			} catch (MessagingException e1) {
				logger.error(ExceptionUtils.getMessage(e1));
			}
		} else {
			logger.warn("receiveMail:mailConfig传入参数为空");
		}
		return null;
	}

}
