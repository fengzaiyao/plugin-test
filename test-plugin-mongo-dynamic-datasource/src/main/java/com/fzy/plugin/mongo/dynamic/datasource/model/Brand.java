package com.fzy.plugin.mongo.dynamic.datasource.model;

import io.github.fengzaiyao.plugin.mongo.core.model.BaseEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("brand")
public class Brand extends BaseEntity {

    private String name;

    private Integer number;
}
