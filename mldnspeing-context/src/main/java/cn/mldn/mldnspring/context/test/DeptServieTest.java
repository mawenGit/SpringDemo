package cn.mldn.mldnspring.context.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mldn.mldnspring.context.service.IDeptService;
import cn.mldn.mldnspring.context.vo.Dept;

public class DeptServieTest {

	public static void main(String[] args) {
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-context.xml");//加载所有的配置文件
		 IDeptService deptservice = ctx.getBean("deptService",IDeptService.class);
		 Dept dept = new Dept();
		 dept.setDeptno(10L);
		 dept.setDname("财务部");
		 System.out.println("===" + deptservice.add(dept));
		  
		  
		  
		  
		  
		  
		 
	
	}

}
