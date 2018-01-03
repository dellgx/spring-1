package com.atguigu.beans.properties;


import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-properties.xml");

//		mchange-commons-java-0.2.3.4是c3p0数据库连接池的辅助包，没有这个包系统启动的时候会报classnotfoundexception，这是c3p0-0.9.2版本后分离出来的包，0.9.1的时候还是一个包就搞定的		
		
		DataSource datasource = (DataSource) ctx.getBean("datasource");
		System.out.println(datasource.getConnection());
		

	
	
	}	
		
}
