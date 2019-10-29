package weixinMessage;

/**
 * 微信消息发送实体类
 */
public class WeChatData {
	// 发送微信消息的URLString
	// sendMsgUrl="https://qyapi.weixin.qq.com/cgi-bin/message/send?access_token=ACCESS_TOKEN";
	/**
	 * 成员ID列表（消息接收者，多个接收者用‘|’分隔，最多支持1000个），特殊情况：指定为@all，则向该企业应用的全部成员发送。
	 */
	private String touser;
	/**
	 * 消息类型，这里固定为：text
	 */
	private String msgtype;
	/**
	 * 企业应用的id，整型。
	 */
	private int agentid;
	/**
	 * 实际接收Map类型数据
	 */
	private Object text;

	public Object getText() {
		return text;
	}

	public void setText(Object text) {
		this.text = text;
	}

	public String getMsgtype() {
		return msgtype;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}

	public int getAgentid() {
		return agentid;
	}

	public void setAgentid(int agentid) {
		this.agentid = agentid;
	}

	public String getTouser() {
		return touser;
	}

	public void setTouser(String touser) {
		this.touser = touser;
	}
}
