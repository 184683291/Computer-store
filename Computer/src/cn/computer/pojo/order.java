package cn.computer.pojo;

import java.util.Date;

public class order {
private int id;//����id
private users u_id;//�����û�id
private double price;//�������
private Date date;//�µ�����
private int state;//��������״̬
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
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public int getState() {
	return state;
}
public void setState(int state) {
	this.state = state;
}
}
