package cn.computer.pojo;

public class commodity {
private int id;//��Ʒid
private brand b_id;//Ʒ��id
private type t_id;//����id
private accessories a_id;//���id
private product p_id;//ϵ��id
private String name;//��Ʒ����
private String price;//��Ʒ�۸�
private String Image_path;//��ƷͼƬ·��
private String inventory;//��Ʒ���
private String number;//������
private String description;//������
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public brand getB_id() {
	return b_id;
}
public void setB_id(brand b_id) {
	this.b_id = b_id;
}
public type getT_id() {
	return t_id;
}
public void setT_id(type t_id) {
	this.t_id = t_id;
}
public accessories getA_id() {
	return a_id;
}
public void setA_id(accessories a_id) {
	this.a_id = a_id;
}
public product getP_id() {
	return p_id;
}
public void setP_id(product p_id) {
	this.p_id = p_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getImage_path() {
	return Image_path;
}
public void setImage_path(String image_path) {
	Image_path = image_path;
}
public String getInventory() {
	return inventory;
}
public void setInventory(String inventory) {
	this.inventory = inventory;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
}
