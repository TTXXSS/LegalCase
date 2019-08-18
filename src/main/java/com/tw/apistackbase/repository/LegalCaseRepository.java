package com.tw.apistackbase.repository;

import com.tw.apistackbase.mode.LegalCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LegalCaseRepository extends JpaRepository<LegalCase,Long> {
    @Query(value = "select t from LegalCase t where t.name=?1")
    List<LegalCase> findByName( String name);

    @Query(value="select t from LegalCase t order by t.time DESC")
    List<LegalCase> findAllOrderByTime();

}
