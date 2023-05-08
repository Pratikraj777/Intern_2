package com.pratik.irda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pratik.irda.repo.PendingStatusReportRepo;

@Controller
public class PendingStatusReportController {
	
	@Autowired
	private PendingStatusReportRepo pendingRepo;
	
	@GetMapping("/irda/claimStatus/report/<month>/<year> ")
	public List<PendingStatusReport>  {}
	
	
	
}
