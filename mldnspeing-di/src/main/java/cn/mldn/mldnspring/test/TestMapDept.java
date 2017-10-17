package cn.mldn.mldnspring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mldn.mldnspring.map.Emp;
import cn.mldn.mldnspring.map.MapDept;


public class TestMapDept {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springmap/spring-mapdept.xml");
		MapDept dept = ctx.getBean("deptObj",MapDept.class);
//		System.out.println("--" + emp);
		System.out.println("--" + dept);
		
	}

}
