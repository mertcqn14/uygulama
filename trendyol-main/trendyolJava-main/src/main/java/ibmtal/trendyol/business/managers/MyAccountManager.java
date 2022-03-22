package ibmtal.trendyol.business.managers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.trendyol.business.services.MyAccountService;
import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.database.MyAccountDao;
import ibmtal.trendyol.dto.MyAccountAddDto;
import ibmtal.trendyol.entity.MyAccount;

@Service
public class MyAccountManager implements MyAccountService{
	private MyAccountDao myAccountDao;
	@Autowired
	public MyAccountManager(MyAccountDao myAccountDao) {
		super();
		this.myAccountDao = myAccountDao;
	}
	@Override
	public ArrayList<MyAccount> getAll() {
		
		return new ArrayList<MyAccount>(this.myAccountDao.findAll());
	}
	@Override
	public Result<MyAccount> addMyAccount(MyAccount myaccount) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Result<MyAccount> addMyAccountDto(MyAccountAddDto myaccountAddDto) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Result<MyAccount> getMyAccount(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
