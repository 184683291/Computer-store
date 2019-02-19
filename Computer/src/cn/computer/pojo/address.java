package cn.computer.pojo;

public class address {
 private int id;//地址id
 private users u_id;//用户id
 private String name;//收获人姓名
 private String phone;//收获人手机
 private String province;//省
 private String city;//市
 private String district;//县||区
 private String detailed_address;//详细地址
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public users getU_id() {
	return u_id;
}
public void setU_id(users u_id) {
	this.u_id = u_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
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
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public String getDetailed_address() {
	return detailed_address;
}
public void setDetailed_address(String detailed_address) {
	this.detailed_address = detailed_address;
}
 
 
}
