package cn.mldn.mldnspring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mldn.mldnspring.vo.Dept_1;
import cn.mldn.mldnspring.vo.Emp_0;
import cn.mldn.mldnspring.vo.Emp_1;

public class EmpDept_1_text2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-empd_1p.xml");
		System.out.println(ctx.getBean(Emp_1.class));
		System.out.println(ctx.getBean(Dept_1.class));
	}

}
