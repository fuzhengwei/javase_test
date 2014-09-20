package com.drdg.emp;

import com.drdg.emp.DrdgProbuf.Emp;
import com.google.protobuf.InvalidProtocolBufferException;


public class T {

	public static void main(String[] args) throws Exception {

		/**************************************************************************************************************
		 *create by fuzhengwei
		   * 建立bulider存储数据
		  **************************************************************************************************************/
		DrdgProbuf.Emp.Builder bulider = DrdgProbuf.Emp.newBuilder();
		
		bulider.setEmpName("东软帝国群");
		bulider.setEmpQQ("5307397");
		bulider.setEmpWeb("http://www.yuyueqianli.com");
		
		Emp empSend = bulider.build();
		byte[] bufSend = empSend.toByteArray();
		
		System.out.println("准备发送的byte字符-> "+bufSend);
		
		/**************************************************************************************************************
		  * 模拟反送后接受到数据，解析
		  **************************************************************************************************************/
		
		Emp empReceive = DrdgProbuf.Emp.parseFrom(bufSend);
		System.out.println("\r\n解析输出接收到的数据：");
		System.out.println(empReceive.getEmpName());
		System.out.println(empReceive.getEmpQQ());
		System.out.println(empReceive.getEmpWeb());
		
	}

}
