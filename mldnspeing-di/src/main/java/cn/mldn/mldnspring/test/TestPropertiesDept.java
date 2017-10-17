package cn.mldn.mldnspring.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mldn.mldnspring.Properties.Dept;
public class TestPropertiesDept {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-properties/spring-properties.xml");
		Dept dept = ctx.getBean("deptObj",Dept.class);
		System.out.println("--" + dept);
		System.out.println("--" + dept.getInfos());
	}

}
