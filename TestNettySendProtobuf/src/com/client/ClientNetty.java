package com.client;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory;
import org.jboss.netty.handler.codec.protobuf.ProtobufDecoder;
import org.jboss.netty.handler.codec.protobuf.ProtobufEncoder;
import org.jboss.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import org.jboss.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import org.jboss.netty.handler.codec.string.StringEncoder;

import com.bean.QQGroupBean;

public class ClientNetty {
	

	public static void main(String[] args) {
		ClientBootstrap boot = new ClientBootstrap(new NioClientSocketChannelFactory(Executors.newCachedThreadPool(),Executors.newCachedThreadPool()));

		//解码 解码
		boot.getPipeline().addLast("frameDecoder", new ProtobufVarint32FrameDecoder());  
		boot.getPipeline().addLast("protobufDecoder", new ProtobufDecoder(QQGroupBean.Group.getDefaultInstance()));  
		boot.getPipeline().addLast("frameEncoder", new ProtobufVarint32LengthFieldPrepender());  
		boot.getPipeline().addLast("protobufEncoder", new ProtobufEncoder());  
		//业务
		boot.getPipeline().addLast("handler", new ObjectClientHandler());
		//连接
		ChannelFuture future = boot.connect(new InetSocketAddress("127.0.0.1",8090));
		
		future.getChannel().getCloseFuture().awaitUninterruptibly();
		
		boot.releaseExternalResources();
	}
	
}
