package com.atguigu.beans.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcesBeforeInitialization..."+bean+","+beanName);

		if("car".equals(beanName)) {
			//beforeinit操作是针对容器中所有的bean，所以这里可以做个过滤
			
		}
		
		return bean;
		//return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessAfterInitialization..."+bean+","+beanName);
		Car car=new Car();
		car.setBrand("Ford");
		return car;

		//return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

}
