package cn.mldn.schedule.quartz.springTask;

import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component	//必须明确的告诉Spring,现在的MyTask是一个Spring容器管理的bean
public class MyTaskSecond {
	@Scheduled(cron="* * * * * ?")
	public void runTask() {//自己随影定义了一个方法名称
		
		System.out.println("THREAD Second ####【 第二个任务 ---当前的日期时间】" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new java.util.Date()));
	}
}
