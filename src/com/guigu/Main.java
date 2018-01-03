package com.guigu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//传统new方式生成对象
		//HelloWorld hw = new HelloWorld();
		//hw.setName("xiaoming");

		//1.创建Spring的IOC容器
		//创建IOC容器对象（IOC容器实例化），ApplicationContext代表IOC容器
		//ClassPathXmlApplicationContext是ApplicationContext接口的实现类
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.从IOC容器中获取bean实例
		//两种常用方式：getbean（id），getbean（class）
		HelloWorld hw = (HelloWorld)ctx.getBean("hw");
		//HelloWorld hw = ctx.getBean(HelloWorld.class);
		System.out.println(hw);
		
		hw = (HelloWorld) ctx.getBean("hw");
		//3.调用hello方法
		hw.hello();
		
		Car car =(Car)ctx.getBean("car");
		System.out.println("car1:"+car);
		
		car =(Car)ctx.getBean("car2");
		System.out.println("car2:"+car);
		
		Person person =  (Person) ctx.getBean("person2");
		System.out.println(person);

		person = (Person) ctx.getBean("person");
		System.out.println(person);

	}

	
}
