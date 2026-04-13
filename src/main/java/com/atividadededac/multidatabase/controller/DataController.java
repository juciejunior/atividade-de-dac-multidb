package com.atividadededac.multidatabase.controller;

import com.atividadededac.multidatabase.model.DataModel;
import com.atividadededac.multidatabase.repository.mongo.MyMongoRepository;
import com.atividadededac.multidatabase.repository.postgres.PostgresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dados")

public class DataController {
    @Autowired
    private PostgresRepository postgresRepository;

    @Autowired
    private MyMongoRepository mongoRepository;

    @PostMapping
    public DataModel salvarDados(@RequestBody DataModel data){

        postgresRepository.save(data);
        mongoRepository.save(data);

        return data;
    }
}
