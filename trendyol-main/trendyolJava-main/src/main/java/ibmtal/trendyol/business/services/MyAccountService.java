package ibmtal.trendyol.business.services;

import java.util.ArrayList;

import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.dto.MyAccountAddDto;

import ibmtal.trendyol.entity.MyAccount;


public interface MyAccountService {
	ArrayList<MyAccount> getAll();
	 Result<MyAccount> addMyAccount(MyAccount myaccount);
	 Result<MyAccount> addMyAccountDto(MyAccountAddDto myaccountAddDto);
	Result<MyAccount> getMyAccount(Integer id);
	 
	 
}
