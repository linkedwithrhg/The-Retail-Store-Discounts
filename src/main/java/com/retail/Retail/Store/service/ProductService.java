package com.retail.Retail.Store.service;

import com.retail.Retail.Store.entity.Product;
import com.retail.Retail.Store.entity.Store;
import javafx.scene.control.ScrollToEvent;

import java.util.List;

public interface ProductService {

    Product addProduct(Product p);
    List<Product> getAllProduct();
    Store addStore(Store store);

}
