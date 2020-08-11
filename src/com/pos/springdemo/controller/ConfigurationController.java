package com.pos.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pos.springdemo.entity.Configuration;
import com.pos.springdemo.service.ConfigService;

@Controller
@RequestMapping("/configuration")
public class ConfigurationController {

	@Autowired
	private ConfigService configS;
	

	@RequestMapping("/")
	public String getConfs(Model theModel) {
		
		List<Configuration> Conf = configS.getConfigurations();
		
		theModel.addAttribute("configurations", Conf);
		
		return "Configurations/index-config";
	}
	
	@RequestMapping("/form")
	public String createConf(Model theModel) {
		
		Configuration theConf = new Configuration();
		
		theModel.addAttribute("Config", theConf);
		
		return "Configurations/form-config";
	}
	
	
	@RequestMapping("/save")
	public String saveConf(@ModelAttribute("config") Configuration newConfig) {
		
		configS.saveConfiguration(newConfig);
		
		return "Configurations/index-config";
	}
	
	@RequestMapping("/edit/${id}")
	public String editConf(Model theModel) {
		
		
		
		return null;
	}
	
	@RequestMapping("/delete/${id}")
	public String deleateConf(Model theModel) {
		
		
		
		return null;
	}
	
	
}
