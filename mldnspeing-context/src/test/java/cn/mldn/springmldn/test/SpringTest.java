package cn.mldn.springmldn.test;
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import cn.mldn.mldnspring.context.service.IDeptService;
import cn.mldn.mldnspring.context.vo.Dept;
/**
 * Spring 测试类
 */
import junit.framework.TestCase;
@ContextConfiguration(locations= {"classpath:spring/spring-context.xml"})//进行资源文件的定位
@RunWith(SpringJUnit4ClassRunner.class)	//设置要使用的测试工具
public class SpringTest  extends TestCase{
	@Resource	//负责注入
	private IDeptService deptservice;	//直接注入业务对象
	@Test
	public void testadd() {
		 Dept dept = new Dept();
		dept.setDeptno(10L);
		dept.setDname("财务部");
		TestCase.assertTrue(this.deptservice.add(dept));
	}

}

















