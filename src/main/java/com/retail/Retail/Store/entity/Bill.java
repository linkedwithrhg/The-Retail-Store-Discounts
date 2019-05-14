package com.retail.Retail.Store.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bill {

    @Id
    private int store_id;

    private int price;

  //  @OneToMany
  //  List<Product> product_list=new ArrayList<>();

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

/*    public List<Product> getProduct_list() {
        return product_list;
    }

    public void setProduct_list(List<Product> product_list) {
        this.product_list = product_list;
    }*/
}
