package ibmtal.trendyol.business.managers;

import java.util.ArrayList;


import org.springframework.stereotype.Service;

import ibmtal.trendyol.business.services.OptionsService;
import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.entity.Options;

@Service
public class OptionsManager implements OptionsService{
	private OptionsManager optionsManager;

	public OptionsManager(OptionsManager optionsManager) {
		super();
		this.optionsManager = optionsManager;
	}

	@Override
	public ArrayList<OptionsService> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<OptionsService> addOptions(Options options) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<OptionsService> addOptionsDto(Options options) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<OptionsService> getOptionsr(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
