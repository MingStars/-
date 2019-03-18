package cn.ming.pojo;

import java.sql.Date;

public class Book {
private Integer id;
private String name;
private String author;
private String publish;
private Date publishdate;
private Integer page;
private Integer price;
private String content;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getPublish() {
	return publish;
}
public void setPublish(String publish) {
	this.publish = publish;
}
public Date getPublishdate() {
	return publishdate;
}
public void setPublishdate(Date publishdate) {
	this.publishdate = publishdate;
}
public Integer getPage() {
	return page;
}
public void setPage(Integer page) {
	this.page = page;
}
public Integer getPrice() {
	return price;
}
public void setPrice(Integer price) {
	this.price = price;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
@Override
public String toString() {
	return "book [id=" + id + ", name=" + name + ", author=" + author + ", publish=" + publish + ", publishdate="
			+ publishdate + ", page=" + page + ", price=" + price + ", content=" + content + "]";
}

}
