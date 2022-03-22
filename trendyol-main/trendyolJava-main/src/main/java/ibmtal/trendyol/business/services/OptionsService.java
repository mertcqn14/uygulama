package ibmtal.trendyol.business.services;

import java.util.ArrayList;

import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.entity.Options;


public interface OptionsService {
	ArrayList<OptionsService> getAll();
	 Result<OptionsService> addOptions(Options options);
	 Result<OptionsService> addOptionsDto(Options options);
	

	
	 Result<OptionsService> getOptionsr(Integer id);
}
