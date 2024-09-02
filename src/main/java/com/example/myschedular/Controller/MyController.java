package com.example.myschedular.Controller;

import com.example.myschedular.model.Model;
import com.example.myschedular.repository.MyRepository;
import com.example.myschedular.service.Myservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    Myservice myservice;

    @PostMapping()
    public void addData(@RequestBody Model model)
    {
        myservice.addData(model);
    }
}
