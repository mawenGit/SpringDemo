package cn.mldn.schedule.quartz.springAnnotation;

import java.text.SimpleDateFormat;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 基于Spring配置实现QuartZ调用，不用去强制的继承某一个父类
 * @author Administrator
 *
 */
@Component	//必须明确的告诉Spring,现在的MyTask是一个Spring容器管理的bean
public class MyTask {
	@Scheduled(cron="* * * * * ?")
	public void runTask() {//自己随影定义了一个方法名称
		System.out.println("ANNOTATION SPING  【当前的日期时间】" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new java.util.Date()));
	}
}
