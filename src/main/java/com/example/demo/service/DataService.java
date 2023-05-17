package com.example.demo.service;

import com.example.demo.controllers.DataController;
import com.example.demo.model.Data;

import java.util.ArrayList;

public interface DataService {

    public ArrayList<Data> getAllData();

    public Data saveData(Data data);
}
