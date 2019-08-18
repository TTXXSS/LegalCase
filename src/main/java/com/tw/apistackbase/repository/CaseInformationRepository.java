package com.tw.apistackbase.repository;

import com.tw.apistackbase.mode.CaseInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseInformationRepository extends JpaRepository<CaseInformation,Long> {
}
