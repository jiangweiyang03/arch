package com.yousoft.model.util.mail;

/**
 * 协议枚举值
 * @author jiangweiyang01
 */
public enum ProtocolType {

	SMTP("smtp"), POP3("pop3");
	
	private String value;

	private ProtocolType(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
