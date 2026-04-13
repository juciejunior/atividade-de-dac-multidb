package com.atividadededac.multidatabase.repository.mongo;

import com.atividadededac.multidatabase.model.DataModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyMongoRepository extends MongoRepository<DataModel, String> {
}
