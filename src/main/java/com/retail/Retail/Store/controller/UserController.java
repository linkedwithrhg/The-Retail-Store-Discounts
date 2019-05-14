package com.retail.Retail.Store.controller;

import com.retail.Retail.Store.entity.Bill;
import com.retail.Retail.Store.entity.Product;
import com.retail.Retail.Store.entity.User;
import com.retail.Retail.Store.service.UserServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserServiceimpl userServiceimpl;

    @PostMapping(value = "/addUser")
    public User addUser(@RequestBody User user)
    {
       return userServiceimpl.addUser(user);
    }

    @PostMapping(value = "/getBill/{userId}")
    public int getBillBasedOnUser(@PathVariable("userId") Long id, @RequestBody List<Product> listProduct)
    {

       return userServiceimpl.getBillOFEmployee(id,listProduct);
    }

    @GetMapping(value = "/getAllUsers")
    public List<User> getAllUser()
    {
        return userServiceimpl.getAllUser();
    }
}
