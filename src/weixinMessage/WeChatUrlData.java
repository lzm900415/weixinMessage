package weixinMessage;

/**
 * 微信授权请求
 */
public class WeChatUrlData {
	/**
	 * 企业Id，换为自己的corpid
	 */
	private String corpid;
	/**
	 * secret自建应用的凭证密钥，corpsecret换为自己的应用secret
	 */
	private String corpsecret;
	/**
	 * 获取ToKen的请求
	 */
	private String Get_Token_Url;
	/**
	 * 发送消息的请求
	 */
	private String SendMessage_Url;

	public String getCorpid() {
		return corpid;
	}

	public void setCorpid(String corpid) {
		this.corpid = corpid;
	}

	public String getCorpsecret() {
		return corpsecret;
	}

	public void setCorpsecret(String corpsecret) {
		this.corpsecret = corpsecret;
	}

	public void setGet_Token_Url(String corpid, String corpsecret) {
		this.Get_Token_Url = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=" + corpid + "&corpsecret="
				+ corpsecret;
	}

	public String getGet_Token_Url() {
		return Get_Token_Url;
	}

	public String getSendMessage_Url() {
		SendMessage_Url = "https://qyapi.weixin.qq.com/cgi-bin/message/send?access_token=";
		return SendMessage_Url;
	}

}
