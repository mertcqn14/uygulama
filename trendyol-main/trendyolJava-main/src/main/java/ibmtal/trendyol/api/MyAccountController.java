package ibmtal.trendyol.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.trendyol.business.services.MyAccountService;
import ibmtal.trendyol.business.services.UserService;
import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.dto.MyAccountAddDto;
import ibmtal.trendyol.dto.UserAddDto;
import ibmtal.trendyol.entity.MyAccount;
import ibmtal.trendyol.entity.User;

@RestController
@RequestMapping("/api/MyAccountController")
public class MyAccountController {
	private MyAccountService MyAccountService;
	@Autowired
		public MyAccountController(MyAccountService myAccountService) {
			super();
			this.MyAccountService = MyAccountService;
		}
	@PostMapping("/add")
	public Result<MyAccount> addMyAccount(@RequestBody MyAccount myAccount) {
		return this.MyAccountService.addMyAccount(myAccount);
		
	}
	@PostMapping("/adduser")
	public Result<MyAccount> addMyAccount(@RequestBody MyAccountAddDto myAccountAddDto) {
		return this.MyAccountService.addMyAccountDto(myAccountAddDto);
	}
}