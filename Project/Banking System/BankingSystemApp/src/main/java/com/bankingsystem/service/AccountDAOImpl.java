package com.bankingsystem.service;

import com.bankingsystem.model.Account;
import com.bankingsystem.repositoty.AccountDao;

public class AccountDAOImpl implements AccountDao {

	@Override
	public void createAccount(Account account) {
		CreateAccount.createAccount(account);
	}

	@Override
	public void readAccount(int accno) {
		ReadAccount.readAccount(accno);
	}

	@Override
	public void updateAccount(int acno, Account a) {
		UpdateAccount.updateAccount(acno, a);
	}

	@Override
	public void deleteAccount(int accno) {
		DeleteAccount.deleteAccount(accno);
	}

	@Override
	public void withdrawAmount(int accno, long wamnt) {
		WithdrawAmount.withdrawAmount(accno, wamnt);
	}

	@Override
	public void depositAmount(int accno, long damnt) {
		DepositAmount.depositAmount(accno, damnt);
	}

	@Override
	public void fixedDeposit(int year, int amnt) {
		FixedDeposite.fixedDeposit(year, amnt);
	}

}
