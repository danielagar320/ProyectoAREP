package com.example.demo.service;



import com.example.demo.repository.DataRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.example.demo.model.Data;

@Service
public class DataServiceImpl implements DataService{

    @Autowired
    DataRepositoryImpl dataRepository;

    @Override
    public ArrayList<Data> getAllData(){
        return dataRepository.getAllData();
    }

    @Override
    public Data saveData(Data data){
        return dataRepository.saveData(data);
    }

}
