package cn.mldn.schedule.quartz.QuartzJobBean;

import java.text.SimpleDateFormat;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class MyTask extends QuartzJobBean {

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		System.out.println( " QUARTZJOBVERAR-===== 【当前的日期时间】" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new java.util.Date()));
		
	}

	

}
