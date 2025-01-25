package org.gfg.JBDL5_UserService.feign;

import org.gfg.JBDL5_UserService.model.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@org.springframework.cloud.openfeign.FeignClient(name = "ORDER-SERVICE")
public interface FeignClient {

    @GetMapping("/order-service/get/orders/{userId}")
     List<Order> getOrderList(@PathVariable("userId") String userId);

}
