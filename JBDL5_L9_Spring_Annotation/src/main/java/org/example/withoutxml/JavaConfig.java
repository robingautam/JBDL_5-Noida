package org.example.withoutxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "org.example.withoutxml")
public class JavaConfig {

    @Bean(name = "address1")
    public Address getAddress(){
        Address address = new Address();
        address.setStreet("M.V.ph1");
        return address;
    }

    @Bean(name = "address2")
    public Address getAddress2(){
        Address address = new Address();
        address.setStreet("M.V.ph56");
        return address;
    }
}
