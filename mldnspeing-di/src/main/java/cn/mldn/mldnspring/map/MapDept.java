package cn.mldn.mldnspring.map;

import java.io.Serializable;
import java.util.Map;


@SuppressWarnings("serial")
public class MapDept implements Serializable {
	private Long deptno;
	private String dname;
	private Boolean enable;
	private Map<Integer, String> infos;
	private Map<String, Emp> emps;
	
	
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
	public Map<Integer, String> getInfos() {
		return infos;
	}
	public void setInfos(Map<Integer, String> infos) {
		this.infos = infos;
	}
	public Map<String, Emp> getEmps() {
		return emps;
	}
	public void setEmps(Map<String, Emp> emps) {
		this.emps = emps;
	}
	@Override
	public String toString() {
		return "MapDept [deptno=" + deptno + ", dname=" + dname + ", enable=" + enable + ", infos=" + infos + ", emps="
				+ emps + "]";
	}
	
	
}
