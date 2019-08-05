package com.apallapu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.apallapu.model.Account;
import com.apallapu.service.AccountService;

@RestController
public class AccountController {
        int a;
	@Autowired
	AccountService accountService;

	@GetMapping("/account/{id}")
	public Account getAccount(@PathVariable Long id) {

		return accountService.getAccount(id);
	}

}
