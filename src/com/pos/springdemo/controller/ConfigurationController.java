package com.pos.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		
		return "redirect:/configuration/";
	}
	
	@GetMapping("/edit")
	public String editConf(@RequestParam("id") int id, Model theModel) {
		Configuration theConf = configS.getConfiguration(id);
		
		theModel.addAttribute("Config", theConf);
		
		return "Configurations/form-config";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleateConf(@PathVariable("id") int id, Model theModel) {

		Configuration theConf = configS.getConfiguration(id);
		
		configS.deleteConfiguration(theConf);
		
		return "redirect:/configuration/";
	}
	
	
}
