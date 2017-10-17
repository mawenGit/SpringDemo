package cn.mldn.mldnspring.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mldn.mldnspring.list.ListDept;
import cn.mldn.mldnspring.set.SetDept;

public class TestSetDept {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springset/spring-setdept.xml");
		SetDept dept = ctx.getBean("deptObj",SetDept.class);
		System.out.println("--" + dept);
		/**
		 * 默认情况下，Spring 会直接使用“LinkerHashSet”子类来作为Set接口的实现子类进行
		 * Set集合的保存。使用 LinkerHashSet 子类可以按照保存顺序进行存储，同时没有重复元素
		 * ，重复元素依靠的是hashCode(),equals()一起判断
		 */
		Iterator<String> rs = dept.getInfos().iterator();
		while (rs.hasNext()) {
			System.out.println("dept.getInfos()+++"+ rs.next());	
		}
		Iterator<String> ms = dept.getMsgs().iterator();
		while (ms.hasNext()) {
			String string = (String) ms.next();
			System.out.println("dept.getMsgs()+++"+ string);	
		}
	}

}
