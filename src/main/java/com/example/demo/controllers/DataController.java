package com.example.demo.controllers;


import com.example.demo.model.Data;
import com.example.demo.service.DataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/cancer")
public class DataController {

    @Autowired
    DataServiceImpl dataService;

    @PostMapping("/data")
    public String receiveData(@RequestBody Data data) {
        return "Datos recibidos correctamente";
    }

    @GetMapping
    public ArrayList<Data> getAllData(){
        return dataService.getAllData();
    }



}
