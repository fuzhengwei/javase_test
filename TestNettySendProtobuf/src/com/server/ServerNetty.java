package com.server;

import java.net.InetSocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;
import org.jboss.netty.handler.codec.protobuf.ProtobufDecoder;
import org.jboss.netty.handler.codec.protobuf.ProtobufEncoder;
import org.jboss.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import org.jboss.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import org.jboss.netty.handler.codec.serialization.ObjectDecoder;
import org.jboss.netty.handler.codec.serialization.ObjectEncoder;
import org.jboss.netty.handler.codec.string.StringDecoder;

import com.bean.QQGroupBean;

public class ServerNetty {

	public static void main(String[] args) {
		
		ServerBootstrap boot = new ServerBootstrap(new NioServerSocketChannelFactory(Executors.newCachedThreadPool(),Executors.newCachedThreadPool()));
		
		//编码 解码
		boot.getPipeline().addLast("frameDecoder", new ProtobufVarint32FrameDecoder());  
		boot.getPipeline().addLast("protobufDecoder", new ProtobufDecoder(QQGroupBean.Group.getDefaultInstance()));  
		boot.getPipeline().addLast("frameEncoder", new ProtobufVarint32LengthFieldPrepender());  
		boot.getPipeline().addLast("protobufEncoder", new ProtobufEncoder());  
		//业务
		boot.getPipeline().addLast("handler", new ObjectServerHandler());
		
		boot.bind(new InetSocketAddress(8090));
		
		System.out.println("--服务器开启成功等待连接... ...\r\n");
		
	}
	
}
