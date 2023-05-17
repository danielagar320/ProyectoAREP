package com.example.demo.repository;

import com.example.demo.model.Data;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface DataRepository {

    public ArrayList<Data> getAllData();

    public Data saveData(Data data);


}
