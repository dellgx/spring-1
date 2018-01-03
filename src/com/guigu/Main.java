package com.guigu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ͳnew��ʽ���ɶ���
		//HelloWorld hw = new HelloWorld();
		//hw.setName("xiaoming");

		//1.����Spring��IOC����
		//����IOC��������IOC����ʵ��������ApplicationContext����IOC����
		//ClassPathXmlApplicationContext��ApplicationContext�ӿڵ�ʵ����
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.��IOC�����л�ȡbeanʵ��
		//���ֳ��÷�ʽ��getbean��id����getbean��class��
		HelloWorld hw = (HelloWorld)ctx.getBean("hw");
		//HelloWorld hw = ctx.getBean(HelloWorld.class);
		System.out.println(hw);
		
		hw = (HelloWorld) ctx.getBean("hw");
		//3.����hello����
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
