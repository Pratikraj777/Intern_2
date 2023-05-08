package com.pratik.irda.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratik.irda.entities.PendingStatusReport;

public interface PendingStatusReportRepo extends JpaRepository<PendingStatusReport, Integer> {

}
