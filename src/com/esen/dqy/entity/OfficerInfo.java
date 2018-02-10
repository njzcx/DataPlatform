package com.esen.dqy.entity;

public class OfficerInfo {
	private String id;
	private String username; //姓名
	private String province; //省
	private String city; //市
	private String taxdept; //税务部门
	private String department; //部门
	private String tel; //电话
	private String email; //邮箱
	private String filename; //文件名称
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTaxdept() {
		return taxdept;
	}
	public void setTaxdept(String taxdept) {
		this.taxdept = taxdept;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	@Override
	public String toString() {
		return "OfficerInfo [id=" + id + ", username=" + username
				+ ", province=" + province + ", city=" + city + ", taxdept="
				+ taxdept + ", department=" + department + ", tel=" + tel
				+ ", email=" + email + ", filename=" + filename + "]";
	}
	
}
