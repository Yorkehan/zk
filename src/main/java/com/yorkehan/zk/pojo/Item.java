package com.yorkehan.zk.pojo;


import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_item")
public class Item {

  @Id
  private long id;
  private String title;
  private String sellPoint;
  private long price;
  private long num;
  private String barcode;
  private String image;
  private long cid;
  private long status;
  private java.sql.Timestamp created;
  private java.sql.Timestamp updated;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getSellPoint() {
    return sellPoint;
  }

  public void setSellPoint(String sellPoint) {
    this.sellPoint = sellPoint;
  }


  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }


  public long getNum() {
    return num;
  }

  public void setNum(long num) {
    this.num = num;
  }


  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }


  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  public long getCid() {
    return cid;
  }

  public void setCid(long cid) {
    this.cid = cid;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public java.sql.Timestamp getCreated() {
    return created;
  }

  public void setCreated(java.sql.Timestamp created) {
    this.created = created;
  }


  public java.sql.Timestamp getUpdated() {
    return updated;
  }

  public void setUpdated(java.sql.Timestamp updated) {
    this.updated = updated;
  }

}
