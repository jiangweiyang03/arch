package com.yousoft.model.util.mail;

import java.util.List;

/**
 * 邮件发送对象
 * @author jiangweiyang01
 */
public class MailSend {
	
	private MailConfig mailConfig;//发件人信息配置
	
	private List<String> mailToList;//邮件收件人列表
	
	private List<String> mailCcList;//邮件抄送人列表
	
	private List<String> mailBccList;//邮件密送人列表
	
	private String mailTitle;//邮件标题
	
	private String mailContent;//邮件内容
	
	private boolean htmlStyle;//是否是html格式邮件
	
	public MailSend(){}

	public MailConfig getMailConfig() {
		return mailConfig;
	}

	public void setMailConfig(MailConfig mailConfig) {
		this.mailConfig = mailConfig;
	}

	public List<String> getMailToList() {
		return mailToList;
	}

	public void setMailToList(List<String> mailToList) {
		this.mailToList = mailToList;
	}

	public List<String> getMailCcList() {
		return mailCcList;
	}

	public void setMailCcList(List<String> mailCcList) {
		this.mailCcList = mailCcList;
	}

	public List<String> getMailBccList() {
		return mailBccList;
	}

	public void setMailBccList(List<String> mailBccList) {
		this.mailBccList = mailBccList;
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

	public boolean isHtmlStyle() {
		return htmlStyle;
	}

	public void setHtmlStyle(boolean htmlStyle) {
		this.htmlStyle = htmlStyle;
	}
	
}
