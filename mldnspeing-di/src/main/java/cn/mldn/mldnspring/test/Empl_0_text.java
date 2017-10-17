package cn.mldn.mldnspring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mldn.mldnspring.vo.Emp_0;

public class Empl_0_text {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-emp_0.xml");
		System.out.println(ctx.getBean(Emp_0.class));
	}

}
