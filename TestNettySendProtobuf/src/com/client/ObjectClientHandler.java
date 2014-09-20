package com.client;

import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

import com.bean.QQGroupBean;
import com.bean.QQGroupBean.Group;

public class ObjectClientHandler extends SimpleChannelHandler {

	@Override
	public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e)
			throws Exception {

		QQGroupBean.Group.Builder builder = QQGroupBean.Group.newBuilder();
		builder.setGroupName("¶«ÈíµÛ¹ú");
		builder.setGroupNumber("5307397");
		builder.setGroupWeb("http://www.yuyueqianli.com");
		Group groupSend = builder.build();
		
		e.getChannel().write(groupSend);
		
	}
	
}
