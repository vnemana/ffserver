package com.mahesh.ffserver.db;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HoldingRepository extends CrudRepository<Holding, Integer> {
    List<Holding> findByFundId(int fundId);
    List<Holding> findByFilingId(int filingId);
}
