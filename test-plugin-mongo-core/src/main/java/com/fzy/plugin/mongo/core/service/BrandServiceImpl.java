package com.fzy.plugin.mongo.core.service;

import com.fzy.plugin.mongo.core.model.Brand;
import io.github.fengzaiyao.plugin.mongo.core.service.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl extends BaseServiceImpl<Brand, String> implements IBrandService {
}