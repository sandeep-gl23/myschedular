package com.example.myschedular.service;

import com.example.myschedular.configuration.SchedulerConfig;
import com.example.myschedular.model.Model;
import com.example.myschedular.repository.MyRepository;
 import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


@Service
public class Myservice {
    @Autowired
    MyRepository myRepository;

    @Autowired
    SchedulerConfig schedulerConfig;

    private static final Logger logger =  LoggerFactory.getLogger(Model.class);

    @Scheduled(cron = "#{schedulerConfig.cron}")
    public void updateField() {
        List<Model> model=myRepository.findAll();

        Model updated_model;

        if(!model.isEmpty()){
            updated_model=model.get(0);
            updated_model.setCounter(updated_model.getCounter()+1);
            updated_model.setLast_updated(new Date());
             myRepository.save(updated_model);

            logger.info("Field Updated successfully");

        }


    }

    public void addData(Model model) {
        myRepository.save(model);
    }
}
