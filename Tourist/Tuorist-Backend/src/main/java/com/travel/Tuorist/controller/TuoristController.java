package com.travel.Tuorist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.Tuorist.Model.TuoristModel;
import com.travel.Tuorist.Service.TuoristService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/pass")
public class TuoristController {
	
	@Autowired
	TuoristService TService;
	@GetMapping("/passengers")
	public List<TuoristModel>getPass()
	{
		return TService.display();
	}
	@PostMapping("/add")
	public void addPass(@RequestBody TuoristModel pass)
	{
		
		 TService.Add(pass);
		
	}
	@GetMapping("/sort")
	public List<TuoristModel> findAllOrderByNameDesc()
	{
		
		return TService.findAllOrderByNameDesc();
	}
	@PutMapping("/update/{id}")
	public void update(@PathVariable("id")int id ,@RequestBody TuoristModel pass)
	{
		TService.update(id,pass);
	}

}
