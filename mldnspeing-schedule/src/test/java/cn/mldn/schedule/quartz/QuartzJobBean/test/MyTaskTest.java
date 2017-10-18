package cn.mldn.schedule.quartz.QuartzJobBean.test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.TestCase;
@ContextConfiguration(locations= {"classpath:spring/spring-springAnnotation.xml"})
@RunWith(SpringJUnit4ClassRunner.class)	//设置要使用的测试工具
public class MyTaskTest  extends TestCase{
	@Test
	public void testQuartZ() {
		try {
			TimeUnit.MINUTES.sleep(10);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
}




































