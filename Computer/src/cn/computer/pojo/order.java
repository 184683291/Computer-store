package cn.computer.pojo;

import java.util.Date;

public class order {
private int id;//订单id
private users u_id;//订单用户id
private double price;//订单金额
private Date date;//下单日期
private int state;//订单处理状态
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
