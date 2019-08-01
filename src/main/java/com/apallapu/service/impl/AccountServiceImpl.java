package com.apallapu.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.apallapu.model.Account;
import com.apallapu.service.AccountService;

@Service
@CacheConfig(cacheNames = { "account" })
public class AccountServiceImpl implements AccountService {

	private static final Logger LOG = LoggerFactory.getLogger(AccountServiceImpl.class);

	@Cacheable(unless = "#result == null")
	@Override
	public Account getAccount(Long accountId) {
		LOG.info("Trying to get Account information for id {} ", accountId);
		return getAccountData(accountId);
	}

	private Account getAccountData(final Long id) {
		Account account = new Account(id, "testemail@test.com", "Test Account");
		return account;
	}
}
