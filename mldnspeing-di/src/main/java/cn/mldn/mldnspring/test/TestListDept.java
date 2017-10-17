package cn.mldn.mldnspring.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mldn.mldnspring.list.ListDept;

public class TestListDept {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springlist/spring-listdept2.xml");
		 ListDept dept = ctx.getBean("deptobj",ListDept.class);
		 System.out.println("--" + dept);
		 System.out.println("**" + Arrays.toString(dept.getEmps()));//数组
		 System.out.println("///" + Arrays.toString(dept.getInfos()));//数组

	}

}
