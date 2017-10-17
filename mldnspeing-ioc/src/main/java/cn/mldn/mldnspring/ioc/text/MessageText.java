package cn.mldn.mldnspring.ioc.text;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mldn.mldnspring.ioc.service.IMessage;

public class MessageText {

	public static void main(String[] args) {
		// 启动Spring 上下文，在以后的实际开发过程之中，这一启动过程会由WEB容器负责
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-ioc.xml");
		 IMessage meassge = ctx.getBean("messageImpl",IMessage.class);	//获取实例化对象
		 System.out.println(meassge.echo("www.mldn.cn"));
		 
		 
	
	}

}
