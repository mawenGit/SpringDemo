package cn.mldn.schedule.jdk;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

/**
 * JDK内部提供的定时调度
 * @author Administrator
 *
 */
class MyTask extends TimerTask{
	@Override
	public void run() {
		System.out.println("当前的日期时间 " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new java.util.Date()));
	}
	
}

public class MyTaskDemo {
	public static void main(String[] args) {
		 Timer time = new Timer();
		 time.schedule(new MyTask(),0,1000);	//立即启动，没有延迟，并且每秒执行一次
	}
	
	
}

