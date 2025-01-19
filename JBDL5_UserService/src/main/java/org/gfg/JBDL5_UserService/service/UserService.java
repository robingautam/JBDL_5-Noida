package org.gfg.JBDL5_UserService.service;

import org.gfg.JBDL5_UserService.model.Order;
import org.gfg.JBDL5_UserService.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {


    @Autowired
    RestTemplate restTemplate;

    static List<User> userList;

    static {
        User user1 = new User(1,"Robin","robin@gmail.com","M.V",null);
        User user2 = new User(2,"Preeti","preeti@gmail.com","M.V",null);
        User user3 = new User(3,"Aakash","aakash@gmail.com","M.V",null);
        User user4 = new User(4,"Saksham","sakasham@gmail.com","M.V",null);
        User user5 = new User(5,"Dhoda","dhoda@gmail.com","M.V",null);

        userList = Arrays.asList(user1,user2,user3,user4,user5);

    }


    public User getUserById(int id){
        User userData = null;
        for (User user: userList){
            if (user.getId()==id){
                userData = user;
                break;
            }
        }

       List<Order> orderList = restTemplate.getForObject("http://localhost:8081/order-service/get/orders/"+id, List.class);

        if (userData==null){
            return null;
        }
        userData.setOrderList(orderList);
        return userData;
    }
}
