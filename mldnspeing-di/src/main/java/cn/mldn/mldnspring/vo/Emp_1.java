package cn.mldn.mldnspring.vo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Emp_1 implements Serializable {
	private Long  empno;
	private String ename;
	private Double salary;
	private Date hiredate;
	
	private Dept_1 dept;
	public void setDept(Dept_1 dept) {
		this.dept = dept;
	}
	public Dept_1 getDept() {
		return dept;
	}
	
	public Long getEmpno() {
		return empno;
	}
	public void setEmpno(Long empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	@Override
	public String toString() {
		return "Emp_0 [empno=" + empno + ", ename=" + ename + ", salary=" + salary + ", hiredate=" + hiredate + "]";
	}
	
	
}
