package ibmtal.trendyol.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import ibmtal.trendyol.business.services.OptionsService;
import ibmtal.trendyol.business.services.UserService;
import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.dto.MyAccountAddDto;
import ibmtal.trendyol.dto.OptionsAddDto;
import ibmtal.trendyol.entity.MyAccount;
import ibmtal.trendyol.entity.Options;
import ibmtal.trendyol.entity.User;

@RestController
@RequestMapping("/api/OptionsController")
public class OptionsController {
	private OptionsService optionsService;
	@Autowired
public OptionsController(OptionsService optionsService) {
		super();
		this.optionsService = optionsService;
	}

@PostMapping("/add")
public Result<OptionsService> addOptions(@RequestBody Options options) {
	return this.optionsService.addOptions(options);
	
}
@PostMapping("/adduser")
public Result<Options> addOptions(@RequestBody Options options) {
	return this.optionsService.addOptionsDto(OptionsAddDto);
}
}