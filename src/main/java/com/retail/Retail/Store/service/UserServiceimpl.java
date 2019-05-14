package com.retail.Retail.Store.service;


import com.retail.Retail.Store.entity.Product;
import com.retail.Retail.Store.entity.User;
import com.retail.Retail.Store.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceimpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Boolean deleteUser(int id) {
        return null;
    }

    @Override
    public User addUser(User user) {
        System.out.println("Inside IMPL");
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser()
    {
        return userRepository.findAll();
    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    public int getBillOFEmployee(Long id, List<Product> productList)
    {
        int finalBill=0;
        Optional<User> u=userRepository.findById(id);
        User user=u.get();
        if(user.getRole().equalsIgnoreCase("Employee"))
        {
            int sum=0;
            for(Product p:productList)
            {
                if(!p.getProduct_type().equalsIgnoreCase("groceries"))
                {
                    sum=sum+p.getPrice();
                }

            }

            if(sum<100)
            {
                finalBill=sum*10/100;
            }
            else
            {
                int dis=sum/100;
                finalBill=finalBill-dis;
            }



        }

        else
        {
            int sum=0;
            for(Product p:productList)
            {
                sum=sum+p.getPrice();
            }

            if(sum<100)
            {
                finalBill=sum*30/100;
            }
            else
            {
                int dis=sum/100;
                finalBill=finalBill-dis;
            }
        }
        return finalBill;
    }
}
