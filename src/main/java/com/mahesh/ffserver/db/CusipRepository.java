package com.mahesh.ffserver.db;

import org.springframework.data.repository.CrudRepository;

public interface CusipRepository extends CrudRepository<Cusip, Integer> {
    Cusip findByStock(String stock);
}
