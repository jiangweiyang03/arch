package com.yousoft.model.util.mail;

import java.util.List;

/**
 * 邮件接收对象
 * @author jiangweiyang01
 */
public class MailReceive {
	
	private String mailSender;//邮件发送人
	
	private List<String> mailCcList;//邮件抄送人列表
	
	private String mailTitle;//邮件标题
	
	private String mailContent;//邮件内容
	
	private String sendTime;//邮件发送时间
	
	public MailReceive(){}

	public String getMailSender() {
		return mailSender;
	}

	public void setMailSender(String mailSender) {
		this.mailSender = mailSender;
	}

	public List<String> getMailCcList() {
		return mailCcList;
	}

	public void setMailCcList(List<String> mailCcList) {
		this.mailCcList = mailCcList;
	}

	public String getMailTitle() {
		return mailTitle;
	}

	public void setMailTitle(String mailTitle) {
		this.mailTitle = mailTitle;
	}

	public String getMailContent() {
		return mailContent;
	}

	public void setMailContent(String mailContent) {
		this.mailContent = mailContent;
	}

	public String getSendTime() {
		return sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

}
