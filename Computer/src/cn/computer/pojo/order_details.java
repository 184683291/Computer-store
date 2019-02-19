package cn.computer.pojo;

public class order_details {
private int id;//订单详情id
private order o_id;//订单id
private commodity c_id;//商品id
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public order getO_id() {
	return o_id;
}
public void setO_id(order o_id) {
	this.o_id = o_id;
}
public commodity getC_id() {
	return c_id;
}
public void setC_id(commodity c_id) {
	this.c_id = c_id;
}
}
