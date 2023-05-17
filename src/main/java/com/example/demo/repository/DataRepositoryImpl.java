package com.example.demo.repository;

import com.example.demo.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;


@Repository

public class DataRepositoryImpl implements DataRepository{

    @Autowired
    private final MongoTemplate mongoTemplate;

    public DataRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public ArrayList<Data> getAllData() {
        return (ArrayList<Data>) mongoTemplate.findAll(Data.class);
    }

    @Override
    public Data saveData(Data data){
        return mongoTemplate.save(data);
    }
}
