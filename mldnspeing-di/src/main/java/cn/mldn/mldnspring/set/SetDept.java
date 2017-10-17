package cn.mldn.mldnspring.set;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@SuppressWarnings("serial")
public class SetDept implements Serializable {
	private Long deptno;
	private String dname;
	private Boolean enable;
	private Set<String> infos;
	private List<String> msgs;
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
	public Set<String> getInfos() {
		return infos;
	}
	public void setInfos(Set<String> infos) {
		this.infos = infos;
	}
	public List<String> getMsgs() {
		return msgs;
	}
	public void setMsgs(List<String> msgs) {
		this.msgs = msgs;
	}
	
	@Override
	public String toString() {
		return "SetDept [deptno=" + deptno + ", dname=" + dname + ", enable=" + enable + ", infos=" + infos + ", msgs="
				+ msgs + "]";
	}
			
}
