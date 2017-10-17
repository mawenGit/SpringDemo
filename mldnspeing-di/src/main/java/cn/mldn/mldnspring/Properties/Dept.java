package cn.mldn.mldnspring.Properties;

import java.io.Serializable;
import java.util.Map;
import java.util.Properties;


@SuppressWarnings("serial")
public class Dept implements Serializable {
	private Long deptno;
	private String dname;
	private Boolean enable;
	private Properties infos;

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

	public Properties getInfos() {
		return infos;
	}

	public void setInfos(Properties infos) {
		this.infos = infos;
	}
	
}
