package com.example.demo.service;

import com.example.demo.entity.Demo;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Cacheable(value = "a", key = "#demo.id  +':'+  #demo.name", sync = true)
    public Demo getEntity(Demo demo) {
        Demo d = new Demo();
        d.setId(demo.getId() + 1L);
        d.setName("emperor's " + demo.getName());
        System.out.println("a no cache " + System.currentTimeMillis());
        return d;
    }

    @Cacheable(value = "b", key = "#demo.id  +':'+  #demo.name", cacheManager = "myCacheManager", sync = true)
    public Demo getEntity2(Demo demo) {
        Demo d = new Demo();
        d.setId(demo.getId() + 2L);
        d.setName("emperor's " + demo.getName());
        System.out.println("b no cache " + System.currentTimeMillis());
        return d;
    }

    @Cacheable(value = "c", key = "#demo.id +':'+ #demo.name", cacheManager = "redisCacheManager", sync = true)
    public Demo getEntity3(Demo demo) {
        Demo d = new Demo();
        d.setId(demo.getId() + 3L);
        d.setName("emperor's " + demo.getName());
        System.out.println("c no cache " + System.currentTimeMillis());
        return d;
    }
}
