package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.bean.Animal;
import com.example.demo.repository.Animalrepo;


@Controller
public class AnimalController {

	@Autowired
	private Animalrepo animalRepo;
	@GetMapping("/")
	public String home() {
		return "index.jsp";
	}
	@GetMapping("/add")
	public String register() {
		return "add.jsp";
	}
	@GetMapping("/edit")
	public String update() {
		return "edit.jsp";
	}
	@PostMapping("/saveAnimalData")
	@ResponseBody
	public String saveData(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("Category") String Category,
			@RequestParam("Description")String Description,@RequestParam("life_span")String life_span)
	{
		Animal Animal=new Animal(id,name,Category,Description,life_span);
		Animal An1= animalRepo.save(Animal);
		System.out.println("An1");
     return "Data save sucessfully";
}
}
