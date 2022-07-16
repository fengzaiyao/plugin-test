package com.fzy.plugin.mongo.dynamic.datasource.service;

import com.fzy.plugin.mongo.dynamic.datasource.model.Brand;
import io.github.fengzaiyao.plugin.mongo.core.service.BaseServiceImpl;
import io.github.fengzaiyao.plugin.mongo.dynamic.annotation.DataSource;
import org.springframework.stereotype.Service;

@Service
@DataSource("DS1")
public class BrandServiceImpl extends BaseServiceImpl<Brand, String> implements IBrandService {
}