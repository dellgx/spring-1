package com.atguigu.beans.properties;


import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-properties.xml");

//		mchange-commons-java-0.2.3.4��c3p0���ݿ����ӳصĸ�������û�������ϵͳ������ʱ��ᱨclassnotfoundexception������c3p0-0.9.2�汾���������İ���0.9.1��ʱ����һ�����͸㶨��		
		
		DataSource datasource = (DataSource) ctx.getBean("datasource");
		System.out.println(datasource.getConnection());
		

	
	
	}	
		
}
