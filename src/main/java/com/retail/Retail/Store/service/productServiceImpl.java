package com.retail.Retail.Store.service;

import com.retail.Retail.Store.entity.Bill;
import com.retail.Retail.Store.entity.Product;
import com.retail.Retail.Store.entity.User;
import com.retail.Retail.Store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class productServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product p) {

       return  productRepository.save(p);

    }

    public List<Product> getAllProduct()
    {
        return productRepository.findAll();
    }


}
