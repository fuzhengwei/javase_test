package com.drdg.emp;

import com.drdg.emp.DrdgProbuf.Emp;
import com.google.protobuf.InvalidProtocolBufferException;


public class T {

	public static void main(String[] args) throws Exception {

		/**************************************************************************************************************
		 *create by fuzhengwei
		   * ����bulider�洢����
		  **************************************************************************************************************/
		DrdgProbuf.Emp.Builder bulider = DrdgProbuf.Emp.newBuilder();
		
		bulider.setEmpName("����۹�Ⱥ");
		bulider.setEmpQQ("5307397");
		bulider.setEmpWeb("http://www.yuyueqianli.com");
		
		Emp empSend = bulider.build();
		byte[] bufSend = empSend.toByteArray();
		
		System.out.println("׼�����͵�byte�ַ�-> "+bufSend);
		
		/**************************************************************************************************************
		  * ģ�ⷴ�ͺ���ܵ����ݣ�����
		  **************************************************************************************************************/
		
		Emp empReceive = DrdgProbuf.Emp.parseFrom(bufSend);
		System.out.println("\r\n����������յ������ݣ�");
		System.out.println(empReceive.getEmpName());
		System.out.println(empReceive.getEmpQQ());
		System.out.println(empReceive.getEmpWeb());
		
	}

}
