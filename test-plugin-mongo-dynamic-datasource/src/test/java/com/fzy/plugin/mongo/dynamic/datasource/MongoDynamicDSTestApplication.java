package com.fzy.plugin.mongo.dynamic.datasource;

import com.fzy.plugin.mongo.dynamic.datasource.service.IBrandService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.annotation.Resource;

@SuppressWarnings("all")
@SpringBootTest
public class MongoDynamicDSTestApplication {

    @Resource
    private IBrandService brandService;

    @Resource
    private MongoTemplate mongoTemplate;

    @Resource(name = "DS1")
    private MongoTemplate mongoTemplateDS1;

    @Resource(name = "DS2")
    private MongoTemplate mongoTemplateDS2;

    @Test
    public void TestMongo() {
        System.out.println(brandService.getMongoTemplate());
        System.out.println(mongoTemplate);
        System.out.println(mongoTemplateDS1);
        System.out.println(mongoTemplateDS2);
    }
}
