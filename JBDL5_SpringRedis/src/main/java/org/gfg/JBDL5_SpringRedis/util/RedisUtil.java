package org.gfg.JBDL5_SpringRedis.util;

import org.gfg.JBDL5_SpringRedis.config.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

@Component
public class RedisUtil {

    @Autowired
    RedisTemplate<String, User> redisTemplate;


    public void setExpirableKey(String key, User value, long time){
        redisTemplate.opsForValue().set(key,value,time, TimeUnit.SECONDS);
    }

    public void setNonExpirableKey(String key, User value){
        redisTemplate.opsForValue().set(key,value);
    }

    public User getDataFromRedis(String key){
        return redisTemplate.opsForValue().get(key);
    }

}
