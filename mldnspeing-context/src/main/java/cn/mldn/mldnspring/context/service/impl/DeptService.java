package cn.mldn.mldnspring.context.service.impl;


import javax.annotation.Resource;///
import org.springframework.stereotype.Service;

import cn.mldn.mldnspring.context.dao.IDeptDAO;
import cn.mldn.mldnspring.context.service.IDeptService;
import cn.mldn.mldnspring.context.vo.Dept;
//==<bean id="deptservice" class="cn.mldn.mldnspring.context.service.impl.DeptService">
@Service
public class DeptService implements IDeptService {
	@Resource //==<property name="deptDAO" ref="deptDAO"/>
	private  IDeptDAO deptDAO;	//定义IDept接口对象
	@Override
	public boolean add(Dept vo) {
		System.out.println("****** DAO 业务层调用*******" );
		return this.deptDAO.doCreate(vo);
	}

}
