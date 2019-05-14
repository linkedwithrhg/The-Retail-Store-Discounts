package com.retail.Retail.Store.controller;

import com.retail.Retail.Store.entity.Bill;
import com.retail.Retail.Store.entity.Product;
import com.retail.Retail.Store.entity.User;
import com.retail.Retail.Store.service.UserServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    Date CuDate= new Date();
    @Autowired
    private UserServiceimpl userServiceimpl;

    @PostMapping(value = "/addUser")
    public User addUser(@RequestBody User user)
    {
//        user.setCreated_date(CuDate);

        System.out.println("Hello" + user.getCreated_date());
        System.out.println("Hello" + user.getUser_name());
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
