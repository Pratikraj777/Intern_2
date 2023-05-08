package com.pratik.irda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pratik.irda.repo.PaymentOfClaimsRepo;


@Controller
public class PaymentOfClaimsController {

	@Autowired
	private PaymentOfClaimsRepo claimsRepo;
	
	@GetMapping("/irda/paymentStatus/report/<month>/<year> ")
	public 
}
