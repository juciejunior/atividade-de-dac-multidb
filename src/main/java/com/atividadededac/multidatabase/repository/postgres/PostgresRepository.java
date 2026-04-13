package com.atividadededac.multidatabase.repository.postgres;

import com.atividadededac.multidatabase.model.DataModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostgresRepository extends JpaRepository<DataModel, String> {
}
