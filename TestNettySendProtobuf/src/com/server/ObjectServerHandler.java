package com.server;

import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

import com.bean.QQGroupBean;
import com.bean.QQGroupBean.Group;

public class ObjectServerHandler extends SimpleChannelHandler {

	
	@Override
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e)
			throws Exception {
		
		QQGroupBean.Group group = (Group) e.getMessage();
		
		System.out.println(group.getGroupName());
		System.out.println(group.getGroupNumber());
		System.out.println(group.getGroupWeb());
		
	}
	
}
