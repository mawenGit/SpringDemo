package cn.mldn.mldnspring.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Dept_1 implements Serializable {
	private Long deptno;
	private String dname;
	private Boolean enable;
	
	public Long getDeptno() {
		return deptno;
	}
	public void setDeptno(Long deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Boolean getEnable() {
		return enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
	
	@Override
	public String toString() {
		return "Dept_1 [deptno=" + deptno + ", dname=" + dname + ", enable=" + enable + "]";
	}
	 
}
