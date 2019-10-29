package test;

import java.io.IOException;

import weixinMessage.WeChatMsgSend;
import weixinMessage.WeChatUrlData;

public class Test {

	public static void main(String[] args) {
		WeChatMsgSend swx = new WeChatMsgSend();
		try {
			String token = swx.getToken("ww761e079598c7d41e", "5SWqSX08_1mCxunF1JPOIutckowqjzxuFZMGY4W7wco");
			String postdata = swx.createpostdata("@all", "text", 1000002, "content", "发送测试微信消息");
			// String token = swx.getToken("wwf2080dbc1ea3c3bd",
			// "313mcNj-mHZEM6XsfKt49y4-A7X-yHVU4JlqmuqEiWA");
			// String postdata = swx.createpostdata("@all", "text", 1000003,
			// "content", "发送测试微信消息");
			String resp = swx.post("utf-8", WeChatMsgSend.CONTENT_TYPE, new WeChatUrlData().getSendMessage_Url(),
					postdata, token);
			System.out.println("获取到的token======>" + token);
			System.out.println("请求数据======>" + postdata);
			System.out.println("发送微信的响应数据======>" + resp);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
