package com.fzy.plugin.mongo.core;

import com.fzy.plugin.mongo.core.model.Brand;
import com.fzy.plugin.mongo.core.service.IBrandService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.annotation.Resource;

@SpringBootTest
public class MongoBootCoreTestApplication {

    @Resource
    private IBrandService brandService;

    @Resource
    private MongoTemplate mongoTemplate;

    @Test
    public void TestMongoEQ() {
        System.out.println(brandService.getMongoTemplate() == mongoTemplate);
    }

    @Test
    public void TestMongoOperation() {
        Brand brand = brandService.findById("123");
        System.out.println(brand);
        System.out.println("--> "+brandService.getMongoTemplate());
    }
}
