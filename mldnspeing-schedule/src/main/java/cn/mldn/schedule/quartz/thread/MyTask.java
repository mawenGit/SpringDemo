package cn.mldn.schedule.quartz.thread;

import java.text.SimpleDateFormat;

/**
 * 基于Spring配置实现QuartZ调用，不用去强制的继承某一个父类
 * @author Administrator
 *
 */
public class MyTask {
	public void runTask() {//自己随影定义了一个方法名称
		System.out.println("QUARTZ SPING  【当前的日期时间】" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new java.util.Date()));
	}
}
